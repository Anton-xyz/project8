package com.example.projek_8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopupAdapter extends RecyclerView.Adapter<TopupAdapter.ViewHolder> {

    private List<TopupModel> list;

    public TopupAdapter(List<TopupModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_topup, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        TopupModel model = list.get(position);

        holder.imgGame.setImageResource(model.getImage());
        holder.txtJumlah.setText(model.getJumlah());
        holder.txtHarga.setText(model.getHarga());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgGame;
        TextView txtJumlah;
        TextView txtHarga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgGame = itemView.findViewById(R.id.imgGame);
            txtJumlah = itemView.findViewById(R.id.txtJumlah);
            txtHarga = itemView.findViewById(R.id.txtHarga);
        }
    }
}