package chacon.joan.modulo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nom11, ape11, doc11;
    private TextView nom1, ape1, doc1, gen1, title, subtitle,nom2,ape2,doc2,gen2,bday,bday2,city,city2,mus2,tvv2,readd2,vgg2;
    private RadioButton mal1,fem1;
    private Button but;
    private DatePicker dp;
    private Spinner sp;
    private CheckBox mus,tvv,readd,vgg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar los EditText
        nom11=(EditText)findViewById(R.id.name11);
        ape11=(EditText)findViewById(R.id.lastname11);
        doc11=(EditText)findViewById(R.id.id11);


        //Inicializar los TextView
        nom1=(TextView)findViewById(R.id.name1);
        ape1=(TextView)findViewById(R.id.lastname1);
        doc1=(TextView)findViewById(R.id.id1);
        gen1=(TextView)findViewById(R.id.genre1);
        nom2=(TextView)findViewById(R.id.name2);
        ape2=(TextView)findViewById(R.id.lastname2);
        doc2=(TextView)findViewById(R.id.id2);
        gen2=(TextView)findViewById(R.id.genre2);
        title=(TextView)findViewById(R.id.register1);
        subtitle=(TextView)findViewById(R.id.fill1);
        bday=(TextView)findViewById(R.id.bday1);
        bday2=(TextView)findViewById(R.id.bday2);
        city=(TextView)findViewById(R.id.city1);
        city2=(TextView)findViewById(R.id.city2);
        mus2=(TextView)findViewById(R.id.music2);
        tvv2=(TextView)findViewById(R.id.tv2);
        readd2=(TextView)findViewById(R.id.read2);
        vgg2=(TextView)findViewById(R.id.vg2);

       //Inicializar los botones
        mal1=(RadioButton)findViewById(R.id.male);
        fem1=(RadioButton)findViewById(R.id.female);
        but=(Button)findViewById(R.id.button);

        //Inicializar otros
        dp=(DatePicker)findViewById(R.id.dp1);
        sp=(Spinner)findViewById(R.id.spn1);
        mus=(CheckBox)findViewById(R.id.music1);
        tvv=(CheckBox)findViewById(R.id.tv1);
        readd=(CheckBox)findViewById(R.id.read1);
        vgg=(CheckBox)findViewById(R.id.vg1);

    }

    public  void onClick(View v){
        if(v.getId()==R.id.button){
            String val1=nom11.getText().toString();
            String val2=ape11.getText().toString();
            String val3=doc11.getText().toString();
            String dia= String.valueOf(dp.getDayOfMonth());
            int mes= dp.getMonth();
            String year= String.valueOf(dp.getYear());
            String mes2 = null;
            String ciudad = String.valueOf(sp.getSelectedItem());

            mes=mes+1;
            switch (mes){
                case 1:
                    mes2="January";
                    break;
                case 2:
                    mes2="February";
                    break;
                case 3:
                    mes2="March";
                    break;
                case 4:
                    mes2="April";
                    break;
                case 5:
                    mes2="May";
                    break;
                case 6:
                    mes2="June";
                    break;
                case 7:
                    mes2="July";
                    break;
                case 8:
                    mes2="Agust";
                    break;
                case 9:
                    mes2="September";
                    break;
                case 10:
                    mes2="October";
                    break;
                case 11:
                    mes2="November";
                    break;
                case 12:
                    mes2="December";
                    break;
            }




            if(val1.equals("")||val2.equals("")||val3.equals("")){
                Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
            }else {
                if (mal1.isChecked()) {
                    nom2.setText(val1);
                    ape2.setText(val2);
                    doc2.setText(val3);
                    gen2.setText("Male");
                    bday2.setText(dia+"/"+mes2+ "/"+year);
                    city2.setText(ciudad);
                    if(mus.isChecked()){
                        mus2.setText("Listen to music");
                    }else{
                        mus2.setText("");
                    }
                    if(tvv.isChecked()){
                        tvv2.setText("Watch TV");
                    }else{
                        tvv2.setText("");
                    }
                    if(readd.isChecked()){
                        readd2.setText("Read");
                    }else{
                        readd2.setText("");
                    }
                    if(vgg.isChecked()){
                        vgg2.setText("Play videogames");
                    }else{
                        vgg2.setText("");
                    }

                }else if(fem1.isChecked()){
                    nom2.setText(val1);
                    ape2.setText(val2);
                    doc2.setText(val3);
                    gen2.setText("Female");
                    bday2.setText(dia+"/"+mes2+ "/"+year);
                    city2.setText(ciudad);
                    if(mus.isChecked()){
                        mus2.setText("Listen to music");
                    }else{
                        mus2.setText("");
                    }
                    if(tvv.isChecked()){
                        tvv2.setText("Watch TV");
                    }else{
                        tvv2.setText("");
                    }
                    if(readd.isChecked()){
                        readd2.setText("Read");
                    }else{
                        readd2.setText("");
                    }
                    if(vgg.isChecked()){
                        vgg2.setText("Play videogames");
                    }else{
                        vgg2.setText("");
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Empty parameters",Toast.LENGTH_SHORT).show();
                }

            }
        }
    }


}


