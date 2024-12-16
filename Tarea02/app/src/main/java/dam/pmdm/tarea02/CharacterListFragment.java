package dam.pmdm.tarea02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import dam.pmdm.tarea02.databinding.CharacterListFragmentBinding;

public class CharacterListFragment extends Fragment {

    private CharacterListFragmentBinding binding; // Binding para el layout
    private ArrayList<CharacterData> characters; // Lista de personajes
    private CharacterRecyclerViewAdapter adapter; // Adaptador del RecyclerView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflar el layout utilizando el binding
        binding = CharacterListFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Inicializa la lista de personajes
        loadCharacters(); // Cargar los personajes

        // Configurar el RecyclerView
        adapter = new CharacterRecyclerViewAdapter(characters, getActivity());
        binding.charactersRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.charactersRecyclerview.setAdapter(adapter);


    }

    // Metodo para cargar los personajes
    private void loadCharacters() {
        characters = new ArrayList<CharacterData>();
        // Llenar la lista con datos de personajes
        characters.add(new CharacterData(
                "https://mario.nintendo.com/static/a5f7fe49f4862aa68eaba347ee05c336/fef79/mario.png",
                "Mario",
                "El héroe principal del Reino Champiñón. Mario es muy positivo y siempre está alegre.",
                "HABILIDADES: Es bueno en todos los deportes, habilidad para saltar y posibilidad de mejoras durante el juego."
        ));

        characters.add(new CharacterData(
                "https://mario.nintendo.com/static/12386c8cabe28d812b427d21c9f26d52/a4565/luigi.png", // Reemplaza con la ruta de la imagen
                "Luigi",
                "Hermano de Mario y héroe del Reino Champiñón. Es amable pero un poco " +
                        "nervioso, especialmente si hay fantasmas por ahí",
                "HABILIDADES: Es más alto que Mario y puede saltar más alto que Mario."
        ));

        characters.add(new CharacterData(
                "https://mario.nintendo.com/static/43a96c1d5b681d338864aac15cd391b9/884cd/peach.png", // Reemplaza con la ruta de la imagen
                "Princess Peach",
                "La querida princesa del Reino Champiñón. Es extremadamente amable y " +
                        "siempre está trabajando para crear un mundo en el que todos puedan " +
                        "convivir juntos y felices.",
                "HABILIDADES: Lista para participar en una gran variedad de deportes, " +
                        "poder flotar en el aire durante unos segundos."
        ));

        characters.add(new CharacterData(
                "https://mario.nintendo.com/static/e3ebf11b069067da929b608250baa44e/1ead7/toad.png", // Reemplaza con la ruta de la imagen
                "Toad",
                "Residente del Reino Champiñón, trabaja al servicio de la Princesa Peach.",
                "HABILIDADES: Dependiendo el juego puede tener una habilidad especial distinta."
        ));

    }

    @Override
    public void onStart() {
        super.onStart();
        // Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.lista_de_personajes);
        }
    }
}
