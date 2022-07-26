package com.example.learningandroiddev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Метод для ввода цифр в поле в зависимости от кнопки
    public void inputNum(View view) {
        TextView tvField = (TextView) findViewById(R.id.tv_field);
        Button btnNum = (Button) findViewById(view.getId());

        // Проверка на то, чтобы при вводе цифр в начале поля не стояло ноля
        StringBuilder field = new StringBuilder((String) tvField.getText());
        if (field.substring(0, 1).equals("0")) {
            field.delete(0, 1);
            tvField.setText(field);
        }

        tvField.append(btnNum.getText());
    }

    // Метод для ввода операций в поле в зависимости от кнопки
    public void addOper(View view) {
        TextView tvField = (TextView) findViewById(R.id.tv_field);
        Button btnOper = (Button) findViewById(view.getId());

        tvField.append(btnOper.getText());
    }
}