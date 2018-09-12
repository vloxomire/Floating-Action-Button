package com.max.floatingactionbutton.Listener;

import android.view.View;
import android.widget.Toast;

import com.max.floatingactionbutton.Interfaz.MainActivity;

public class ListenerFloatingButton1 implements View.OnClickListener{
    MainActivity context;

    public ListenerFloatingButton1(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context,"BotonFlotante",Toast.LENGTH_LONG).show();
    }
}
