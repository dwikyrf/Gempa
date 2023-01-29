package com.example.gempa.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gempa.R;
import com.example.gempa.models.Gempa;

import java.util.ArrayList;

public class GempaAdapter extends RecyclerView.Adapter<GempaAdapter.GempaViewHolder> {

    ArrayList<Gempa> listGempa = new ArrayList<>();

    public GempaAdapter(ArrayList<Gempa> listGempa) {
        this.listGempa = listGempa;
    }

    public void setListGempa(ArrayList<Gempa> listGempa) {
        this.listGempa = listGempa;
    }

    @NonNull
    @Override
    public GempaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_gempa, parent, false);
        return new GempaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GempaViewHolder holder, int position) {
        Gempa gempa =listGempa.get(position);
//        holder.img_gempa.setImageResource(R.drawable.img_gempa);
        holder.textLokasi.setText(gempa.getLokasi());
        holder.textWaktu.setText(gempa.getTanggal());
        holder.textSR.setText(gempa.getSr());

    }

    @Override
    public int getItemCount() {
        return listGempa.size();
    }

    public class GempaViewHolder extends RecyclerView.ViewHolder {

        public ImageView img_gempa;
        public TextView textLokasi, textWaktu, textSR;

        public GempaViewHolder(@NonNull View itemView) {
            super(itemView);
            img_gempa = itemView.findViewById(R.id.imageGempa);
            textLokasi = itemView.findViewById(R.id.text_Lokasi);
            textWaktu = itemView.findViewById(R.id.texttgl);
            textSR = itemView.findViewById(R.id.textSR);

        }
    }
}
