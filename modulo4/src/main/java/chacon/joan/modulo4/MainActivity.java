package chacon.joan.modulo4;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText lad11,lad22,bas11,alt11,rad11;
    private TextView lad1,lad2,bas1,alt1,rad1,res,title,fig;
    private RadioButton cuadra,recta,circu,triangu;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lad11=(EditText)findViewById(R.id.lado11);
        lad22=(EditText)findViewById(R.id.lado22);
        bas11=(EditText)findViewById(R.id.base11);
        alt11=(EditText)findViewById(R.id.altura11);
        rad11=(EditText)findViewById(R.id.radio11);

        lad1=(TextView)findViewById(R.id.lado1);
        lad2=(TextView)findViewById(R.id.lado2);
        bas1=(TextView)findViewById(R.id.base);
        alt1=(TextView)findViewById(R.id.altura);
        rad1=(TextView)findViewById(R.id.radio);
        res=(TextView)findViewById(R.id.result);
        title=(TextView)findViewById(R.id.area);
        fig=(TextView)findViewById(R.id.figura);

        cuadra=(RadioButton)findViewById(R.id.cuadrado);
        recta=(RadioButton)findViewById(R.id.rectangulo);
        circu=(RadioButton)findViewById(R.id.circulo);
        triangu=(RadioButton)findViewById(R.id.triangulo);
        but=(Button)findViewById(R.id.button);

    }


   public void onClick(View v) {
        if (v.getId() == R.id.button) {
            if (cuadra.isChecked()) {
                String val1 = lad11.getText().toString();

                if(val1.equals("")) {
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else{
                    float numm1 = Float.parseFloat(val1);
                    float area = numm1*numm1;
                    String result = String.valueOf(area);
                    res.setText(result);

                }

            }
            if (recta.isChecked()) {
                String val1 = lad11.getText().toString();
                String val2 = lad22.getText().toString();
                if(val1.equals("")||val2.equals("")) {
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else{
                    float numm1 = Float.parseFloat(val1);
                    float numm2= Float.parseFloat(val2);
                    float area = numm1*numm2;
                    String result = String.valueOf(area);
                    res.setText(result);

                }

            }
            if (triangu.isChecked()) {
                String val1 = bas11.getText().toString();
                String val2 = alt11.getText().toString();
                if(val1.equals("")||val2.equals("")) {
                    Toast.makeText(MainActivity.this, "Empty parameters", Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else{
                    float numm1 = Float.parseFloat(val1);
                    float numm2= Float.parseFloat(val2);
                    float area = ((numm1*numm2)/2);
                    String result = String.valueOf(area);
                    res.setText(result);

                }

            }
            if (circu.isChecked()) {
                String val1 = rad11.getText().toString();

                if(val1.equals("")) {
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else{
                    float numm1 = Float.parseFloat(val1);
                    double area = (3.14159*numm1*numm1);
                    String result = String.valueOf(area);
                    res.setText(result);

                }

            }


        }

    }

    public void fx(View view){
        if(cuadra.isChecked()){
            lad11.setVisibility(View.VISIBLE);
            lad22.setVisibility(View.INVISIBLE);
            rad11.setVisibility(View.INVISIBLE);
            alt11.setVisibility(View.INVISIBLE);
            bas11.setVisibility(View.INVISIBLE);
            lad1.setVisibility(View.VISIBLE);
            lad2.setVisibility(View.INVISIBLE);
            rad1.setVisibility(View.INVISIBLE);
            alt1.setVisibility(View.INVISIBLE);
            bas1.setVisibility(View.INVISIBLE);

        }
        if(recta.isChecked()){
            lad11.setVisibility(View.VISIBLE);
            lad22.setVisibility(View.VISIBLE);
            rad11.setVisibility(View.INVISIBLE);
            alt11.setVisibility(View.INVISIBLE);
            bas11.setVisibility(View.INVISIBLE);
            lad1.setVisibility(View.VISIBLE);
            lad2.setVisibility(View.VISIBLE);
            rad1.setVisibility(View.INVISIBLE);
            alt1.setVisibility(View.INVISIBLE);
            bas1.setVisibility(View.INVISIBLE);
        }
        if(triangu.isChecked()){
            lad11.setVisibility(View.INVISIBLE);
            lad22.setVisibility(View.INVISIBLE);
            rad11.setVisibility(View.INVISIBLE);
            alt11.setVisibility(View.VISIBLE);
            bas11.setVisibility(View.VISIBLE);
            lad1.setVisibility(View.INVISIBLE);
            lad2.setVisibility(View.INVISIBLE);
            rad1.setVisibility(View.INVISIBLE);
            alt1.setVisibility(View.VISIBLE);
            bas1.setVisibility(View.VISIBLE);
        }
        if(circu.isChecked()){
            lad11.setVisibility(View.INVISIBLE);
            lad22.setVisibility(View.INVISIBLE);
            rad11.setVisibility(View.VISIBLE);
            alt11.setVisibility(View.INVISIBLE);
            bas11.setVisibility(View.INVISIBLE);
            lad1.setVisibility(View.INVISIBLE);
            lad2.setVisibility(View.INVISIBLE);
            rad1.setVisibility(View.VISIBLE);
            alt1.setVisibility(View.INVISIBLE);
            bas1.setVisibility(View.INVISIBLE);
        }

    }



}
