package com.coayo.usofragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView tv;
        Button btn;
        EditText et;
        Context context;
    //Fragment fragmentcontainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        tv = (TextView)findViewById(R.id.tv);
        btn = (Button)findViewById(R.id.btn);
        et = (EditText)findViewById(R.id.et);
        String txt;

        String  a;
        View.OnClickListener ex = new (String a) {

            @Override
            public void onClick(View v) {

            }
        };

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String texto = tv.getText().toString();

              // TextView d = fragment_mifragmento.
              // tv.setText()
           }
       });

        FragmentManager miFragmentMager = getSupportFragmentManager();
        FragmentTransaction micommit = miFragmentMager.beginTransaction();
/*
        Toast toas = Toast.makeText(this,"  creo la clase  ",Toast.LENGTH_SHORT );
        toas.show();
*/
        fragment_mifragmento fragment_mifragment = new fragment_mifragmento();
        micommit.add(R.id.fragmentcontainer,fragment_mifragment);
        micommit.commit();

    }

    private void evt(String muestra){
        tv.setText(muestra);
    }



}


