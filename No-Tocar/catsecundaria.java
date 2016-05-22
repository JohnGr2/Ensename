import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class catsecundaria extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public TextView cattx;
    //public TextView b;
    private ProgressDialog pDialog;

    // Creating JSON Parser object
    JSONParser jParser = new JSONParser();

    ArrayList<HashMap<String, String>> empresaList;

    // url to get all products list
    private static String url_all_empresas="http://ense.netne.net/ramiroconnect/get_all_alfabeto.php";
    //private static String url_all_empresas="http://ense.youhosting.info/ramiroconnect/get_all_alfabeto.php";
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_PRODUCTS = "empresas";
    private static final String TAG_ID = "id";
    private static final String TAG_WORD = "word";

    // products JSONArray
    JSONArray products = null;

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catsecundaria);
        // Hashmap para el ListView
        empresaList = new ArrayList<HashMap<String, String>>();

        // Cargar los productos en el Background Thread
        new LoadAllProducts().execute();
        lista = (ListView) findViewById(R.id.listAllPal);
        lista.setOnItemClickListener(this);
        cattx = (TextView) findViewById (R.id.cattx);
        Bundle parametros=getIntent().getExtras();
        if (parametros !=null){

            cattx.setText(parametros.getString("Categorias"));
        }
        String a=cattx.getText().toString();

        switch (a){
            case "Alfabeto":
                final String url_all_empresas15 = "http://ense.netne.net/ramiroconnect/get_all_alfabeto.php";
                //final String url_all_empresas15 = "http://ense.youhosting.info/ramiroconnect/get_all_alfabeto.php";
                String z = url_all_empresas15;
                url_all_empresas=z;
                break;
            case "Alimento":
                final String url_all_empresas5 = "http://ense.netne.net/ramiroconnect/get_all_frutas.php";
                //final String url_all_empresas5 = "http://ense.youhosting.info/ramiroconnect/get_all_alimento.php";
                String f = url_all_empresas5;
                url_all_empresas=f;
                break;
            case "Animales":
                final String url_all_empresas2 = "http://ense.netne.net/ramiroconnect/get_all_animales.php";
                //final String url_all_empresas2 = "http://ense.youhosting.info/ramiroconnect/get_all_animales.php";
                String c = url_all_empresas2;
                url_all_empresas=c;
                break;
            case "Colores":
                final String url_all_empresas3 = "http://ense.netne.net/ramiroconnect/get_all_colores.php";
                //final String url_all_empresas3 = "http://ense.youhosting.info/ramiroconnect/get_all_colores.php";
                String d = url_all_empresas3;
                url_all_empresas=d;
                break;
            case "Cotidiano":
                final String url_all_empresas4 = "http://ense.netne.net/ramiroconnect/get_all_cotidiano.php";
                //final String url_all_empresas4 = "http://ense.youhosting.info/ramiroconnect/get_all_cotidiano.php";
                String e = url_all_empresas4;
                url_all_empresas=e;
                break;
            case "Escuela y Trabajo":
                final String url_all_empresas10 = "http://ense.netne.net/ramiroconnect/get_all_trabajo.php";
                //final String url_all_empresas10 = "http://ense.youhosting.info/ramiroconnect/get_all_trabajo.php";
                String l = url_all_empresas10;
                url_all_empresas=l;
                break;
            case "Hogar":
                final String url_all_empresas6 = "http://ense.netne.net/ramiroconnect/get_all_hogar.php";
                //final String url_all_empresas6 = "http://ense.youhosting.info/ramiroconnect/get_all_trabajo.php";
                String g = url_all_empresas6;
                url_all_empresas=g;
                break;
            case "Meses":
                final String url_all_empresas7 = "http://ense.netne.net/ramiroconnect/get_all_meses.php";
                //final String url_all_empresas7 = "http://ense.youhosting.info/ramiroconnect/get_all_meses.php";
                String h = url_all_empresas7;
                url_all_empresas=h;
                break;
            case "Números":
                final String url_all_empresas1 = "http://ense.netne.net/ramiroconnect/get_all_numeros.php";
                //final String url_all_empresas1 = "http://ense.youhosting.info/ramiroconnect/get_all_numeros.php";
                String b = url_all_empresas1;
                url_all_empresas=b;
               break;
            case "Paises":
                final String url_all_empresas8 = "http://ense.netne.net/ramiroconnect/get_all_paises.php";
                //final String url_all_empresas8 = "http://ense.youhosting.info/ramiroconnect/get_all_paises.php";
                String i = url_all_empresas8;
                url_all_empresas=i;
                break;
            case "Saludos y Despedidas":
                final String url_all_empresas0 = "http://ense.netne.net/ramiroconnect/get_all_saludos.php";
                //final String url_all_empresas0 = "http://ense.youhosting.info/ramiroconnect/get_all_saludos.php";
                String k = url_all_empresas0;
                url_all_empresas=k;
                break;
            case "Viajes":
                final String url_all_empresas12 = "http://ense.netne.net/ramiroconnect/get_all_viajes.php";
                //final String url_all_empresas12 = "http://ense.youhosting.info/ramiroconnect/get_all_viajes.php";
                String n = url_all_empresas12;
                url_all_empresas=n;
                break;
        }
        //String car = b.getText().toString();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        })*/;
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
        String word = map.get(TAG_WORD);
        Intent nuevaventana = new Intent(catsecundaria.this,cattfinal.class);
        nuevaventana.putExtra("Palabras",word);
        startActivity(nuevaventana);
    }


    class LoadAllProducts extends AsyncTask<String, String, String> {

        /**
         * Antes de empezar el background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(catsecundaria.this);
            pDialog.setMessage("Cargando. Por favor espere...");
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
                        String id = c.getString(TAG_ID);
                        String name = c.getString(TAG_WORD);

                        // creating new HashMap
                        HashMap map = new HashMap();

                        // adding each child node to HashMap key => value
                        map.put(TAG_ID, id);
                        map.put(TAG_WORD, name);

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
                            catsecundaria.this,
                            empresaList,
                            R.layout.single_post,
                            new String[] {
                                    TAG_ID,
                                    TAG_WORD,
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
}
