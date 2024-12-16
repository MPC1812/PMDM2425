package dam.pmdm.tarea02;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import dam.pmdm.tarea02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //EditText acercade;
    private NavController navController;
    /*private ActionBarDrawerToggle toggle;

    // Configurar menú toggle
    configureToggleMenu();

    private void configureToggleMenu() {
        // Configurar el ActionBarDrawerToggle
        toggle = new ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                R.string.open_drawer,
                R.string.close_drawer
        );
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Manejar clics en el icono del menú
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configura el NavController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController);

    }

    // Método para manejar el clic en un juego
    public void characterClicked(CharacterData character, View view) {
        // Crear un Bundle para pasar los datos al CharacterDetailFragment
        Bundle bundle = new Bundle();
        bundle.putString("name", character.getName()); // Pasa el nombre del personaje
        bundle.putString("image", character.getImage()); // Pasa la imagen del personaje
        bundle.putString("description", character.getDescription()); // Pasa la descripción o más datos que necesites
        bundle.putString("skills", character.getSkills()); // Pasa las habilidades

        // Navegar al CharacterDetailFragment con el Bundle
        Navigation.findNavController(view).navigate(R.id.characterDetailFragment, bundle);
    }
    @Override
    public boolean onSupportNavigateUp() {
        // Utiliza el metodo navigateUp del NavController
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

}