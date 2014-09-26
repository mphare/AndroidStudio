package com.tele.on;

import com.zixcorp.myfirstapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class DisplayGoShowActivity extends FragmentActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_goshow);

    Intent intent = getIntent();
    boolean b = intent.getBooleanExtra(MainActivity.EXTRA_MESSAGE, false);

    TextView tv = (TextView) findViewById(R.id.textAnswer);

    String message = "";
    if (b)
    {
      message = "TRUE";
    } else
    {
      message = "FALSE";
    }
    tv.setText(message);

  }

}
