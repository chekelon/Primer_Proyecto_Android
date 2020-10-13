package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int operacion;
    int numero1;
    int numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void miClick(View view) {


        int resultado;

        switch(view.getId()){
            case R.id.borrar:
                TextView resultBorrar=(TextView) findViewById(R.id.resultado);
                resultBorrar.setText("");
                break;
            case R.id.numero_cero:
                Button btn0=(Button) view;

                TextView result0=(TextView) findViewById(R.id.resultado);
                if (result0.getText()=="0"||result0.getText()=="")
                {
                    result0.setText("0");

                }else {

                    result0.setText(result0.getText()+""+btn0.getText());
                }
                break;
            case R.id.numero_uno:
                Button btn1=(Button) view;
                TextView result1=(TextView) findViewById(R.id.resultado);
                if (result1.getText()=="")
                {
                    result1.setText(btn1.getText());

                }else {

                    result1.setText(result1.getText()+""+btn1.getText());
                }
                break;
            case R.id.numero_dos:
                Button btn2=(Button) view;
                TextView result2=(TextView) findViewById(R.id.resultado);

                if (result2.getText()=="")
                {
                    result2.setText(btn2.getText());

                }else {

                    result2.setText(result2.getText()+""+btn2.getText());
                }
                break;
            case R.id.numero_tres:
                Button btn3=(Button) view;
                TextView result3=(TextView) findViewById(R.id.resultado);

                if (result3.getText()=="")
                {
                    result3.setText(btn3.getText());

                }else {

                    result3.setText(result3.getText()+""+btn3.getText());
                }
                break;
            case R.id.numero_cuatro:
                Button btn4=(Button) view;
                TextView result4=(TextView) findViewById(R.id.resultado);

                if (result4.getText()=="")
                {
                    result4.setText(btn4.getText());

                }else {

                    result4.setText(result4.getText()+""+btn4.getText());
                }
                break;
            case R.id.numero_cinco:
                Button btn5=(Button) view;
                TextView result5=(TextView) findViewById(R.id.resultado);

                if (result5.getText()=="")
                {
                    result5.setText(btn5.getText());

                }else {

                    result5.setText(result5.getText()+""+btn5.getText());
                }
                break;
            case R.id.numero_seis:
                Button btn6=(Button) view;
                TextView result6=(TextView) findViewById(R.id.resultado);

                if (result6.getText()=="")
                {
                    result6.setText(btn6.getText());

                }else {

                    result6.setText(result6.getText()+""+btn6.getText());
                }
                break;
            case R.id.numero_siete:
                Button btn7=(Button) view;
                TextView result7=(TextView) findViewById(R.id.resultado);

                if (result7.getText()=="")
                {
                    result7.setText(btn7.getText());

                }else {

                    result7.setText(result7.getText()+""+btn7.getText());
                }
                break;
            case R.id.numero_ocho:
                Button btn8=(Button) view;
                TextView result8=(TextView) findViewById(R.id.resultado);

                if (result8.getText()=="")
                {
                    result8.setText(btn8.getText());

                }else {

                    result8.setText(result8.getText()+""+btn8.getText());
                }
                break;
            case R.id.numero_nueve:
                Button btn9=(Button) view;
                TextView result9=(TextView) findViewById(R.id.resultado);

                if (result9.getText()=="")
                {
                    result9.setText(btn9.getText());

                }else {

                    result9.setText(result9.getText()+""+btn9.getText());
                }
                break;
            default:
                break;
        }

        switch (view.getId()){
            case R.id.suma:
                TextView suma=(TextView) findViewById(R.id.resultado);
                numero1= Integer.parseInt(suma.getText().toString());
                operacion=1;
                suma.setText("");
                break;
            case R.id.resta:
                TextView resta=(TextView) findViewById(R.id.resultado);
                numero1= Integer.parseInt(resta.getText().toString()) ;
                resta.setText("");
                operacion=2;
                break;
            case R.id.multiplica:
                TextView multi=(TextView) findViewById(R.id.resultado);
                numero1= Integer.parseInt(multi.getText().toString()) ;
                multi.setText("");
                operacion=3;
                break;
            case R.id.division:
                TextView div=(TextView) findViewById(R.id.resultado);
                numero1= Integer.parseInt(div.getText().toString());
                div.setText("");
                operacion=4;
                break;
            case R.id.igual:
                TextView pantalla2=(TextView) findViewById(R.id.resultado);
                numero2=Integer.parseInt(pantalla2.getText().toString());
                switch (operacion){
                    case 1:
                        resultado=numero1+numero2;
                        pantalla2.setText(""+resultado);
                        break;
                    case 2:
                        resultado=numero1-numero2;
                        pantalla2.setText(""+resultado);
                        break;
                    case 3:
                        resultado=numero1*numero2;
                        pantalla2.setText(""+resultado);
                        break;
                    case 4:
                        resultado=numero1/numero2;
                        pantalla2.setText(""+resultado);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;

        }
    }
}