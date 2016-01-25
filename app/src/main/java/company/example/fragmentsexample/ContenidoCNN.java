package company.example.fragmentsexample;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import company.example.fragmentsexample.interfaces.FragmentCCO;


public class ContenidoCNN extends Fragment implements View.OnClickListener{

    private View v;
    private Button btn1;
    private Button btn2;
    private String iX;

    public ContenidoCNN() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_contenido_cnn, container, false);
        btn1= (Button)v.findViewById(R.id.btnCNN1);
        btn1.setOnClickListener(this);
        btn2 =(Button) v.findViewById(R.id.buttonCNN2);
        btn2.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnCNN1:
            iX= "Hello button 1";
                break;
            case R.id.buttonCNN2:
                iX = "Hello Button 2";
                break;
            default:
                break;
        }

        Activity act = getActivity();
        FragmentCCO coo= (FragmentCCO)act;
        coo.btnClicked(iX);

    }
}
