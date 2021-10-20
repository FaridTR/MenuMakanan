package id.co.imastudio.recipeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.SlideInRightAnimationAdapter;

public class MainActivity extends AppCompatActivity {

    //buat variabel
    private List<ResepModel> listResep;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //membuat list baru
        listResep = new ArrayList<>();
        
        //coba menampilkan data dummy
//        for (int i = 0; i<= 10 ; i++){
//            ResepModel resepLists = new ResepModel("Resep" + i, "Siang", "5 porsi", "60 menit", R.drawable.resep01);
//            listResep.add(resepLists);
//        }

        //menampilkan data yang berbeda-beda
        ResepModel resepLists = new ResepModel("Udang Tumis Pedas Manis", "Siang", "4 porsi", "115 menit", R.drawable.resep01);
        listResep.add(resepLists);

        resepLists = new ResepModel("Kwetiau Kuah Bakso Ikan Spesial", "Malam", "5 porsi", "50 menit", R.drawable.resep02);
        listResep.add(resepLists);

        resepLists = new ResepModel("Ayam Panggang Madu Oven", "Malam", "6 porsi", "75 menit", R.drawable.resep03);
        listResep.add(resepLists);

        resepLists = new ResepModel("Rendang Minang Asli Padang", "Pagi", "12 porsi", "240 menit", R.drawable.resep04);
        listResep.add(resepLists);

        resepLists = new ResepModel("Lele Rica-Rica", "Malam", "4 porsi", "75 menit", R.drawable.resep05);
        listResep.add(resepLists);


        //set adapter
        adapter = new ResepAdapter(listResep, this);
//        recyclerView.setAdapter(adapter);

        //mengunakan library animasi
        SlideInRightAnimationAdapter animatorAdapter = new SlideInRightAnimationAdapter(adapter);
        animatorAdapter.setFirstOnly(false);
        recyclerView.setAdapter(animatorAdapter);
    }
}
