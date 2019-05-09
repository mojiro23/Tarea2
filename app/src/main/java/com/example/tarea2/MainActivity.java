package com.example.tarea2;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    /*variables publicas
     */
 public String estados = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        /*TextView Textv = (TextView)findViewById(R.id.tv3);
        Textv.setText(estados.toString());*/
    }



    private void setupUI(){

           Button mButton1 = (Button) findViewById(R.id.btnactivablt);

            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (!mBluetoothAdapter.isEnabled()) {
                        mBluetoothAdapter.enable();
                        Toast.makeText(getApplicationContext(), "Bluetooth Activado", Toast.LENGTH_SHORT).show();
                        /*TextView Textv = (TextView) findViewById(R.id.tv3);
                        Textv.setText("Bluetooth Activado");*/
                        String estados2 = "Bluetooth Activado\n";
                        estados = estados.toString() + estados2.toString();
                        TextView Textv = (TextView)findViewById(R.id.tv3);
                        Textv.setText(estados.toString());

                    }

                    else
                    {
                        Toast.makeText(getApplicationContext(), "El Bluetooth ya se encuentra activado", Toast.LENGTH_SHORT).show();
                    }
                }

            });



            Button mButton2 = (Button) findViewById(R.id.btnapagablt);

            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (mBluetoothAdapter.isEnabled()) {
                        mBluetoothAdapter.disable();
                        Toast.makeText(getApplicationContext(), "Bluetooth Desactivado", Toast.LENGTH_SHORT).show();
                        /*TextView Textv = (TextView) findViewById(R.id.tv3);
                        Textv.setText("Bluetooth Desactivado");*/
                        String estados2 = "Bluetooth Desactivado\n";
                        estados = estados.toString() + estados2.toString();
                        TextView Textv = (TextView)findViewById(R.id.tv3);
                        Textv.setText(estados.toString());
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "El Bluetooth ya se encuentra desactivado", Toast.LENGTH_SHORT).show();
                    }
                }

            });


    }


}
