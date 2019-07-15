package com.esiea32;

import com.esiea32.model.Pokemon;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Pokemon> values;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtName;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtName = (TextView) v.findViewById(R.cell_txt_pokemon_name);
        }
    }

    public void add(int position, Pokemon item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    public MyAdapter(List<Pokemon> myDataset) {
        values = myDataset;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
            int viewType) {

        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Pokemon selectedPokemon = values.get(position);
        final String name = selectedPokemon.getName();
        holder.txtName.setText(name);
    }


    @Override
    public int getItemCount() {
        return values.size();
    }

}