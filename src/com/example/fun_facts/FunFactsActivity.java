package com.example.fun_facts;

import android.app.Activity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends Activity {

  private FunFacts funFacts = new FunFacts();
  private FunFactsColors funFactsColors = new FunFactsColors();

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    final Button button = (Button) findViewById(R.id.button);
    final TextView factTextView = (TextView) findViewById(R.id.factTextView);
    final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

    View.OnClickListener onClickListener = new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        factTextView.setText(funFacts.getFact());
        int color = funFactsColors.getColor();
        button.setTextColor(color);
        relativeLayout.setBackgroundColor(color);
      }
    };

    button.setOnClickListener(onClickListener);
  }
}
