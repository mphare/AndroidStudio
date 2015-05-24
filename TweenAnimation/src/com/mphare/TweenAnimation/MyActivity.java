package com.mphare.TweenAnimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MyActivity extends Activity
{
  /**
   * Called when the activity is first created.
   */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    ImageView sun = (ImageView) findViewById(R.id.sun);
    Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
    sun.startAnimation(sunRise);
  }
}
