package com.smd.smd_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Constraint_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint__layout);
         final EditText email=(EditText)findViewById(R.id.email1);
       final EditText password=(EditText)findViewById(R.id.password1);
         final RadioButton male=(RadioButton) findViewById(R.id.male1);
         final RadioButton female=(RadioButton) findViewById(R.id.female1);
         final CheckBox checkBox=(CheckBox) findViewById(R.id.checkBox1);
        Button register=(Button)findViewById(R.id.register1);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em=email.getText().toString();
                String pass=password.getText().toString();
                String m=male.getText().toString();
                String f=female.getText().toString();

                if(checkBox.isChecked())
                {
                    if(email.getText()!=null&&password.getText()!=null)
                    {
                        if(male.isChecked()&&female.isChecked())
                        {
                            Toast.makeText(Constraint_Layout.this,"Both Genders can't be selected at the same time\n",Toast.LENGTH_LONG).show();
                        }
                        else if(male.isChecked())
                        {
                            Toast.makeText(Constraint_Layout.this,"registered successfully\n"+"email address is "
                                    +em+"\n"+"password is "+pass+"\n"+"Gender is male\n"+"Terms and conditions accepted\n",Toast.LENGTH_LONG).show();
                        }
                        else if(female.isChecked())
                        {
                            Toast.makeText(Constraint_Layout.this,"registered successfully\n"+"email address is "
                                    +em+"\n"+"password is "+pass+"\n"+"Gender is female\n"+"Terms and conditions accepted\n",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(Constraint_Layout.this,"No gender selected\n",Toast.LENGTH_LONG).show();
                        }
                    }
                    else
                        Toast.makeText(Constraint_Layout.this,"Email or Password not entered\n"
                                ,Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(Constraint_Layout.this,"terms and conditions not accepted\n"
                            ,Toast.LENGTH_LONG).show();
            }
        });
    }

}
