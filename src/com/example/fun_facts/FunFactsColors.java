package com.example.fun_facts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by michal.matlosz on 24.12.2014.
 */
public class FunFactsColors {

  private int[] colors = {
      Color.BLUE,
      Color.CYAN,
      Color.GRAY,
      Color.GREEN,
      Color.MAGENTA,
      Color.RED,
      Color.YELLOW,
      Color.LTGRAY,
      Color.DKGRAY
  };

  public int getColor() {
    return colors[new Random().nextInt(colors.length)];
  }
}
