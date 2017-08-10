package com.example.valex.baseadapterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listOfCars;
    private EditText addNewCar;
    private Button addButton;
    CarsAdapter carsAdapter;

    // TODO (7) Creeaza o clasa noua numita Car
    // TODO (8) Adauga la clasa Car un string public "Name" si un int public imageResource

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (9) Seteaza folosind findViewById listOfCars, addNewCar si addButton

        // TODO (29) Initializeaza carsAdapter ca fiind un nou CarsAdapter si trimitem constructorului
        //          Activitatea curenta

        // TODO (30) Seteaza un onClickListener pe butonul addButton

        // Urmatoarele cerinte vor fi rezolvate in onClickListener:
            // TODO (31) Creeaza un nou String in care luam textul din EditText-ul addNewCar
            // TODO (32) Creeaza un nou int image in care vom seta imaginea ce sa apara in dreptul fiecarei
            //           masini
            /// OBS: Puteti folosi car_icon adaugat de mine in proiect, altfel luati voi o imagine de pe
            //  internet si adaugati-o in res/drawable prin click dreapta pe folder, selectat New ->
            //  Image Asset. Setati Type-ul ca "Action Bar and Icon Title" si la Asset Type in loc de
            //  icon selectati imagine.  Folositi apoi R.drawable."numele pus de voi la imagine aici"

            // TODO (33) Foloseste metoda addCar pentru a adauga o masina noua in "baza de date"
            // TODO (34) Reseteaza textul la "" pe editTextul addNewCar

        // TODO (35) Seteaza pe view-ul listOfCars adapterul creat "carsAdapter"

    }
}
