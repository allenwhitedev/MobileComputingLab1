package com.mobile_computing;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.net.URL;

import static android.R.attr.width;
import static com.mobile_computing.R.attr.height;

public class ResultDisplayActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result_display);

    Intent intent = getIntent();

    String title = intent.getStringExtra("title");
    String text = intent.getStringExtra("text");
    String imageUrl = intent.getStringExtra("imageUrl");

    // set layout for xml file corresponding to search item activity
    ViewGroup layout = (ViewGroup) findViewById(R.id.activity_result_display);

    // set image in UI
    ImageView imageView = (ImageView) layout.findViewById(R.id.imageView);
    Picasso.with(this).load(imageUrl).into(imageView);

    // set title in UI
    TextView textView2 = (TextView) layout.findViewById(R.id.textView2);
    textView2.setText(title);

    // set text in UI
    TextView textView3 = (TextView) layout.findViewById(R.id.textView3);
    textView3.setText(text);


  }
}
