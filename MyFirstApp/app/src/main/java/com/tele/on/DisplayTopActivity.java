package com.tele.on;

import com.zixcorp.myfirstapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayTopActivity extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_top);

    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    TextView textView = (TextView) findViewById(R.id.topTextView);
    textView.setTextSize(30);
    textView.setText(message);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.display_settings, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    switch (item.getItemId())
    {
    case R.id.action_search:
      openSearch();
      return true;
    case R.id.action_settings:
      openSettings();
      return true;
    default:
      return super.onOptionsItemSelected(item);
    }
  }

  public void openSearch()
  {
    Intent intent = new Intent(this, DisplaySearchActivity.class);
    startActivity(intent);
  }

  public void openSettings()
  {

  }

}
