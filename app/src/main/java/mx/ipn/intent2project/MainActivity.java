package mx.ipn.intent2project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Llamar(View view) {
        Intent intent;
        Uri uri;
        uri=Uri.parse("tel:5522300603");
        intent= new Intent(Intent.ACTION_CALL, uri);
        if(ActivityCompat.checkSelfPermission(
                this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED
        ){
            startActivity(intent);
        }else{
            Toast.makeText(this,"no se puede no hay tortillas",Toast.LENGTH_LONG).show();
        }
    }
}