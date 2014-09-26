package com.zixcorp.rssreader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity
{
  public static final String EXTRA_URL = "url";

    @SuppressLint("NewApi")
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    // check if Activity has been switched to landscape mode
    // If yes, finished and go back to start activity

    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
    {
      finish();
      return;
    }

    setContentView(R.layout.activity_detail);
    Bundle extras = getIntent().getExtras();
    if (extras != null)
    {
      String s = extras.getString(EXTRA_URL);
        DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        detailFragment.setText(s);
    }
  }

}
