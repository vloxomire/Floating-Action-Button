package com.max.floatingactionbutton.Interfaz;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.animation.Animator;

import com.max.floatingactionbutton.Listener.ListenerFloatingButton1;
import com.max.floatingactionbutton.R;

public class MainActivity extends AppCompatActivity {
private FloatingActionButton botonFlotante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //vinculo
        botonFlotante=findViewById(R.id.flotanteBoton);
        //listener
        ListenerFloatingButton1 listenerFloatingButton1=new ListenerFloatingButton1(this);
        botonFlotante.setOnClickListener(listenerFloatingButton1);
    }
}
