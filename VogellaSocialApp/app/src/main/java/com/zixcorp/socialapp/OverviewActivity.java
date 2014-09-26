package com.zixcorp.socialapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

@SuppressLint("NewApi")
public class OverviewActivity extends Activity
{
  protected Object mActionMode;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_overview_activituy);

    View view = findViewById(R.id.myView);
    view.setOnLongClickListener(new View.OnLongClickListener()
    {
      @SuppressLint("NewApi")
      public boolean onLongClick(View view)
      {
        if (mActionMode != null)
        {
          return false;
        }

        mActionMode = OverviewActivity.this.startActionMode(mActionModeCallback);
        view.setSelected(true);
        return true;
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.overview_activituy, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    Toast.makeText(this, "Just a test", Toast.LENGTH_SHORT).show();
    return true;
  }

  private ActionMode.Callback mActionModeCallback = new ActionMode.Callback()
                                                  {
                                                    @SuppressLint("NewApi")
                                                    @Override
                                                    public boolean onCreateActionMode(ActionMode mode, Menu menu)
                                                    {
                                                      MenuInflater inflater = mode.getMenuInflater();
                                                      inflater.inflate(R.menu.contextual, menu);
                                                      return true;
                                                    }

                                                    @Override
                                                    public boolean onPrepareActionMode(ActionMode mode, Menu menu)
                                                    {
                                                      return false;
                                                    }

                                                    @Override
                                                    public void onDestroyActionMode(ActionMode mode)
                                                    {
                                                      mActionMode = null;
                                                    }

                                                    @Override
                                                    public boolean onActionItemClicked(ActionMode mode, MenuItem item)
                                                    {
                                                      switch (item.getItemId())
                                                      {
                                                      case R.id.toast:
                                                        Toast.makeText(OverviewActivity.this, "Selected menu",
                                                            Toast.LENGTH_LONG).show();
                                                        return true;
                                                      default:
                                                        return false;
                                                      }
                                                    }
                                                  };

}
