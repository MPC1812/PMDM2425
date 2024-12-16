package dam.pmdm.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }

    //Metodo para volver a la ventana principal
    public void volver(View view) {
        onBackPressed();
    }
}