package com.santillanj.textstyler.textstyler;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private CheckBox bold, italic;
    private RadioButton red, green, blue;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.txtfld1);
        bold = (CheckBox) findViewById(R.id.chckbxBold);
        italic = (CheckBox) findViewById(R.id.chckbxItalic);
        red = (RadioButton) findViewById(R.id.rbtnRed);
        green = (RadioButton) findViewById(R.id.rbtnGreen);
        blue = (RadioButton) findViewById(R.id.rdbtnBlue);
        result = (TextView) findViewById(R.id.txtviewResult);


        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(text.getText().toString());

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                result.setText(text.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                result.setText(text.getText().toString());

                bold.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (bold.isChecked()) {
                            if (italic.isChecked()) {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                            } else {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                            }
                        } else {
                            if (italic.isChecked()) {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                            } else {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                            }
                        }
                    }
                });

                italic.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (italic.isChecked()) {
                            if (bold.isChecked()) {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                            } else {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                            }
                        } else {
                            if (bold.isChecked()) {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                            } else {
                                result.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                            }
                        }

                    }
                });

                red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (red.isChecked()) {
                            result.setTextColor(Color.RED);
                        } else
                            result.setTextColor(Color.BLACK);
                    }
                });

                green.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (green.isChecked()) {
                            result.setTextColor(Color.GREEN);
                        } else
                            result.setTextColor(Color.BLACK);
                    }
                });

                blue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (blue.isChecked()) {
                            result.setTextColor(Color.BLUE);
                        } else
                            result.setTextColor(Color.BLACK);
                    }
                });


            }
        });


    }


}
