package com.mobile_computing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ResultDisplayActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.result);

    Intent intent = getIntent();

    String title = intent.getStringExtra("title");
    String text = intent.getStringExtra("text");
    String imageUrl = intent.getStringExtra("imageUrl");
    String date = intent.getStringExtra("date");

    // set layout for xml file corresponding to search item activity
    ViewGroup layout = (ViewGroup) findViewById(R.id.activity_result_display);

    // set image in UI
    ImageView imageView = (ImageView) layout.findViewById(R.id.imageView);
    Picasso.with(this).load(imageUrl).into(imageView);

    // set title in UI
    TextView textView2 = (TextView) layout.findViewById(R.id.textView2);
    textView2.setText(title);

    // set date in UI
    TextView textView3 = (TextView) layout.findViewById(R.id.textView3);
    textView3.setText(date);

    // set text in UI
    TextView textView4 = (TextView) layout.findViewById(R.id.textView4);
    textView4.setText(text);

  }
}
