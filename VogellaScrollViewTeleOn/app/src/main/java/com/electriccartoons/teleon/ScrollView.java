package com.electriccartoons.teleon;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.electriccartoons.teleon.R;

public class ScrollView extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scroll_view);
    TextView view = (TextView) findViewById(R.id.TextView02);
    String s = "";
    for (int i = 0; i < 500; i++)
    {
      s += "ElectricCartoons(TeleOn)";
    }
    view.setText(s);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.scroll_view, menu);
    return true;
  }

}
