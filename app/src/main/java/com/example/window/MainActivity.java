package com.example.window;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCloseButtonClick(View view) {
        String[] mIngridients = {"Дубний", "Сыр", "Килька", "Чебуреки"};
        final boolean[] mSelectIngridients = {false, false, false, false};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Выберите ингридиеты для Waffenrager auf pz.4")
                .setIcon(R.drawable.image_close)
                .setCancelable(false)
                .setMultiChoiceItems(mIngridients, null, new DialogInterface.OnMultiChoiceClickListener(){
            public void onClick (DialogInterface dialog,int which, boolean isChecked){
            mSelectIngridients[which] = isChecked;
        }
        })
        .setPositiveButton("ОК",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }});
        AlertDialog alert = builder.create();
        alert.show();



                }
    }


