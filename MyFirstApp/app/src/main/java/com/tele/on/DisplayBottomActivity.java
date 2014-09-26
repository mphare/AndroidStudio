package com.tele.on;

import com.zixcorp.myfirstapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class DisplayBottomActivity extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_bottom);

    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    TextView textView = (TextView) findViewById(R.id.bottomTextView);
    textView.setTextSize(30);
    textView.setText(message);

    boolean b1 = intent.getBooleanExtra(MainActivity.MAIN_CHOICE_ONE, false);
    boolean b2 = intent.getBooleanExtra(MainActivity.MAIN_CHOICE_TWO, false);

    RadioButton rb1 = (RadioButton) findViewById(R.id.radio1);
    RadioButton rb2 = (RadioButton) findViewById(R.id.radio2);

    rb1.setChecked(b1);
    rb2.setChecked(b2);

    Integer i = intent.getIntExtra(MainActivity.SLIDER_VALUE, 0);
    ProgressBar pb1 = (ProgressBar) findViewById(R.id.progressBar1);
    pb1.setProgress(i);

    TextView progressView = (TextView) findViewById(R.id.progressValue);
    String progressMessage = i.toString();
    progressView.setText(progressMessage);

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

  public void onGoShow(View view)
  {
    Intent intent = new Intent(this, DisplayGoShowActivity.class);
    ToggleButton tb1 = (ToggleButton) findViewById(R.id.toggleButton1);
    boolean b = tb1.isChecked();
    intent.putExtra(MainActivity.EXTRA_MESSAGE, b);
    startActivity(intent);

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
