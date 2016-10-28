package com.coayo.usofragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import android.app.Fragment;

/**
 * Created by cice on 28/10/16.
 */

public class fragment_mifragmento extends Fragment {
    EditText etfragment;
    TextView tvfragment;
    Button btnfragment;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Ahora creo la vista qe se inflara en el fragments
        View view = inflater.inflate(R.layout.fragment_mifragment,container,false);
        context= view.getContext();

        etfragment = (EditText) view.findViewById(R.id.etfragment);
        btnfragment =(Button) view.findViewById(R.id.btnfragmen);
        tvfragment = (TextView)view.findViewById(R.id.tvfragment);
// pendiente la cosa de los eventos joder
        Toast toas = Toast.makeText(context," contexto:  " + context +"  inflo   ",Toast.LENGTH_LONG );
        toas.show();

        // loslistener
        //etfragment.setOnClickListener(btnfragment.);



        return view;


    }

}
