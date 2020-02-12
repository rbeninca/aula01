package br.com.rbeninca.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mudaTexto(View view) {
        TextView v =findViewById(R.id.meuTextView);
        v.setText("Ta acabado a aula");
    }
}
