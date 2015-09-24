package chacon.joan.modulo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText num11,num22;
    private TextView num1,num2,res;
    private RadioButton add,sub,mul,div;
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num11=(EditText)findViewById(R.id.number11);
        num22=(EditText)findViewById(R.id.number22);
        res=(TextView)findViewById(R.id.result);
        num1=(TextView)findViewById(R.id.number1);
        num2=(TextView)findViewById(R.id.number2);
        add=(RadioButton)findViewById(R.id.addition);
        sub=(RadioButton)findViewById(R.id.subtraction);
        mul=(RadioButton)findViewById(R.id.multiplication);
        div=(RadioButton)findViewById(R.id.division);
        but=(Button) findViewById(R.id.button);
        but.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {


            if (add.isChecked()) {
                String val1 = num11.getText().toString();
                String val2 = num22.getText().toString();
                if(val1.equals("")||val2.equals("")) {
                    Toast.makeText(MainActivity.this, "Empty parameters", Toast.LENGTH_SHORT).show();
                    res.setText(":(");

                }else{
                    float numm1 = Float.parseFloat(val1);
                    float numm2 = Float.parseFloat(val2);
                    float suma = numm1 + numm2;
                    String result = String.valueOf(suma);
                    res.setText(result);

                }

            }
            if (sub.isChecked()) {
                String val1 = num11.getText().toString();
                String val2 = num22.getText().toString();
                if(val1.equals("")||val2.equals("")) {
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                    res.setText(":(");

                }else{
                    float numm1 = Float.parseFloat(val1);
                    float numm2 = Float.parseFloat(val2);
                    float resta = numm1 - numm2;
                    String result = String.valueOf(resta);
                    res.setText(result);

                }

            }
            if (mul.isChecked()) {
                String val1 = num11.getText().toString();
                String val2 = num22.getText().toString();
                if(val1.equals("")||val2.equals("")) {
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else{
                    float numm1 = Float.parseFloat(val1);
                    float numm2 = Float.parseFloat(val2);
                    float multiplicacion = numm1 * numm2;
                    String result = String.valueOf(multiplicacion);
                    res.setText(result);

                }

            }
            if (div.isChecked()) {
                String val1 = num11.getText().toString();
                String val2 = num22.getText().toString();

                if(val1.equals("")||val2.equals("")) {
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else {
                    float numm1 = Float.parseFloat(val1);
                    float numm2 = Float.parseFloat(val2);
                    if(numm2==0){
                        Toast.makeText(MainActivity.this,"Not possible-->Infinity",Toast.LENGTH_SHORT).show();
                        res.setText(":(");
                    }else {
                        float division = (numm1 / numm2);
                        String result = String.valueOf(division);
                        res.setText(result);
                    }
                }
            }
        }
    }

}
