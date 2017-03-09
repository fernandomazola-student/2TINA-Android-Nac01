package br.com.fiap.nac01.rm77282;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    RadioGroup radioGroup;
    CheckBox checkBox;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        checkBox = (CheckBox)findViewById(R.id.check);
        editText = (EditText)findViewById(R.id.medida);
        textView = (TextView)findViewById(R.id.textView);


    }


    public void calcular(View v){
        double valor = 0;
        double soma = 0;

        int idRadio = radioGroup.getCheckedRadioButtonId();
        

        if(idRadio == R.id.radio_item1){
            valor = 24.90;
            soma = Double.parseDouble(editText.getText().toString());
            valor = (valor * soma);
            textView.setText("R$ " + valor);
        }else if(idRadio == R.id.radio_item2){
            valor = 11.90;
            soma = Double.parseDouble(editText.getText().toString());
            valor = (valor * soma);
            textView.setText("R$ " + valor);
        }else if(idRadio == R.id.radio_item3){
            valor = 39.90;
            soma = Double.parseDouble(editText.getText().toString());
            valor = (valor * soma);
            textView.setText("R$ " + valor);
        }else if(idRadio == R.id.radio_item4){
            valor = 16.90;
            soma = Double.parseDouble(editText.getText().toString());
            valor = (valor * soma);
            textView.setText("R$ " + valor);
        }else{
            valor = 00.00;
            textView.setText("R$ " + valor);
        }

        if(checkBox.isChecked()){
            valor = (valor * 1.3);
            textView.setText("R$ " + valor);
        }

        if(checkBox.isChecked() == false){
            soma = 0;
        }


    }


}
