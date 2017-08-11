package com.example.valex.learningvolley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pentru inceput va trebui sa importam ca si modul Volley
        // Cel mai probabil o sa fie pusa o arhiva pe grup de catre mine cu volley-ul, deoarece
        // sunt cursanti care folosesc windows, si din motive de a evita probleme cu git-ul

        // TODO (1) Adauga in build.gradle (Module:app) in dependencies "compile 'com.android.volley:volley:1.0.0'"
        // TODO (2) File->New->Import Module -> Specificam directorul, si apoi importam volley
        // TODO (3) Deschide build.gradle (Module:app) si insereaza in dependecies: "compile project(':Volley')"
        // TODO (4) Rebuilduieste proiectul

        // Acum Volley este gata de folosit!!!! Sau nu... mai tii minte ce am zis prin prezentare?
        // E nevoie sa specifici in Manifest uses-permission pentru internet

        // TODO (7) Preia TextView-ul tocmai creat intr-o noua variabila TextView

        // TODO (8) Creeaza un RequestQueue, queue folosindu-te de metoda newRequestQueue din Volley
        // TODO (9) Creeaza un url de tip String cu site-ul de pe care luam datele

        // TODO (10) Cere un string raspuns din url-ul setat mai sus
        // TODO (11) In metoda onResponse seteaza folosind raspunsul textul din textView-ul de mai sus
        // TODO (12) In metoda onErrorResponse setam textul textView-ului cu o eroare

        // TODO (13) Adaugam requestul in coada de raspunsuri

    }
}
