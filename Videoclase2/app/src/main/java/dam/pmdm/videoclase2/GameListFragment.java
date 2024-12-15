package dam.pmdm.videoclase2;

import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dam.pmdm.videoclase2.databinding.GameListFragmentBinding;

public class GameListFragment  extends Fragment {

    private GameListFragmentBinding binding; //Binding para el layout
    private ArrayList<GameData> games; //Lista de juegos
    private GameRecyclerViewAdapter adapter; //Adaptador del RecyclerView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //Inflar el layout utilizando el binding
        binding = GameListFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated)@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        // Inicializa la lista de juegos
        loadGames(); //Cargar los juegos (puedes implementar esta función para obtener datos)

        // Configurar el RecyclerView
        adapter = new GameRecyclerViewAdapter (games, getActivity());
        binding.gamesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.gamesRecyclerView.setAdapter(adapter);

    }

    //Método para cargar juegos (puedes implementar tu lógica aquí)
    private void loadGames() {
        games = new ArrayList<GameData>();
        //Llenar la lista con datos de videojuegos
        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71uS8Ra1aGL._AC_uf894,1000_QL80_.jpg", //Reemplaza con la ruta de la imagen
                "Super Mario Bros. Wonder",
                2023,
                "Un juego de plataformas en un mundo vibrante lleno de sorpresas.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71C9pOGlKtL.jpg", //Reemplaza con la ruta de la imagen
                "Mario Kart 8 Deluxe",
                2017,
                "Una versión mejorada de Mario Kart 8 con un modo de batalla renovado.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81CbYA2Gt3L._AC_UF894,1000_QL80_.jpg", //Reemplaza con la ruta de la imagen
                "Super Mario 3D World + Browser's Fury",
                2021,
                "Aventura cooperativa en 3D con una misión en el mundo abierto de Browser's Fury.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81d3KS1-60L.jpg", //Reemplaza con la ruta de la imagen
                "Super Mario Maker 2",
                2019,
                "Diseña y comparte tus propios niveles de Mario en esta secuela.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81drkVN7GRL._AC_UF1000,1000_QL80_.jpg", //Reemplaza con la ruta de la imagen
                "Super Mario Odissey",
                2017,
                "Mario debe rescatar a la Princesa Peach utilizando a su compañero, Cappy.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71FxEVBYddL._AC_UF1000,1000_QL80_.jpg", //Reemplaza con la ruta de la imagen
                "Super Mario All-Stars",
                2021,
                "Colección remasterizada de los clásicos juegos de Mario.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71FxEVBYddL._AC_UF1000,1000_QL80_.jpg", //Reemplaza con la ruta de la imagen
                "Super Mario All-Stars",
                2018,
                "Un juego de fiesta con tableros virtuales y mini-juegos.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/91bAhoyCcUL.jpg", //Reemplaza con la ruta de la imagen
                "Mario Golf: Super Rush",
                2021,
                "Un enfoque divertido del golf con personajes de Mario.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://media.vandal.net/m/85340/paper-mario-the-original-king-20205141527529_1.jpg", //Reemplaza con la ruta de la imagen
                "Paper Mario, The Original King",
                2020,
                "Mario debe obtener el Rey Origami en esta aventurad de rol.",
                "Nintendo Switch"

        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81zgWwSnVfL.jpg", //Reemplaza con la ruta de la imagen
                "Mario + Rabbids Sparks of Hope",
                2022,
                "Mario y los Rabbids deben salvar a los Sparks en esta aventura.",
                "Nintendo Switch"
        ));
    }

    @Override
    public void onStart() {
        super.onStart();
        //Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity().getSupportActionBar().setTitle(R.string.lista_de_juegos));
        }
    }
}
