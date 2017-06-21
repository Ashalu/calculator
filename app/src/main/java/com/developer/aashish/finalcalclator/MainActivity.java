package com.developer.aashish.finalcalclator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button bb0,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,add,sub,mul,div,mod,dot,ac,era,eql;
    TextView ed1;
    Double var1,var2;
boolean addd,subb,mull,divv,modd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bb0=(Button)findViewById(R.id.b0);
        bb1=(Button)findViewById(R.id.b1);
        bb2=(Button)findViewById(R.id.b2);
        bb3=(Button)findViewById(R.id.b3);
        bb4=(Button)findViewById(R.id.b4);
        bb5=(Button)findViewById(R.id.b5);
        bb6=(Button)findViewById(R.id.b6);
        bb7=(Button)findViewById(R.id.b7);
        bb8=(Button)findViewById(R.id.b8);
        bb9=(Button)findViewById(R.id.b9);
        ed1=(TextView) findViewById(R.id.e1);
        add=(Button)findViewById(R.id.ad);
        sub=(Button)findViewById(R.id.mi);
        mul=(Button)findViewById(R.id.mu);
        mod=(Button)findViewById(R.id.mo);
        div=(Button)findViewById(R.id.di) ;
        ac=(Button)findViewById(R.id.a);
        era=(Button)findViewById(R.id.er);
        eql=(Button)findViewById(R.id.eq);
        dot=(Button)findViewById(R.id.doy) ;

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
ed1.setText(ed1.getText()+".");
            }
        });

        bb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        bb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        bb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        bb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        bb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ed1.getText()+"");
                addd=true;
                ed1.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ed1.getText()+"");
                subb=true;
                ed1.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ed1.getText()+"");
                mull=true;
                ed1.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ed1.getText()+"");
                divv=true;
                ed1.setText(null);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ed1.getText()+"");
                modd=true;
                ed1.setText(null);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(null);
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(ed1.getText()+"");
                if(addd==true)
                {
                    ed1.setText(var1+var2+"");
                    addd=false;
                }
                 if(subb==true)
                {
                    ed1.setText(var1-var2+"");
                    subb=false;
                }  if(mull==true)
                {
                    ed1.setText(var1*var2+"");
                    mull=false;
                }  if(divv==true)
                {
                    ed1.setText(var1/var2+"");
                    divv=false;
                }
                 if(modd==true)
                {
                    ed1.setText(var1%var2+"");
                    modd=false;
                }
            }
        });
    }
}