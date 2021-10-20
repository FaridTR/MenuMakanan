package id.co.imastudio.recipeapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ViewHolder>{

    List<ResepModel> resepLists;
    Context context; // supaya bisa dipakai di kelas lain


    //buat constructor
    public ResepAdapter(List<ResepModel> resepLists, Context context) {
        this.resepLists = resepLists;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarMasakan;
        TextView namaMasakan, tipeMasakan, porsiMasakan, waktuMasakan;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            gambarMasakan = (ImageView) itemView.findViewById(R.id.imageViewResep);
            namaMasakan = (TextView) itemView.findViewById(R.id.textViewNama);
            tipeMasakan = (TextView) itemView.findViewById(R.id.textViewTipe);
            porsiMasakan = (TextView) itemView.findViewById(R.id.textViewPorsi);
            waktuMasakan = (TextView) itemView.findViewById(R.id.textViewWaktu);

            cardView = (CardView) itemView.findViewById(R.id.cardview);

        }
    }

    @Override
    public ResepAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //nyambungin ke layout item
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ResepAdapter.ViewHolder holder, final int position) {
        final ResepModel ResepModel = resepLists.get(position);


        Glide.with(context)
                .load(ResepModel.getGambarMasakan())
                .centerCrop()
                .into(holder.gambarMasakan);

        holder.namaMasakan.setText(ResepModel.getNamaMasakan());
        holder.tipeMasakan.setText(ResepModel.getTipeMasakan());
        holder.porsiMasakan.setText(ResepModel.getPorsiMasakan());
        holder.waktuMasakan.setText(ResepModel.getWaktuMasakan());

//        //event klik
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "Judulnya"+ResepModel.getNamaMasakan()+"loh.."+position, Toast.LENGTH_SHORT).show();
////
////                Intent pindah = new Intent(context, DetailResepActivity.class);
//                //kirim data
////                pindah.putExtra("position",position);
////                context.startActivity(pindah);
//                //pakai context kalau mulainya nggak dari sini, tapi dari Activity lain
//
//            }
//        });




    }

    @Override
    public int getItemCount() {
        //banyaknya list
        return resepLists.size();
    }


}
