package dam.pmdm.tarea02;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import dam.pmdm.tarea02.databinding.CharacterCardviewBinding;
import dam.pmdm.tarea02.databinding.CharacterCardviewBinding;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    private final CharacterCardviewBinding binding;

    public CharacterViewHolder(CharacterCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind (CharacterData character){
        Picasso.get()
                .load(character.getImage())
                .into(binding.image);
        binding.name.setText(character.getName());
        binding.executePendingBindings(); // Asegura que se apliquen los cambios de inmediato
    }
}

