package dam.pmdm.videoclase01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import dam.pmdm.videoclase01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //private EditText emailEditText;
    //private EditText passEditText;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);

        //emailEditText =findViewById(R.id.email_edit);
        //passEditText = findViewById(R.id.pass_edit);
        //Button acceptButton = findViewById(R.id.accept_button);
        binding.acceptButton.setOnClickListener(this::acceptPressed);
        //acceptButton.setOnClickListener(this::acceptPressed);
    }

    private void acceptPressed(View view) {
        String email = binding.emailEdit.getText().toString();
        String pass = binding.passEdit.getText().toString();
        //String email = emailEditText.getText().toString();
        //String pass = passEditText.getText().toString();
        System.out.println("El email es " + email + " y el password es " + pass );
        Toast.makeText(this, "El email es " + email + " y el password es " + pass, Toast.LENGTH_SHORT).show();
    }
}