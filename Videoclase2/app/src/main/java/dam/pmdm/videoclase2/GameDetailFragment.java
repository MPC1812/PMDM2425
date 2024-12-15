package dam.pmdm.videoclase2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

import dam.pmdm.videoclase2.databinding.GameDetailFragmentBinding;

public class GameDetailFragment extends Fragment {

    private GameDetailFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout para este fragmento
        binding = GameDetailFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener datos del argumento que inicia este fragmento
        if (getArguments() != null) {
            String image = getArguments().getString("image");
            String name = getArguments().getString("name");
            String releaseYear = getArguments().getString("releaseYear");
            String description = getArguments().getString("description");
            String platforms = getArguments().getString("platforms");

            //Asignar los datos a los componentes
            Picasso.get()
                    .load(image)
                    .into(binding.image);
            binding.name.setText(name);
            binding.releaseYear.setText(releaseYear);
            binding.description.setText(description);
            binding.platforms.setText(platforms);
        }
    }

    @Override
    public void onStart() {
        //Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity().getSupportActionBar().setTitle(R.string.detalles_del_juego));
        }
    }
}
