import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

//import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class prueba extends AppCompatActivity implements OnItemClickListener {

    // Progress Dialog
    private ProgressDialog pDialog;

    // Creating JSON Parser object
    JSONParser jParser = new JSONParser();

    ArrayList<HashMap<String, String>> empresaList;


    // url to get all products list
    private static String url_all_empresas = "http://ense.netne.net/ramiroconnect/get_all_empresas.php";
    //private static String url_all_empresas = "http://ense.youhosting.info/ramiroconnect/get_all_empresas.php"; LA OTRA BD

    // JSON Node names
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_PRODUCTS = "empresas";
    private static final String TAG_ID = "id";
    private static final String TAG_WORD = "word";

    // products JSONArray
    JSONArray products = null;
    ListView lista;
    //SearchView sv; PROBANDO BUSQUEDA
    //String urlAddress="http://ense.netne.net/ramiroconnect/searcher.php";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        // Hashmap para el ListView
        empresaList = new ArrayList<HashMap<String, String>>();

        // Cargar los productos en el Background Thread
        ConnectivityManager cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if (nInfo!=null && nInfo.isConnected()){
            new LoadAllProducts().execute();
            lista = (ListView) findViewById(R.id.listAllProducts);
           lista.setOnItemClickListener(this);
            /*sv=(SearchView) findViewById(R.id.sv); AQUI ESTOY PROBANDO LA BUSQUEDA
            sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    SenderReceiver sr = new SenderReceiver(prueba.this,urlAddress, lista);
                    sr.execute();
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String query) {
                    SenderReceiver sr = new SenderReceiver(prueba.this,urlAddress, lista);
                    sr.execute();
                    return false;
                }
            });*/
        }
        else {
            Toast.makeText(this, "No hay conexión a Internet disponible", Toast.LENGTH_LONG).show();
            this.finish();
        }
        /*new LoadAllProducts().execute(); POR SI SE PERDIA EL CODIGO.
        lista = (ListView) findViewById(R.id.listAllProducts);
        lista.setOnItemClickListener(this);*/
        
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }//fin onCreate
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
        Intent nuevaventana = new Intent(prueba.this,palabrasecundaria.class);
        nuevaventana.putExtra("Palabras", word);
        startActivity(nuevaventana);
    }

    class LoadAllProducts extends AsyncTask<String, String, String> {

        /**
         * Antes de empezar el background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(prueba.this);
            pDialog.setMessage("Cargando Palabras. Por favor espere...");
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
                            prueba.this,
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
