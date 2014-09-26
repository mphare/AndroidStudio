package com.tele.on;

import com.zixcorp.myfirstapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class DisplaySearchActivity extends FragmentActivity
{
  public final static String EXTRA_MESSAGE = "com.zixcorp.myfirstapp.MESSAGE";
  public final static String EXTRA_TEXT    = "com.zixcorp.myfirstapp.TEXT";
  public final static String CHECK_BOX_1   = "com.zixcorp.myfirstapp.CHECKBOX1";

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_search);
  }

  public void largeSearch(View view)
  {
    Intent intent = new Intent(this, DisplaySearchLargeButtonActivity.class);
    startActivity(intent);

  }

  public void smallSearch(View view)
  {
    Intent intent = new Intent(this, DisplaySearchSmallButtonActivity.class);
    startActivity(intent);
  }

  public void newButton(View view)
  {
    Intent intent = new Intent(this, DisplaySearchNewButtonActivity.class);

    CheckBox checkBox = (CheckBox) findViewById(R.id.checkThisOut);
    boolean cb1 = checkBox.isChecked();

    TextView textView = (TextView) findViewById(R.id.second_message);
    String message = textView.getText().toString();

    intent.putExtra(EXTRA_MESSAGE, "This is an extra line of text");
    intent.putExtra(CHECK_BOX_1, cb1);
    intent.putExtra(EXTRA_TEXT, message);

    startActivity(intent);
  }
}
