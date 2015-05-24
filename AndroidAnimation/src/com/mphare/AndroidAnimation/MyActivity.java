package com.mphare.AndroidAnimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
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

    ImageView wheel = (ImageView) findViewById(R.id.wheel);

    AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.wheel_spin);

    wheelSet.setTarget(wheel);
    wheelSet.start();

  }
}
