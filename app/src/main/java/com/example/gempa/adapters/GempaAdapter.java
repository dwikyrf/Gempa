package com.example.gempa.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gempa.R;
import com.example.gempa.models.FeaturesItem;
import com.example.gempa.models.Gempa;

import java.util.ArrayList;
import java.util.List;

public class GempaAdapter extends RecyclerView.Adapter<GempaAdapter.GempaViewHolder> {

    ArrayList<Gempa> listGempa = new ArrayList<>();

    public void setItemList(List<FeaturesItem> itemList) {
        this.itemList = itemList;
    }

    private List<FeaturesItem> itemList = new ArrayList<>();


    ItemGempaClickListener listener;

//    public GempaAdapter() {
//        this.itemList = itemlis;
//    }

//    public GempaAdapter(ArrayList<Gempa> listGempa, ItemGempaClickListener listener) {
//        this.listGempa = listGempa;
//        this.listener = listener;
//    }
//    public void setListGempa(ArrayList<Gempa> listGempa) {
//        this.listGempa = listGempa;
//    }
//
//    public void setListener(ItemGempaClickListener listener) {
//        this.listener = listener;
//    }

    @NonNull
    @Override
    public GempaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_gempa, parent, false);
        return new GempaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GempaViewHolder holder, int position) {
        FeaturesItem gempa =itemList.get(position);
//        holder.img_gempa.setImageResource(R.drawable.img_gempa);
        holder.textLokasi.setText(gempa.getProperties().getPlace());
        holder.textWaktu.setText((int) gempa.getProperties().getTime());
        holder.textSR.setText(gempa.getProperties().getMag());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public interface ItemGempaClickListener{
        void onItemGempaClick(FeaturesItem gempa);
    }

    public class GempaViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {

        public ImageView img_gempa;
        public TextView textLokasi, textWaktu, textSR;

        public GempaViewHolder(@NonNull View itemView) {
            super(itemView);
            img_gempa = itemView.findViewById(R.id.imageGempa);
            textLokasi = itemView.findViewById(R.id.text_Lokasi);
            textWaktu = itemView.findViewById(R.id.texttgl);
            textSR = itemView.findViewById(R.id.textSR);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            FeaturesItem gempa = itemList.get(getAdapterPosition());
            listener.onItemGempaClick(gempa);
        }
    }
}
