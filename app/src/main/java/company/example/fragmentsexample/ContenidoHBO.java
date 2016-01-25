package company.example.fragmentsexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContenidoHBO extends Fragment {

    private View v;
    private TextView txtMsg;


    public ContenidoHBO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_contenido_hbo, container, false);



        return v;
    }

    public void setFText(String msg){
       txtMsg = (TextView) v.findViewById(R.id.txtMsg);
        txtMsg.setText(msg);

    }

}
