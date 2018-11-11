package com.mohancm.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle,tvcategory,tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvtitle = (TextView) findViewById(R.id.txtview_title);
        tvcategory = (TextView) findViewById(R.id.txtview_category);
        tvdescription = (TextView) findViewById(R.id.txtview_descption);
        img = (ImageView) findViewById(R.id.img_book);

        //recieve data

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
