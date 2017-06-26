package agedog.alex.com.agedog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String[] idade;
    private String[] raca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("AgeOfDog - Idade Canina x Humana");

        Spinner CbIdade = (Spinner) findViewById(R.id.cbIdade);
        Spinner CbRaca = (Spinner) findViewById(R.id.tipo);

        this.idade = new String[]{"Selecione Idade", "1 Ano", "2 Anos", "3 Anos", "4 Anos", "5 Anos", "6 Anos", "7 Anos", "8 Anos", "9 Anos", "10 Anos", "11 Anos", "12 Anos", "13 Anos", "14 Anos", "15 Anos", "16 Anos"};
        this.raca = new String[]{"Selecione Porte ", "Pequeno", "Médio", "Grande"};

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, raca);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CbRaca.setAdapter(aa);

        ArrayAdapter<String> bb = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, idade);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CbIdade.setAdapter(bb);

        CbRaca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Resposta();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        CbIdade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Resposta();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button calc=(Button)findViewById(R.id.button2);
        Button ident=(Button)findViewById(R.id.button);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calc=new Intent(MainActivity.this,Calcular.class);
                startActivity(calc);
            }
        });

        ident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ident=new Intent(MainActivity.this,identificar.class);
                startActivity(ident);
            }
        });

    }

    public void Resposta() {

        Spinner CbIdade = (Spinner) findViewById(R.id.cbIdade);
        Spinner CbRaca = (Spinner) findViewById(R.id.tipo);
        TextView txtExibeIdade = (TextView) findViewById(R.id.txtExibeIdade);

        if ((CbRaca.getSelectedItem() == "Pequeno" || CbRaca.getSelectedItem() == "Médio" || CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("1 Ano"))) {
            txtExibeIdade.setText("Estimativa: 15 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno" || CbRaca.getSelectedItem() == "Médio" || CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("2 Anos"))) {
            txtExibeIdade.setText("Estimativa: 24 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno" || CbRaca.getSelectedItem() == "Médio" || CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("3 Anos"))) {
            txtExibeIdade.setText("Estimativa: 28 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno" || CbRaca.getSelectedItem() == "Médio" || CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("4 Anos"))) {
            txtExibeIdade.setText("Estimativa: 32 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno" || CbRaca.getSelectedItem() == "Médio" || CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("5 Anos"))) {
            txtExibeIdade.setText("Estimativa: 36 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("6 Anos"))) {
            txtExibeIdade.setText("Estimativa: 40 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("7 Anos"))) {
            txtExibeIdade.setText("Estimativa: 44 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("8 Anos"))) {
            txtExibeIdade.setText("Estimativa: 48 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("9 Anos"))) {
            txtExibeIdade.setText("Estimativa: 52 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("10 Anos"))) {
            txtExibeIdade.setText("Estimativa: 56 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("11 Anos"))) {
            txtExibeIdade.setText("Estimativa: 60 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("12 Anos"))) {
            txtExibeIdade.setText("Estimativa: 64 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("13 Anos"))) {
            txtExibeIdade.setText("Estimativa: 68 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("14 Anos"))) {
            txtExibeIdade.setText("Estimativa: 72 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("15 Anos"))) {
            txtExibeIdade.setText("Estimativa: 76 anos");
        } else if ((CbRaca.getSelectedItem() == "Pequeno") && (CbIdade.getSelectedItem() == ("16 Anos"))) {
            txtExibeIdade.setText("Estimativa: 80 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("6 Anos"))) {
            txtExibeIdade.setText("Estimativa: 42 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("7 Anos"))) {
            txtExibeIdade.setText("Estimativa: 47 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("8 Anos"))) {
            txtExibeIdade.setText("Estimativa: 51 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("9 Anos"))) {
            txtExibeIdade.setText("Estimativa: 56 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("10 Anos"))) {
            txtExibeIdade.setText("Estimativa: 60 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("11 Anos"))) {
            txtExibeIdade.setText("Estimativa: 65 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("12 Anos"))) {
            txtExibeIdade.setText("Estimativa: 69 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("13 Anos"))) {
            txtExibeIdade.setText("Estimativa: 74 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("14 Anos"))) {
            txtExibeIdade.setText("Estimativa: 78 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("15 Anos"))) {
            txtExibeIdade.setText("Estimativa: 83 anos");
        } else if ((CbRaca.getSelectedItem() == "Médio") && (CbIdade.getSelectedItem() == ("16 Anos"))) {
            txtExibeIdade.setText("Estimativa: 87 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("6 Anos"))) {
            txtExibeIdade.setText("Estimativa: 45 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("7 Anos"))) {
            txtExibeIdade.setText("Estimativa: 50 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("8 Anos"))) {
            txtExibeIdade.setText("Estimativa: 55 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("9 Anos"))) {
            txtExibeIdade.setText("Estimativa: 61 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("10 Anos"))) {
            txtExibeIdade.setText("Estimativa: 66 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("11 Anos"))) {
            txtExibeIdade.setText("Estimativa: 72 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("12 Anos"))) {
            txtExibeIdade.setText("Estimativa: 77 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("13 Anos"))) {
            txtExibeIdade.setText("Estimativa: 82 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("14 Anos"))) {
            txtExibeIdade.setText("Estimativa: 88 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("15 Anos"))) {
            txtExibeIdade.setText("Estimativa: 93 anos");
        } else if ((CbRaca.getSelectedItem() == "Grande") && (CbIdade.getSelectedItem() == ("16 Anos"))) {
            txtExibeIdade.setText("Estimativa: 120 anos");
        } else {
            txtExibeIdade.setText("Selecione Idade/Raça");
        }

    }
}
