package dam.pmdm.videoclase2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import dam.pmdm.videoclase2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Configura el NavController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController);
    }

    //Metodo para manejar el clic en un juego
    public void gameClicked(GameData game, View view) {
        //Crear un Bundle para pasar los datos al GameDetailFragment
        Bundle bundle = new Bundle();
        bundle.putString("name", game.getName()); //Pasa el nombre del juego
        bundle.putString("releaseYear", String.valueOf(game.getReleaseYear()));
        bundle.putString("platforms", String.valueOf(game.getPlatforms()));
        bundle.putString("image", game.getImage()); // Pasa la imagen del juego
        bundle.putString("description", game.getDescription()); // Pasa la descripción o más datos que necesites

        //Navegar al GameDetailFragment con el Bundle
        Navigation.findNavController(view).navigate(R.id.gameDetailFragment, bundle);
    }

    @Override
    public boolean onSupportNavigationUp() {
        //Utiliza el método navigateUp del NavController
        return navController.navigateUp() || super.onSupportNavigateUp();
    }
}