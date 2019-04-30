package com.example.nishit.staggeredgrid;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.view.WindowManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    private RecyclerView staggeredRv;
    private StaggeredRecyclerAdapter adapter;

    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        //making activty full screen
        getSupportActionBar().hide();

        staggeredRv=findViewById(R.id.staggered_rv);
        manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);

        //simp[e list of img array



        List<row> lst=new ArrayList<>();
        lst.add(new row(R.drawable.i1));
        lst.add(new row(R.drawable.i2));
        lst.add(new row(R.drawable.i3));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i5));
        lst.add(new row(R.drawable.i6));
        lst.add(new row(R.drawable.i7));
        lst.add(new row(R.drawable.i8));
        lst.add(new row(R.drawable.i9));
        lst.add(new row(R.drawable.i1));
        lst.add(new row(R.drawable.i2));
        lst.add(new row(R.drawable.i3));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i5));
        lst.add(new row(R.drawable.i6));
        lst.add(new row(R.drawable.i7));
        lst.add(new row(R.drawable.i8));
        lst.add(new row(R.drawable.i9));
        lst.add(new row(R.drawable.i1));


        adapter=new StaggeredRecyclerAdapter(this,lst);
        staggeredRv.setAdapter(adapter);

    }

}
