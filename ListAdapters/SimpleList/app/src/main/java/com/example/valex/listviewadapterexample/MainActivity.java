package com.example.valex.listviewadapterexample;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    TODO (19) Creaza un ListView cu numele listOfCars
//    TODO (20) Creaza un TextView cu numele selectedCars
//    TODO (21) Creaza un EditText cu numele addNewCar
//    TODO (22) Creaza un Button cu numele addButton
//    TODO (23) Creaza o lista de String-uri cu numele cars
//    TODO (24) Creaza un ArrayAdapter de String-uri cu numele carsAdapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (25) Foloseste findViewById pentru a lua referintele de la obiectele definite anterior
        // TODO (26) Initializeaza lista de masini "cars" si adauga 2 date de test

        // TODO (27) Seteaza un onClickListener pe addButton, care sa ia textul din addNewCar
        //           si sa il adauge in lista cars
        // OBS!! Ai grija sa notifici Adapter-ul ca ai modificat lista de date!

        // TODO (28) Seteaza carsAdapter ca fiind un nou ArrayAdapter de String
        // Constructorul de la ArrayAdapter are formatul urmator:
        //      ArrayAdapter(Context context, int resource, List<T> objects)
        // Pentru resource, folositi android.R.layout.simple_list_item_1

        // TODO (29) Seteaza pe listView adapterul carsAdapter

        // Bun. Acum ca avem lista facuta si adapterul setat, urmeaza ca in cazul unui click
        // sa preluam din lista numele masinii si sa il afisam in TextView-ul cu numele selectedCars
        // Pentru asta vom crea pe ListView un setOnItemClickListener, in care sa setam textul de pe
        // TextView-ul selectedCars

        // TODO (30) Creati  un setOnItemClickListener in care sa setati textul de pe selectedCar

        // Weheee! You did it!
    }


}
