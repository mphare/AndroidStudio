package com.tele.on;

import com.zixcorp.myfirstapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CheckBox;
import android.widget.TextView;

public class DisplaySearchNewButtonActivity extends ActionBarActivity
{
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_display_new_button_search);

    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    TextView textView = (TextView) findViewById(R.id.topTextView);
    textView.setTextSize(30);
    textView.setText(message);

    boolean cb1 = intent.getBooleanExtra(MainActivity.MAIN_CHECK_BOX_1, false);

    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox1);
    checkBox.setChecked(cb1);

    String textMsg = intent.getStringExtra(MainActivity.EXTRA_TEXT);

    TextView textView1 = (TextView) findViewById(R.id.textView2);
    textView1.setTextSize(30);
    textView1.setText(textMsg);

  }
}
