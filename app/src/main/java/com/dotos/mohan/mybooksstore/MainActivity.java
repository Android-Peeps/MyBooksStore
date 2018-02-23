package com.dotos.mohan.mybooksstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook=new ArrayList<>();
        lstBook.add(new Book("All the light we can","Category","Description",R.drawable.allthelightwecan));
        lstBook.add(new Book("All you need Books and Tea","Category","Description",R.drawable.allyouneedabooksandtea));
        lstBook.add(new Book("A Room Without Books","Category","Description",R.drawable.aroomwithoutbooks));
        lstBook.add(new Book("God Help Child","Category","Description",R.drawable.godhelpchild));
        lstBook.add(new Book("Harry Potter","Category","Description",R.drawable.harrypotter));
        lstBook.add(new Book("Protect (Un)Popular","Category","Description",R.drawable.protectunpopular));
        lstBook.add(new Book("Silent Scream","Category","Description",R.drawable.silentscream));
        lstBook.add(new Book("So Many Books","Category","Description",R.drawable.somanybooks));
        lstBook.add(new Book("World Books Day","Category","Description",R.drawable.worldbookday));
        lstBook.add(new Book("You can never get a Cup of Coffee","Category","Description",R.drawable.youcannevergetacupofcoffe));
        lstBook.add(new Book("All the light we can","Category","Description",R.drawable.allthelightwecan));
        lstBook.add(new Book("All you need Books and Tea","Category","Description",R.drawable.allyouneedabooksandtea));
        lstBook.add(new Book("A Room Without Books","Category","Description",R.drawable.aroomwithoutbooks));
        lstBook.add(new Book("God Help Child","Category","Description",R.drawable.godhelpchild));
        lstBook.add(new Book("Harry Potter","Category","Description",R.drawable.harrypotter));
        lstBook.add(new Book("Protect (Un)Popular","Category","Description",R.drawable.protectunpopular));
        lstBook.add(new Book("Silent Scream","Category","Description",R.drawable.silentscream));
        lstBook.add(new Book("So Many Books","Category","Description",R.drawable.somanybooks));
        lstBook.add(new Book("World Books Day","Category","Description",R.drawable.worldbookday));
        lstBook.add(new Book("You can never get a Cup of Coffee","Category","Description",R.drawable.youcannevergetacupofcoffe));
        lstBook.add(new Book("All the light we can","Category","Description",R.drawable.allthelightwecan));
        lstBook.add(new Book("All you need Books and Tea","Category","Description",R.drawable.allyouneedabooksandtea));
        lstBook.add(new Book("A Room Without Books","Category","Description",R.drawable.aroomwithoutbooks));
        lstBook.add(new Book("God Help Child","Category","Description",R.drawable.godhelpchild));
        lstBook.add(new Book("Harry Potter","Category","Description",R.drawable.harrypotter));
        lstBook.add(new Book("Protect (Un)Popular","Category","Description",R.drawable.protectunpopular));
        lstBook.add(new Book("Silent Scream","Category","Description",R.drawable.silentscream));
        lstBook.add(new Book("So Many Books","Category","Description",R.drawable.somanybooks));
        lstBook.add(new Book("World Books Day","Category","Description",R.drawable.worldbookday));
        lstBook.add(new Book("You can never get a Cup of Coffee","Category","Description",R.drawable.youcannevergetacupofcoffe));

        RecyclerView myrv=(RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);



    }
}
