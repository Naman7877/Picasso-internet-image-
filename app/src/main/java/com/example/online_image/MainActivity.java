package com.example.online_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image1=findViewById(R.id.image1);
        ImageView image2=findViewById(R.id.image2);

        String url="https://k6u8v6y8.stackpathcdn.com/blog/wp-content/uploads/2018/06/Historical-Sites-in-Jaipur.jpg";
        Picasso.get().load(url).placeholder(R.drawable.image).into(image1);

        String url1="https://www.jaipur.org.uk/images/hawa-mahal-jaipur.jpg";
        Picasso.get().load(url1).placeholder(R.drawable.image).into(image2);


    }
}