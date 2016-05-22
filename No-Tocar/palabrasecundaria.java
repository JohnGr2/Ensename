
import android.content.Intent;
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

public class palabrasecundaria extends AppCompatActivity {
public TextView pal;
    private static String APP_TAG = "ECTDownloadData";
    public Button btnDownload;
    public ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabrasecundaria);
        pal = (TextView) findViewById (R.id.pal);
        btnDownload = (Button) findViewById (R.id.btnDownload);
 mImageView = (ImageView) findViewById(R.id.mImageView);
        Bundle parametros=getIntent().getExtras();
        if (parametros !=null){

            pal.setText(parametros.getString("Palabras"));
        }
        String a=pal.getText().toString();

        switch (a){

            case "Estudiar":
             final String IMG_URL  = "http://2.bp.blogspot.com/-Prx63WTQn-Q/UvO2Y2n9t1I/AAAAAAAAABY/OawAyZqWVSU/s1600/estudiar-bootstrapping.png";
                        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(APP_TAG, "btnDownload onClick was triggered");
                new DownloadImageTask().execute(IMG_URL);
            }
        });
                break;
            case "A":
               //final String IMG_URL2 = "https://upload.wikimedia.org/wikipedia/commons/e/e2/Attention_dormir.png";
                //ESTA ES UNA FORMA DE MANDAR A LLAMAR UN GIF
                final String IMG_URL2 = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/a.jpg";
                Ion.with(mImageView).load(IMG_URL2);
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL2);
                    }
                });
                break;
            case "B":
                final String IMG_URL3  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL3);
                    }
                });
                break;
            case "C":
                final String IMG_URL4  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/c.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL4);
                    }
                });
                break;
            case "Ch":
                final String IMG_URL15  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL15);
                    }
                });
                break;
            case "D":
                final String IMG_URL7  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL7);
                    }
                });
            case "E":
                final String IMG_URL8  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL8);
                    }
                });
                break;
            case "F":
                final String IMG_URL9  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL9);
                    }
                });
                break;
            case "G":
                final String IMG_URL10  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL10);
                    }
                });
                break;
            case "H":
                final String IMG_URL11  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL11);
                    }
                });
                break;
            case "I":
                final String IMG_URL12  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL12);
                    }
                });
                break;
            case "J":
                final String IMG_URL13  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL13);
                    }
                });
                break;
            case "K":
                final String IMG_URL14  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL14);
                    }
                });
                break;
            case "L":
                final String IMG_URL16  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL16);
                    }
                });
                break;
            case "LL":
                final String IMG_URL17  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL17);
                    }
                });
                break;
            case "M":
                final String IMG_URL6  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/m.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL6);
                    }
                });
                break;
            case "N":
                final String IMG_URL18  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL18);
                    }
                });
                break;
            case "Ñ":
                final String IMG_URL19  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/%d1.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL19);
                    }
                });
                break;
            case "O":
                final String IMG_URL20  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL20);
                    }
                });
                break;
            case "P":
                final String IMG_URL21  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL21);
                    }
                });
                break;
            case "Q":
                final String IMG_URL22  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL22);
                    }
                });
                break;
            case "R":
                final String IMG_URL23  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL23);
                    }
                });
                break;
            case "S":
                final String IMG_URL5  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/s.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL5);
                    }
                });
                break;
            case "T":
                final String IMG_URL24  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL24);
                    }
                });
                break;
            case "U":
                final String IMG_URL25  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL25);
                    }
                });
                break;
            case "V":
                final String IMG_URL26  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL26);
                    }
                });
                break;
            case "W":
                final String IMG_URL27  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL27);
                    }
                });
                break;
            case "X":
                final String IMG_URL28  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL28);
                    }
                });
                break;
            case "Z":
                final String IMG_URL29  = "http://ense.netne.net/ramiroconnect/uploads/alfabeto/z.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL29);
                    }
                });
                break;
            case "Burro":
                final String IMG_URL30  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL30);
                    }
                });
                break;
            case "Culebra":
                final String IMG_URL31  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL31);
                    }
                });
                break;
            case "Mariposa":
                final String IMG_URL32  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL32);
                    }
                });
                break;
            case "Pájaro":
                final String IMG_URL33  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL33);
                    }
                });
                break;
            case "Pez":
                final String IMG_URL34  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL34);
                    }
                });
                break;
            case "Tortuga":
                final String IMG_URL35  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL35);
                    }
                });
                break;
            case "Amarillo":
                final String IMG_URL36  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL36);
                    }
                });
                break;
            case "Azul":
                final String IMG_URL37  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL37);
                    }
                });
                break;
            case "Blanco":
                final String IMG_URL38  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL38);
                    }
                });
                break;
            case "Morado":
                final String IMG_URL39  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL39);
                    }
                });
                break;
            case "Naranja":
                final String IMG_URL40  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL40);
                    }
                });
                break;
            case "Negro":
                final String IMG_URL41  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL41);
                    }
                });
                break;
            case "Rosado":
                final String IMG_URL42  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL42);
                    }
                });
                break;
            case "Verde":
                final String IMG_URL43  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL43);
                    }
                });
                break;
            case "¿Cuándo?":
                final String IMG_URL44  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL44);
                    }
                });
                break;
            case "Abierto":
                final String IMG_URL45  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL45);
                    }
                });
                break;
            case "Ahora":
                final String IMG_URL46  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL46);
                    }
                });
                break;
            case "Ala":
                final String IMG_URL47  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL47);
                    }
                });
                break;
            case "Alegre":
                final String IMG_URL48  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL48);
                    }
                });
                break;
            case "Atención":
                final String IMG_URL49  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL49);
                    }
                });
                break;
            case "Baboso":
                final String IMG_URL50  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL50);
                    }
                });
                break;
            case "Bañar":
                final String IMG_URL51  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL51);
                    }
                });
                break;
            case "Burla":
                final String IMG_URL52  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL52);
                    }
                });
                break;
            case "Caja":
                final String IMG_URL53  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL53);
                    }
                });
                break;
            case "Calor":
                final String IMG_URL54  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL54);
                    }
                });
                break;
            case "Caro":
                final String IMG_URL55  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL55);
                    }
                });
                break;
            case "Cerca":
                final String IMG_URL56  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL56);
                    }
                });
                break;
            case "Cerrar":
                final String IMG_URL57  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL57);
                    }
                });
                break;
            case "Comulgar":
                final String IMG_URL58  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL58);
                    }
                });
                break;
            case "Curioso":
                final String IMG_URL59  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL59);
                    }
                });
                break;
            case "Dale":
                final String IMG_URL60  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL60);
                    }
                });
                break;
            case "Dame":
                final String IMG_URL61  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL61);
                    }
                });
                break;
            case "Despacio":
                final String IMG_URL62  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL62);
                    }
                });
                break;
            case "Dormir":
                final String IMG_URL63  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL63);
                    }
                });
                break;
            case "Embarazada":
                final String IMG_URL64  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL64);
                    }
                });
                break;
            case "Enamorado/a":
                final String IMG_URL65  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL65);
                    }
                });
                break;
            case "Goma":
                final String IMG_URL66  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL66);
                    }
                });
                break;
            case "Gracias":
                final String IMG_URL67  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL67);
                    }
                });
                break;
            case "Grande":
                final String IMG_URL68  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL68);
                    }
                });
                break;
            case "Hablar":
                final String IMG_URL69  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL69);
                    }
                });
                break;
            case "Himno":
                final String IMG_URL70  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL70);
                    }
                });
                break;
            case "Hola":
                final String IMG_URL71  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL71);
                    }
                });
                break;
            case "Lavarse Las Manos":
                final String IMG_URL72  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL72);
                    }
                });
                break;
            case "Mal":
                final String IMG_URL73  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL73);
                    }
                });
                break;
            case "Mañana":
                final String IMG_URL74  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL74);
                    }
                });
                break;
            case "Mediano":
                final String IMG_URL75  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL75);
                    }
                });
                break;
            case "Mejor":
                final String IMG_URL76  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL76);
                    }
                });
                break;
            case "Menor":
                final String IMG_URL77  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL77);
                    }
                });
                break;
            case "Misa":
                final String IMG_URL78  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL78);
                    }
                });
                break;
            case "Morir":
                final String IMG_URL79  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL79);
                    }
                });
                break;
            case "Nacer":
                final String IMG_URL80  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL80);
                    }
                });
                break;
            case "No Importa":
                final String IMG_URL81  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL81);
                    }
                });
                break;
            case "Noche":
                final String IMG_URL82  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL82);
                    }
                });
                break;
            case "Normal":
                final String IMG_URL83  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL83);
                    }
                });
                break;
            case "Nunca":
                final String IMG_URL84  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL84);
                    }
                });
                break;
            case "Olvidar":
                final String IMG_URL85  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL85);
                    }
                });
                break;
            case "Papel Higienico":
                final String IMG_URL86  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL86);
                    }
                });
                break;
            case "Pasar":
                final String IMG_URL87  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL87);
                    }
                });
                break;
            case "Película":
                final String IMG_URL88  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL88);
                    }
                });
                break;
            case "Pelón":
                final String IMG_URL89  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL89);
                    }
                });
                break;
            case "Pequeño":
                final String IMG_URL90  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL90);
                    }
                });
                break;
            case "Pesado":
                final String IMG_URL91  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL91);
                    }
                });
                break;
            case "Polvo":
                final String IMG_URL92  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL92);
                    }
                });
                break;
            case "Por Favor":
                final String IMG_URL93  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL93);
                    }
                });
                break;
            case "Privado":
                final String IMG_URL94  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL94);
                    }
                });
                break;
            case "Promesa":
                final String IMG_URL95  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL95);
                    }
                });
                break;
            case "Saber":
                final String IMG_URL96  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL96);
                    }
                });
                break;
            case "Satisfecho":
                final String IMG_URL97  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL97);
                    }
                });
                break;
            case "Separado":
                final String IMG_URL98  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL98);
                    }
                });
                break;
            case "Tal Vez":
                final String IMG_URL99  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL99);
                    }
                });
                break;
            case "Temblor":
                final String IMG_URL100  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL100);
                    }
                });
                break;
            case "Traer":
                final String IMG_URL101  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL101);
                    }
                });
                break;
            case "Vómito":
                final String IMG_URL102  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL102);
                    }
                });
                break;
            case "Bebé":
                final String IMG_URL103  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL103);
                    }
                });
                break;
            case "Blusa":
                final String IMG_URL104  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL104);
                    }
                });
                break;
            case "Casa":
                final String IMG_URL105  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL105);
                    }
                });
                break;
            case "Cuarto":
                final String IMG_URL106  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL106);
                    }
                });
                break;
            case "Falda":
                final String IMG_URL107  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL107);
                    }
                });
                break;
            case "Hamaca":
                final String IMG_URL108  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL108);
                    }
                });
                break;
            case "Machete":
                final String IMG_URL109  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL109);
                    }
                });
                break;
            case "Mesa":
                final String IMG_URL110  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL110);
                    }
                });
                break;
            case "Nieto/a":
                final String IMG_URL111  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL111);
                    }
                });
                break;
            case "Patines":
                final String IMG_URL112  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL112);
                    }
                });
                break;
            case "Short":
                final String IMG_URL113  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL113);
                    }
                });
                break;
            case "Sombrero":
                final String IMG_URL115  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL115);
                    }
                });
                break;
            case "Traje De Baño":
                final String IMG_URL116  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL116);
                    }
                });
                break;
            case "Enero":
                final String IMG_URL117  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL117);
                    }
                });
                break;
            case "Febrero":
                final String IMG_URL118  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL118);
                    }
                });
                break;
            case "Marzo":
                final String IMG_URL119  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL119);
                    }
                });
                break;
            case "Abril":
                final String IMG_URL120  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL120);
                    }
                });
                break;
            case "Mayo":
                final String IMG_URL121  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL121);
                    }
                });
                break;
            case "Junio":
                final String IMG_URL122  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL122);
                    }
                });
                break;
            case "Julio":
                final String IMG_URL123  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL123);
                    }
                });
                break;
            case "Agosto":
                final String IMG_URL124  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL124);
                    }
                });
                break;
            case "Septiembre":
                final String IMG_URL125  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL125);
                    }
                });
                break;
            case "Octubre":
                final String IMG_URL126  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL126);
                    }
                });
                break;
            case "Noviembre":
                final String IMG_URL127  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL127);
                    }
                });
                break;
            case "Diciembre":
                final String IMG_URL128  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL128);
                    }
                });
                break;
            case "Uno":
                final String IMG_URL129  = "http://ense.netne.net/ramiroconnect/uploads/numeros/uno.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL129);
                    }
                });
                break;
            case "Dos":
                final String IMG_URL130  = "http://ense.netne.net/ramiroconnect/uploads/numeros/dos.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL130);
                    }
                });
                break;
            case "Tres":
                final String IMG_URL131  = "http://ense.netne.net/ramiroconnect/uploads/numeros/tres.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL131);
                    }
                });
                break;
            case "Cuatro":
                final String IMG_URL132  = "http://ense.netne.net/ramiroconnect/uploads/numeros/cuatro.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL132);
                    }
                });
                break;
            case "Cinco":
                final String IMG_URL133  = "http://ense.netne.net/ramiroconnect/uploads/numeros/cinco.jpg";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL133);
                    }
                });
                break;
            case "Seis":
                final String IMG_URL134  = "http://ense.netne.net/ramiroconnect/uploads/numeros/seis.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL134);
                    }
                });
                break;
            case "Siete":
                final String IMG_URL135  = "http://ense.netne.net/ramiroconnect/uploads/numeros/siete.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL135);
                    }
                });
                break;
            case "Ocho":
                final String IMG_URL136  = "http://ense.netne.net/ramiroconnect/uploads/numeros/ocho.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL136);
                    }
                });
                break;
            case "Nueve":
                final String IMG_URL137  = "http://ense.netne.net/ramiroconnect/uploads/numeros/nueve.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL137);
                    }
                });
                break;
            case "Diez":
                final String IMG_URL138  = "http://ense.netne.net/ramiroconnect/uploads/numeros/diez.gif";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL138);
                    }
                });
                break;
            case "Guatemala":
                final String IMG_URL139  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL139);
                    }
                });
                break;
            case "Honduras":
                final String IMG_URL140  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL140);
                    }
                });
                break;
            case "Nicaragua":
                final String IMG_URL141  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL141);
                    }
                });
                break;
            case "Costa Rica":
                final String IMG_URL142  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL142);
                    }
                });
                break;
            case "Bienvenidos":
                final String IMG_URL143  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL143);
                    }
                });
                break;
            case "Buenas Noches":
                final String IMG_URL144  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL144);
                    }
                });
                break;
            case "Buenas Tardes":
                final String IMG_URL145  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL145);
                    }
                });
                break;
            case "Buenos Días":
                final String IMG_URL146  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL146);
                    }
                });
                break;
            case "Me Voy / Nos Vemos":
                final String IMG_URL147  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL147);
                    }
                });
                break;
            case "Saludo":
                final String IMG_URL148  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL148);
                    }
                });
                break;
            case "Albañil":
                final String IMG_URL155  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL155);
                    }
                });
                break;
            case "Biblioteca":
                final String IMG_URL156  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL156);
                    }
                });
                break;
            case "Conferencia":
                final String IMG_URL157  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL157);
                    }
                });
                break;
            case "Construir":
                final String IMG_URL158  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL158);
                    }
                });
                break;
            case "Diploma":
                final String IMG_URL159  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL159);
                    }
                });
                break;
            case "Enfermera":
                final String IMG_URL160  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL160);
                    }
                });
                break;
            case "Factura":
                final String IMG_URL161  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL161);
                    }
                });
                break;
            case "Jefe":
                final String IMG_URL162  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL162);
                    }
                });
                break;
            case "Libro":
                final String IMG_URL163  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL163);
                    }
                });
                break;
            case "Máquina de Coser":
                final String IMG_URL164  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL164);
                    }
                });
                break;
            case "Mayor (De Edad)":
                final String IMG_URL165  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL165);
                    }
                });
                break;
            case "Pirata":
                final String IMG_URL166  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL166);
                    }
                });
                break;
            case "Solicitud":
                final String IMG_URL167  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL167);
                    }
                });
                break;
            case "Aduana":
                final String IMG_URL149  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL149);
                    }
                });
                break;
            case "Barco":
                final String IMG_URL150  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL150);
                    }
                });
                break;
            case "Carretera":
                final String IMG_URL151  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL151);
                    }
                });
                break;
            case "Ciudad":
                final String IMG_URL152  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL152);
                    }
                });
                break;
            case "MicroBús":
                final String IMG_URL153  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL153);
                    }
                });
                break;
            case "Tren":
                final String IMG_URL154  = "";
                btnDownload.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v(APP_TAG, "btnDownload onClick was triggered");
                        new DownloadImageTask().execute(IMG_URL154);
                    }
                });
                break;
            //EL ULTIMO NUMERO FUE 167
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
            mImageView.setImageBitmap(result);
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
