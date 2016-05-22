import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openfacebook(View imageButton) throws Exception{
        String link="https://www.facebook.com/innovanic";
        Intent intent=null;
        intent=new Intent(intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
}
