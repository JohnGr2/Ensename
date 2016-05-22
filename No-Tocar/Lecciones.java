import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telecom.VideoProfile;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.VideoView;

import com.koushikdutta.ion.Ion;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


//Se cambio el AppCompactActivity
public class Lecciones extends AppCompatActivity implements AdapterView.OnItemClickListener{
    /*private static String APP_TAG = "ECTDownloadData";
    private static String IMG_URL = "http://49.media.tumblr.com/0d5ed85f652a0dd357d66221a0cb04e7/tumblr_nyxrlsrDsI1s5f7v4o1_1280.gif";
    public Button btnDownload;
    public ImageView mImageView; //video*/
    private ProgressDialog pDialog;

    // Creating JSON Parser object
    JSONParser jParser = new JSONParser();

    ArrayList<HashMap<String, String>> empresaList;


    // url to get all products list
    private static String url_all_empresas = "http://ense.netne.net/ramiroconnect/get_all_cat.php";
    //private static String url_all_empresas = "http://ense.youhosting.info/ramiroconnect/get_all_cat.php"; OTRA BD
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_PRODUCTS = "empresas";
    private static final String TAG_IDCATEGORIA = "idcategoria";
    private static final String TAG_CAT = "cat";

    JSONArray products = null;

    ListView lista;
    //prueba con JOHN
    GridView gv;
public static String [] LeccionNameList={"Alfabeto","Alimento", "Animales","Colores","Cotidiano","Escuela y Trabajo","Hogar","Meses","Números","Países","Saludos y Despedidas", "Viajes"};
    public  static  int[] LeccionImages={R.drawable.alfabeto,R.drawable.alimento,R.drawable.animales,R.drawable.colores,R.drawable.cotidiano,R.drawable.escuela,R.drawable.hogar,R.drawable.meses,R.drawable.numeros,R.drawable.paises,R.drawable.saludos,R.drawable.viajes};
//AQUI NECESITO TRABAJAR


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecciones);

        // Hashmap para el ListView
        empresaList = new ArrayList<HashMap<String, String>>();

        // Cargar los productos en el Background Thread
        ConnectivityManager cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if (nInfo!=null && nInfo.isConnected()){
            //Toast.makeText(this, "Network is available", Toast.LENGTH_LONG).show();
            new LoadAllProducts().execute();
            //gv=(GridView) findViewById(R.id.gridView1);
            //gv.setAdapter(new CustomAdapter(this,LeccionNameList,LeccionImages));
           lista = (ListView) findViewById(R.id.listAllProducts);
            lista.setOnItemClickListener(this);

        }
        else {
            Toast.makeText(this,"No hay conexión a Internet disponible", Toast.LENGTH_LONG).show();
            this.finish();
        }

        /*new LoadAllProducts().execute(); POR SI SE PIERDE
        lista = (ListView) findViewById(R.id.listAllProducts);
        lista.setOnItemClickListener(this);*/


        /*btnDownload = (Button) findViewById (R.id.btnDownload);
        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(APP_TAG, "btnDownload onClick was triggered");
                new DownloadImageTask().execute(IMG_URL);
            }
        });*/
        //mImageView = (ImageView) findViewById(R.id.mImageView);//video
        //Ion.with(mImageView).load("http://49.media.tumblr.com/0d5ed85f652a0dd357d66221a0cb04e7/tumblr_nyxrlsrDsI1s5f7v4o1_1280.gif");

        /*@Override
        public boolean onCreateOptionsMenu(Menu menu) {
                   // Inflate the menu; this adds items to the action bar if it is present.
                   getMenuInflater().inflate(R.menu.menu_main, menu);
                   return true;
               }*/
       /* @Override
        public boolean onOptionsItemSelected(MenuItem item) {
                   // Handle action bar item clicks here. The action bar will
                   // automatically handle clicks on the Home/Up button, so long
                   // as you specify a parent activity in AndroidManifest.xml.
                   int id = item.getItemId();
                    if (id == R.id.action_settings) {
                           return true;
                        }
                   return super.onOptionsItemSelected(item);
        }*/Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        HashMap<String,String>map=(HashMap<String,String>)lista.getItemAtPosition(position);
        String cat = map.get(TAG_CAT);
        Intent nuevaventana = new Intent(Lecciones.this,catsecundaria.class);
        nuevaventana.putExtra("Categorias",cat);
        startActivity(nuevaventana);
    }


    class LoadAllProducts extends AsyncTask<String, String, String> {

        /**
         * Antes de empezar el background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(Lecciones.this);
            pDialog.setMessage("Cargando Lecciones. Por favor espere...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();
        }

        /**
         * obteniendo todos los productos
         * */
        protected String doInBackground(String... args) {
            // Building Parameters
            List params = new ArrayList();
            // getting JSON string from URL
            JSONObject json = jParser.makeHttpRequest(url_all_empresas, "GET", params);

            // Check your log cat for JSON reponse
            Log.d("All Products: ", json.toString());

            try {
                // Checking for SUCCESS TAG
                int success = json.getInt(TAG_SUCCESS);

                if (success == 1) {
                    // products found
                    // Getting Array of Products
                    products = json.getJSONArray(TAG_PRODUCTS);

                    // looping through All Products
                    //Log.i("ramiro", "produtos.length" + products.length());
                    for (int i = 0; i < products.length(); i++) {
                        JSONObject c = products.getJSONObject(i);

                        // Storing each json item in variable
                        String id = c.getString(TAG_IDCATEGORIA);
                        String name = c.getString(TAG_CAT);

                        // creating new HashMap
                        HashMap map = new HashMap();

                        // adding each child node to HashMap key => value
                        map.put(TAG_IDCATEGORIA, id);
                        map.put(TAG_CAT, name);

                        empresaList.add(map);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        /**
         * After completing background task Dismiss the progress dialog
         * **/
        protected void onPostExecute(String file_url) {
            // dismiss the dialog after getting all products
            pDialog.dismiss();
            // updating UI from Background Thread
            runOnUiThread(new Runnable() {
                public void run() {
                    /**
                     * Updating parsed JSON data into ListView
                     * */
                    ListAdapter adapter = new SimpleAdapter(
                            Lecciones.this,
                            empresaList,
                            R.layout.single_post,
                            new String[] {
                                    TAG_IDCATEGORIA,
                                    TAG_CAT,
                            },
                            new int[] {
                                    R.id.single_post_tv_id,
                                    R.id.single_post_tv_nombre,
                            });
                    // updating listview
                    //setListAdapter(adapter);

                    lista.setAdapter(adapter);

                }
            });
        }
    }

    private class DownloadImageTask extends AsyncTask<String, Integer, Bitmap> {
        /** El sistema Android ejecuta las sentencias del método doInBackground
         69.    	    * en fondo a traves de un un Worker thread y le pasa los parámetros en la llamada
         70.    	    * al método AsyncTask.execute()*/
        @Override
        protected Bitmap doInBackground(String... urls) {
            return downloadImagen(urls[0]);
        }

        /** El sistema Android llama a este método para realizar los trabajos necesarios
         77.	      * en el UI thread y le entrega el resultado obtenido de la ejecución realizada
         78.	      * en el método doInBackground() */
        protected void onPostExecute(Bitmap result) {
            //Ya aquí estamos en el UI Thread o Main Thread por lo que podemos actualizar la
            //imagen del Image View para mostrala la imagen descargada
            //mImageView.setImageBitmap(result);
        }

        private Bitmap downloadImagen(String baseUrl) {
            Bitmap myBitmap = null;
            try
            {
                //Se define el objeto URL
                URL url = new URL(baseUrl);
                //Se arma y configura un objeto de conexión HttpURLConnection
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                //Recibimos la respuesta de la petición en formato InputStream
                InputStream input = connection.getInputStream();
                //Decodificamos el InputStream a un objeto BitMap
                myBitmap = BitmapFactory.decodeStream(input);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return myBitmap;
        }
    }
}
