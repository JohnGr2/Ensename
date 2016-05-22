import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class cattfinal extends AppCompatActivity {
    public TextView pal2;
    private static String APP_TAG2 = "ECTDownloadData";
    public Button btnDownload2;
    public ImageView mImageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cattfinal);
        pal2 = (TextView) findViewById (R.id.pal2);
        btnDownload2 = (Button) findViewById (R.id.btnDownload2);
        mImageView2 = (ImageView) findViewById(R.id.mImageView2);
        Bundle parametros=getIntent().getExtras();
        if (parametros !=null){

            pal2.setText(parametros.getString("Palabras"));
        }
        String a=pal2.getText().toString();

        switch (a){

            case "Cuatro":
                final String IMG_URL  = "http://2.bp.blogspot.com/-Prx63WTQn-Q/UvO2Y2n9t1I/AAAAAAAAABY/OawAyZqWVSU/s1600/estudiar-bootstrapping.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL);
                    }
                });
                break;
            case "Doctor":
                final String IMG_URL2 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL2);
                    }
                });
                break;
            case "A":
                final String IMG_URL3 = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/a.jpg";
                //final String IMG_URL3 = "http://ense.youhosting.info/ramiroconnect/uploads/alfabeto/a.jpg";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL3);
                    }
                });
                break;
            case "B":
                final String IMG_URL14  = "";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL14);
                    }
                });
                break;
            case "C":
                final String IMG_URL15  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/c.jpg";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL15);
                    }
                });
                break;
            case "S":
                //ESTA ES OTRA MANERA DE HACER EL GIF!!!!!!!!!!!!!!!!
                Ion.with(mImageView2).load("http://ense.netne.net/ramiroconnect/uploads/alfabeto/s.gif");
                //final String IMG_URL16  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/s.gif";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        //new DownloadImageTask().execute(IMG_URL16);
                    }
                });
                break;
            case "Enero":
                final String IMG_URL4 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL4);
                    }
                });
            case "Hello":
                final String IMG_URL5 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL5);
                    }
                });
                break;
            case "Manzana":
                final String IMG_URL6 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL6);
                    }
                });
                break;
            case "Mesa":
                final String IMG_URL7 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL7);
                    }
                });
                break;
            case "Nariz":
                final String IMG_URL8 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL8);
                    }
                });
                break;
            case "Nicaragua":
                final String IMG_URL9 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL9);
                    }
                });
                break;
            case "Peinarse":
                final String IMG_URL0 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL0);
                    }
                });
                break;
            case "Perro":
                final String IMG_URL10 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL10);
                    }
                });
                break;
            case "Rojo":
                final String IMG_URL11 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL11);
                    }
                });
                break;
            case "Tomate":
                final String IMG_URL12 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL12);
                    }
                });
                break;
            case "Tren":
                final String IMG_URL13 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                btnDownload2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG2, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL13);
                    }
                });
                break;
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
            mImageView2.setImageBitmap(result);
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
