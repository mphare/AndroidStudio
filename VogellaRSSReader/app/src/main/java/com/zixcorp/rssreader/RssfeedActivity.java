package com.zixcorp.rssreader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class RssfeedActivity extends Activity implements MyListFragment.OnItemSelectedListener
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_rssfeed);
  }


//  @Override
//  public boolean onOptionsItemSelected(MenuItem item)
//  {
//    switch (item.getItemId())
//    {
//    case R.id.action_refresh:
//      Toast.makeText(this, "Action refresh selected", Toast.LENGTH_SHORT).show();
//      break;
//
//    case R.id.action_settings:
//      Toast.makeText(this, "Action settings selected", Toast.LENGTH_LONG).show();
//      break;
//
//    default:
//      break;
//
//    }
//    return true;
//  }

  @SuppressLint("NewApi")
  @Override
  public void onRssItemSelected(String link)
  {
    DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
    if (fragment != null && fragment.isInLayout())
    {
      fragment.setText(link);
    }
    else
    {
      Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
      intent.putExtra(DetailActivity.EXTRA_URL, link);
      startActivity(intent);

    }
  }

}
