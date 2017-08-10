package com.example.valex.baseadapterapp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.support.constraint.solver.LinearSystem;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by valex on 04/08/2017.
 */

public class CarsAdapter extends BaseAdapter {

    // TODO (10) Creeaza o variabila de tip Activity numita context
    // TODO (11) Creeaza un ArrayList<Car> numit cars

    // TODO (12) In constructor setam contextul clasei ca fiind contextul primit ca parametru
    public CarsAdapter( Activity context ) {
        // TODO (12) In constructor setam contextul clasei ca fiind contextul primit ca parametru
        // TODO (13) Initializam lista cars ca un nou ArrayList<Car>()
    }

    // TODO (14) Creeaza o functie publica de tip void addCar care va primi ca parametru
    //          Name (numele masinii) si resource (numele resursei) care va adauga in "baza noastra
    //          de date" un nou obiect

    // TODO (15) In functia addCar, creaza un nou obiect de tip Car
    // TODO (16) Initializeaza atributele Name si imageResource cu valorile primite ca si parametri
    // TODO (17) Adauga masina nou creata la lista cars
    // TODO (18) Notifica Adapterul ca s-au schimbat datele

    @Override
    public int getCount() {
        // TODO (19) Returneaza numarul de elemente din lista cars
    }

    @Override
    public Object getItem(int i) {
        // TODO (20) Folosindu-ne de iteratorul "i" returnam obiectul de la pozitia i din lista
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // TODO (21) Cream un element de tip View

        // TODO (22) Creeaza un LayoutInflater nou bazandu-ne pe contextul primit prin constructor
        // TODO (23) Initializam view-ul element folosind inflater-ul ca sa instantiem layout-ul
        //          list_item (Ne folosim de R.layout.list_item)
        // OBS: metoda inflate are urmatorul format: inflate(int resource, ViewGroup root)

        // TODO (24) Luam un TextView name si il initializam folosind View-ul element si findViewById
        // TODO (25) Luam un ImageView image si il initializam folosind View-ul element si findViewById

        // TODO (26) Setam textul TextView-ului luand din array-ul cars numele masinii de pe pozitia i
        // TODO (27) Setam imaginea ImageView-ului luand din array-ul cars img masinii de pe pozitia i

        // TODO (28) Returnam element-ul de tip View creat

    }
}
