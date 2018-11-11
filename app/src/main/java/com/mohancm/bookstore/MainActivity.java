package com.mohancm.bookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> bookList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList = new ArrayList<Book>();
        bookList.add(new Book("All the light we can","Fiction","Description1",R.drawable.allthelightwecan));
        bookList.add(new Book("All you need Books and Tea","Drama","Description2",R.drawable.allyouneedabooksandtea));
        bookList.add(new Book("A Room Without Books","Category","Description",R.drawable.aroomwithoutbooks));
        bookList.add(new Book("God Help Child","Category","Description",R.drawable.godhelpchild));
        bookList.add(new Book("Harry Potter","Category","Description",R.drawable.harrypotter));
        bookList.add(new Book("Protect (Un)Popular","Category","Description",R.drawable.protectunpopular));
        bookList.add(new Book("Silent Scream","Category","Description",R.drawable.silentscream));
        bookList.add(new Book("So Many Books","Category","Description",R.drawable.somanybooks));
        bookList.add(new Book("World Books Day","Category","Description",R.drawable.worldbookday));
        bookList.add(new Book("You can never get a Cup of Coffee","Category","Description",R.drawable.youcannevergetacupofcoffe));
        bookList.add(new Book("All the light we can","Category","Description",R.drawable.allthelightwecan));
        bookList.add(new Book("All you need Books and Tea","Category","Description",R.drawable.allyouneedabooksandtea));
        bookList.add(new Book("A Room Without Books","Category","Description",R.drawable.aroomwithoutbooks));
        bookList.add(new Book("God Help Child","Category","Description",R.drawable.godhelpchild));
        bookList.add(new Book("Harry Potter","Category","Description",R.drawable.harrypotter));
        bookList.add(new Book("Protect (Un)Popular","Category","Description",R.drawable.protectunpopular));
        bookList.add(new Book("Silent Scream","Category","Description",R.drawable.silentscream));
        bookList.add(new Book("So Many Books","Category","Description",R.drawable.somanybooks));
        bookList.add(new Book("World Books Day","Category","Description",R.drawable.worldbookday));
        bookList.add(new Book("You can never get a Cup of Coffee","Category","Description",R.drawable.youcannevergetacupofcoffe));
        bookList.add(new Book("All the light we can","Category","Description",R.drawable.allthelightwecan));
        bookList.add(new Book("All you need Books and Tea","Category","Description",R.drawable.allyouneedabooksandtea));
        bookList.add(new Book("A Room Without Books","Category","Description",R.drawable.aroomwithoutbooks));
        bookList.add(new Book("God Help Child","Category","Description",R.drawable.godhelpchild));
        bookList.add(new Book("Harry Potter","Category","Description",R.drawable.harrypotter));
        bookList.add(new Book("Protect (Un)Popular","Category","Description",R.drawable.protectunpopular));
        bookList.add(new Book("Silent Scream","Category","Description",R.drawable.silentscream));
        bookList.add(new Book("So Many Books","Category","Description",R.drawable.somanybooks));
        bookList.add(new Book("World Books Day","Category","Description",R.drawable.worldbookday));
        bookList.add(new Book("You can never get a Cup of Coffee","Category","Description",R.drawable.youcannevergetacupofcoffe));


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,bookList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);

    }
}
