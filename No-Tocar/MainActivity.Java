import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    Button boton;
    Button btnlec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        button=(Button) findViewById(R.id.boton);
        button.setOnClickListener((View.OnClickListener) this);
        boton=(Button) findViewById(R.id.button);
        boton.setOnClickListener((View.OnClickListener) this);
        btnlec=(Button) findViewById(R.id.btnlec);
        btnlec.setOnClickListener((View.OnClickListener) this);


    }
        public void onClick(View v) {
       switch (v.getId()){
            case R.id.boton:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                // PARTE DEL TOAST Toast.makeText(getApplicationContext(),"Esto es un toast",Toast.LENGTH_SHORT).show();
                break;
           case R.id.button:
               Intent intento=new Intent(MainActivity.this,prueba.class);
               startActivity(intento);
               break;
           case R.id.btnlec:
               Intent intent1=new Intent(MainActivity.this,Lecciones.class);
               startActivity(intent1);
        }
    }
}
