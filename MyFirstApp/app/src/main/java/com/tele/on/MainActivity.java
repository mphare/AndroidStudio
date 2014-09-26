package com.tele.on;

import com.zixcorp.myfirstapp.R;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;

public class MainActivity extends ActionBarActivity
{
  public final static String EXTRA_MESSAGE    = "com.zixcorp.myfirstapp.MESSAGE";
  public final static String EXTRA_TEXT       = "com.zixcorp.myfirstapp.TEXT";
  public final static String MAIN_CHECK_BOX_1 = "com.zixcorp.myfirstapp.CHECKBOX1";
  public final static String MAIN_CHOICE_ONE  = "com.zixcorp.myfirstapp.CHOICE1";
  public final static String MAIN_CHOICE_TWO  = "com.zixcorp.myfirstapp.CHOICE2";
  public final static String SLIDER_VALUE     = "com.zixcorp.myfirstapp.SLIDERV";

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_activity_actions, menu);
    return super.onCreateOptionsMenu(menu);
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
    Intent intent = new Intent(this, DisplaySettingsActivity.class);
    startActivity(intent);
  }

  public void pressTop(View view)
  {
    Intent intent = new Intent(this, DisplayTopActivity.class);
    EditText editText = (EditText) findViewById(R.id.second_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);
  }

  public void pressBottom(View view)
  {
    Intent intent = new Intent(this, DisplayBottomActivity.class);
    EditText editText = (EditText) findViewById(R.id.autoCompleteTextView1);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);

    RadioButton rb1 = (RadioButton) findViewById(R.id.choice1);
    // RadioButton rb2 = (RadioButton) findViewById(R.id.choice2);

    boolean radioButton1 = rb1.isChecked();
    // boolean radioButton2 = ((RadioButton)
    // findViewById(R.id.choice2)).isChecked();

    intent.putExtra(MAIN_CHOICE_ONE, radioButton1);
    intent.putExtra(MAIN_CHOICE_TWO, ((RadioButton) findViewById(R.id.choice2)).isChecked());

    SeekBar sb1 = (SeekBar) findViewById(R.id.seekBar1);

    int i = sb1.getProgress();
    intent.putExtra(SLIDER_VALUE, i);

    startActivity(intent);
  }

  public void sendMessage(View view)
  {
    // Do something in response to the button
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);
  }

  @SuppressWarnings("deprecation")
  public void sendClear(View view)
  {
    AlertDialog alertDialog = new AlertDialog.Builder(this).create();
    alertDialog.setTitle("Clear...");
    alertDialog.setMessage("Are you sure?");
    alertDialog.setButton("OK", new DialogInterface.OnClickListener()
    {

      @Override
      public void onClick(DialogInterface dialog, int which)
      {
        // TODO Auto-generated method stub

      }
    });

    alertDialog.show();

    EditText editText = (EditText) findViewById(R.id.edit_message);
    editText.setText("");
  }
}
