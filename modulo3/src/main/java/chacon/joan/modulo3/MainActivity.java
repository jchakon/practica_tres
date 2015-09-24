package chacon.joan.modulo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ViewStub.OnClickListener {
    private EditText q11,p11,lp11,fp11;
    private TextView t1,q1,p1,lp1,fp1,res;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q11=(EditText)findViewById(R.id.quices1);
        p11=(EditText)findViewById(R.id.presentations1);
        lp11=(EditText)findViewById(R.id.labpractices1);
        fp11=(EditText)findViewById(R.id.finalproject1);

        q1=(TextView)findViewById(R.id.quices);
        p1=(TextView)findViewById(R.id.presentations);
        lp1=(TextView)findViewById(R.id.labpractices);
        fp1=(TextView)findViewById(R.id.finalproject);
        t1=(TextView)findViewById(R.id.title);
        res=(TextView)findViewById(R.id.result);

        but=(Button)findViewById(R.id.button);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            String val1=q11.getText().toString();
            String val2=p11.getText().toString();
            String val3=lp11.getText().toString();
            String val4=fp11.getText().toString();

            if(val1.equals("")||val2.equals("")||val3.equals("")||val4.equals("")){
                Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                res.setText(":(");
            }else{
                float val11=Float.parseFloat(val1);
                float val22=Float.parseFloat(val2);
                float val33=Float.parseFloat(val3);
                float val44=Float.parseFloat(val4);
                if((val11>5)||(val22>5)||(val33>5)||(val44>5)){
                    Toast.makeText(MainActivity.this, "Wrong values", Toast.LENGTH_SHORT).show();
                    res.setText(":(");
                }else {
                    double prom = (val11 * 0.15) + (val22 * 0.1) + (val33 * 0.4) + (val44 * 0.35);
                    String result = String.valueOf(prom);
                    res.setText(result);
                }
            }

        }

    }
}
