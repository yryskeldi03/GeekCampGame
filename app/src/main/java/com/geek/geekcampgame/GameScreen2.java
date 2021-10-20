package com.geek.geekcampgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameScreen2 extends AppCompatActivity {
    EditText editText;
    ImageView btnDelete;
    Button btnCheckWord;

    TextView letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9, letter10, letter11, letter12;
    final String CORRECT_WORD = "ПИСАТЕЛЬ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen2);

        editText = findViewById(R.id.edit_text);
        btnDelete = findViewById(R.id.btn_delete);
        btnCheckWord = findViewById(R.id.btn_check_word);

        letter1 = findViewById(R.id.letter1);
        letter2 = findViewById(R.id.letter2);
        letter3 = findViewById(R.id.letter3);
        letter4 = findViewById(R.id.letter4);
        letter5 = findViewById(R.id.letter5);
        letter6 = findViewById(R.id.letter6);
        letter7 = findViewById(R.id.letter7);
        letter8 = findViewById(R.id.letter8);
        letter9 = findViewById(R.id.letter9);
        letter10 = findViewById(R.id.letter10);
        letter11 = findViewById(R.id.letter11);
        letter12 = findViewById(R.id.letter12);

        letter1.setOnClickListener(v -> {
            editText.append(letter1.getText().toString());
            letter1.setVisibility(View.INVISIBLE);
        });

        letter2.setOnClickListener(v -> {
            editText.append(letter2.getText().toString());
            letter2.setVisibility(View.INVISIBLE);
        });

        letter3.setOnClickListener(v -> {
            editText.append(letter3.getText().toString());
            letter3.setVisibility(View.INVISIBLE);
        });

        letter4.setOnClickListener(v -> {
            editText.append(letter4.getText().toString());
            letter4.setVisibility(View.INVISIBLE);
        });

        letter5.setOnClickListener(v -> {
            editText.append(letter5.getText().toString());
            letter5.setVisibility(View.INVISIBLE);
        });

        letter6.setOnClickListener(v -> {
            editText.append(letter6.getText().toString());
            letter6.setVisibility(View.INVISIBLE);
        });

        letter7.setOnClickListener(v -> {
            editText.append(letter7.getText().toString());
            letter7.setVisibility(View.INVISIBLE);
        });

        letter8.setOnClickListener(v -> {
            editText.append(letter8.getText().toString());
            letter8.setVisibility(View.INVISIBLE);
        });

        letter9.setOnClickListener(v -> {
            editText.append(letter9.getText().toString());
            letter9.setVisibility(View.INVISIBLE);
        });

        letter10.setOnClickListener(v -> {
            editText.append(letter10.getText().toString());
            letter10.setVisibility(View.INVISIBLE);
        });

        letter11.setOnClickListener(v -> {
            editText.append(letter11.getText().toString());
            letter11.setVisibility(View.INVISIBLE);
        });

        letter12.setOnClickListener(v -> {
            editText.append(letter12.getText().toString());
            letter12.setVisibility(View.INVISIBLE);
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                editText.setText(text.substring(0, text.length() - 1));

                char last = text.charAt(text.length() - 1);

                if (String.valueOf(last).equals(letter1.getText().toString())) {
                    letter1.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter2.getText().toString())) {
                    letter2.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter3.getText().toString())) {
                    letter3.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter4.getText().toString())) {
                    letter4.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter5.getText().toString())) {
                    letter5.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter6.getText().toString())) {
                    letter6.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter7.getText().toString())) {
                    letter7.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter8.getText().toString())) {
                    letter8.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter9.getText().toString())) {
                    letter9.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter10.getText().toString())) {
                    letter10.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter11.getText().toString())) {
                    letter11.setVisibility(View.VISIBLE);
                }
                if (String.valueOf(last).equals(letter12.getText().toString())) {
                    letter12.setVisibility(View.VISIBLE);
                }
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0) {
                    btnDelete.setVisibility(View.VISIBLE);
                } else {
                    btnDelete.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnCheckWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals(CORRECT_WORD)) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(GameScreen2.this);
                    dialog.setTitle("Вы угадали слово\uD83E\uDD73!");
                    dialog.setMessage("Молодец \uD83D\uDC4D\uD83C\uDFFB, пойдём дальше?");
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("Да", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(GameScreen2.this, GameScreen3.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                    dialog.setNegativeButton("В главное меню", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(GameScreen2.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                    dialog.show();

                } else if (editText.getText().toString().equals("")) {
                    Toast.makeText(getBaseContext(), "Введите слово", Toast.LENGTH_SHORT).show();
                }  else {
                    letter1.setVisibility(View.VISIBLE);
                    letter2.setVisibility(View.VISIBLE);
                    letter3.setVisibility(View.VISIBLE);
                    letter4.setVisibility(View.VISIBLE);
                    letter5.setVisibility(View.VISIBLE);
                    letter6.setVisibility(View.VISIBLE);
                    letter7.setVisibility(View.VISIBLE);
                    letter8.setVisibility(View.VISIBLE);
                    letter9.setVisibility(View.VISIBLE);
                    letter10.setVisibility(View.VISIBLE);
                    letter11.setVisibility(View.VISIBLE);
                    letter12.setVisibility(View.VISIBLE);
                    editText.setText("");
                    Toast.makeText(getBaseContext(), "Не правильно \uD83D\uDC4E\uD83C\uDFFB!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(GameScreen2.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}