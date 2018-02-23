package com.dotos.mohan.mybooksstore;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvcategory,tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtitle = (TextView) findViewById(R.id.txtview_title);
        tvcategory = (TextView) findViewById(R.id.txtview_category);
        tvdescription = (TextView) findViewById(R.id.txtview_descption);
        img = (ImageView) findViewById(R.id.img_book);


        //recive data

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Category = intent.getExtras().getString("Category");
        String Description = intent.getExtras().getString("Description");
        int Image = intent.getExtras().getInt("Thumbnail");

        // Setting Values


        tvtitle.setText(Title);
        tvcategory.setText(Category);
        tvdescription.setText(Description);
        img.setImageResource(Image);

    }

}
