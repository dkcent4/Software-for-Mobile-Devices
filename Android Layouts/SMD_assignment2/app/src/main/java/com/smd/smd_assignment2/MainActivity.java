package com.smd.smd_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch_constraint();
        switch_relative();
    }
      private void switch_constraint()
        {
            Button constraint;
            constraint=(Button)findViewById(R.id.constraint_button);
            constraint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Constraint_Layout.class));
                }
            });
        }

        private void switch_relative()
        {
            Button relative;
            relative=(Button)findViewById(R.id.relative_button);
            relative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, Relative_Layout.class));
                }
            });
        }
}
