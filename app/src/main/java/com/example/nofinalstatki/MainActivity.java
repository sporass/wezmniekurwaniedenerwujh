package com.example.nofinalstatki;
import  java.util.ArrayList;
import java.util.Random;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton A1 = findViewById(R.id.A1);
        ImageButton A2 = findViewById(R.id.A2);
        ImageButton A3 = findViewById(R.id.A3);
        ImageButton A4 = findViewById(R.id.A4);
        ImageButton A5 = findViewById(R.id.A5);
        ImageButton A6 = findViewById(R.id.A6);
        ImageButton A7 = findViewById(R.id.A7);
        ImageButton A8 = findViewById(R.id.A8);
        ImageButton A9 = findViewById(R.id.A9);
        ImageButton A10 = findViewById(R.id.A10);

        ImageButton B1 = findViewById(R.id.B1);
        ImageButton B2 = findViewById(R.id.B2);
        ImageButton B3 = findViewById(R.id.B3);
        ImageButton B4 = findViewById(R.id.B4);
        ImageButton B5 = findViewById(R.id.B5);
        ImageButton B6 = findViewById(R.id.B6);
        ImageButton B7 = findViewById(R.id.B7);
        ImageButton B8 = findViewById(R.id.B8);
        ImageButton B9 = findViewById(R.id.B9);
        ImageButton B10 = findViewById(R.id.B10);

        ImageButton C1 = findViewById(R.id.C1);
        ImageButton C2 = findViewById(R.id.C2);
        ImageButton C3 = findViewById(R.id.C3);
        ImageButton C4 = findViewById(R.id.C4);
        ImageButton C5 = findViewById(R.id.C5);
        ImageButton C6 = findViewById(R.id.C6);
        ImageButton C7 = findViewById(R.id.C7);
        ImageButton C8 = findViewById(R.id.C8);
        ImageButton C9 = findViewById(R.id.C9);
        ImageButton C10 = findViewById(R.id.C10);

        ImageButton D1 = findViewById(R.id.D1);
        ImageButton D2 = findViewById(R.id.D2);
        ImageButton D3 = findViewById(R.id.D3);
        ImageButton D4 = findViewById(R.id.D4);
        ImageButton D5 = findViewById(R.id.D5);
        ImageButton D6 = findViewById(R.id.D6);
        ImageButton D7 = findViewById(R.id.D7);
        ImageButton D8 = findViewById(R.id.D8);
        ImageButton D9 = findViewById(R.id.D9);
        ImageButton D10 = findViewById(R.id.D10);

        ImageButton E1 = findViewById(R.id.E1);
        ImageButton E2 = findViewById(R.id.E2);
        ImageButton E3 = findViewById(R.id.E3);
        ImageButton E4 = findViewById(R.id.E4);
        ImageButton E5 = findViewById(R.id.E5);
        ImageButton E6 = findViewById(R.id.E6);
        ImageButton E7 = findViewById(R.id.E7);
        ImageButton E8 = findViewById(R.id.E8);
        ImageButton E9 = findViewById(R.id.E9);
        ImageButton E10 = findViewById(R.id.E10);

        ImageButton F1 = findViewById(R.id.F1);
        ImageButton F2 = findViewById(R.id.F2);
        ImageButton F3 = findViewById(R.id.F3);
        ImageButton F4 = findViewById(R.id.F4);
        ImageButton F5 = findViewById(R.id.F5);
        ImageButton F6 = findViewById(R.id.F6);
        ImageButton F7 = findViewById(R.id.F7);
        ImageButton F8 = findViewById(R.id.F8);
        ImageButton F9 = findViewById(R.id.F9);
        ImageButton F10 = findViewById(R.id.F10);

        ImageButton G1 = findViewById(R.id.G1);
        ImageButton G2 = findViewById(R.id.G2);
        ImageButton G3 = findViewById(R.id.G3);
        ImageButton G4 = findViewById(R.id.G4);
        ImageButton G5 = findViewById(R.id.G5);
        ImageButton G6 = findViewById(R.id.G6);
        ImageButton G7 = findViewById(R.id.G7);
        ImageButton G8 = findViewById(R.id.G8);
        ImageButton G9 = findViewById(R.id.G9);
        ImageButton G10 = findViewById(R.id.G10);

        ImageButton H1 = findViewById(R.id.H1);
        ImageButton H2 = findViewById(R.id.H2);
        ImageButton H3 = findViewById(R.id.H3);
        ImageButton H4 = findViewById(R.id.H4);
        ImageButton H5 = findViewById(R.id.H5);
        ImageButton H6 = findViewById(R.id.H6);
        ImageButton H7 = findViewById(R.id.H7);
        ImageButton H8 = findViewById(R.id.H8);
        ImageButton H9 = findViewById(R.id.H9);
        ImageButton H10 = findViewById(R.id.H10);

        ImageButton I1 = findViewById(R.id.I1);
        ImageButton I2 = findViewById(R.id.I2);
        ImageButton I3 = findViewById(R.id.I3);
        ImageButton I4 = findViewById(R.id.I4);
        ImageButton I5 = findViewById(R.id.I5);
        ImageButton I6 = findViewById(R.id.I6);
        ImageButton I7 = findViewById(R.id.I7);
        ImageButton I8 = findViewById(R.id.I8);
        ImageButton I9 = findViewById(R.id.I9);
        ImageButton I10 = findViewById(R.id.I10);

        ImageButton J1 = findViewById(R.id.J1);
        ImageButton J2 = findViewById(R.id.J2);
        ImageButton J3 = findViewById(R.id.J3);
        ImageButton J4 = findViewById(R.id.J4);
        ImageButton J5 = findViewById(R.id.J5);
        ImageButton J6 = findViewById(R.id.J6);
        ImageButton J7 = findViewById(R.id.J7);
        ImageButton J8 = findViewById(R.id.J8);
        ImageButton J9 = findViewById(R.id.J9);
        ImageButton J10 = findViewById(R.id.J10);

        TextView Wynik = findViewById(R.id.Wynik);
        TextView Losowanie = findViewById(R.id.Losowanie);
        Button button = findViewById(R.id.Kliknij);

        String[][] tab = {
                {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"},
                {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"},
                {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"},
                {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"},
                {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"},
                {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"},
                {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10"},
                {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10"},
                {"I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10"},
                {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"}
        };

        ArrayList<String> wszystkiePola = new ArrayList<>();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                wszystkiePola.add(tab[i][j]);
            }
        }
        Random random = new Random();
        ArrayList<String> wylosowanePola = new ArrayList<>();

        while (wylosowanePola.size() < 10) {
            int index = random.nextInt(wszystkiePola.size());
            String pole = wszystkiePola.get(index);
            if (!wylosowanePola.contains(pole)) {
                wylosowanePola.add(pole);
            }
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Losowanie.setText("Wylosowane pola: "+wylosowanePola.toString());
            }
        });

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A1")) {
                    Wynik.setText("Kliknąłeś A1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A1 Nie trafiłeś");
                }
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A2")) {
                    Wynik.setText("Kliknąłeś A2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A2 Nie trafiłeś");
                }
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A3")) {
                    Wynik.setText("Kliknąłeś A3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A3 Nie trafiłeś");
                }
            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A4")) {
                    Wynik.setText("Kliknąłeś A4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A4 Nie trafiłeś");
                }
            }
        });

        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A5")) {
                    Wynik.setText("Kliknąłeś A5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A5 Nie trafiłeś");
                }
            }
        });

        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A6")) {
                    Wynik.setText("Kliknąłeś A6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A6 Nie trafiłeś");
                }
            }
        });

        A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A7")) {
                    Wynik.setText("Kliknąłeś A7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A7 Nie trafiłeś");
                }
            }
        });

        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A8")) {
                    Wynik.setText("Kliknąłeś A8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A8 Nie trafiłeś");
                }
            }
        });

        A9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A9")) {
                    Wynik.setText("Kliknąłeś A9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A9 Nie trafiłeś");
                }
            }
        });

        A10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("A10")) {
                    Wynik.setText("Kliknąłeś A10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś A10 Nie trafiłeś");
                }
            }
        });



        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B1")) {
                    Wynik.setText("Kliknąłeś B1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B1 Nie trafiłeś");
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B2")) {
                    Wynik.setText("Kliknąłeś B2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B2 Nie trafiłeś");
                }
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B3")) {
                    Wynik.setText("Kliknąłeś B3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B3 Nie trafiłeś");
                }
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B4")) {
                    Wynik.setText("Kliknąłeś B4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B4 Nie trafiłeś");
                }
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B5")) {
                    Wynik.setText("Kliknąłeś B5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B5 Nie trafiłeś");
                }
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B6")) {
                    Wynik.setText("Kliknąłeś B6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B6 Nie trafiłeś");
                }
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B7")) {
                    Wynik.setText("Kliknąłeś B7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B7 Nie trafiłeś");
                }
            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B8")) {
                    Wynik.setText("Kliknąłeś B8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B8 Nie trafiłeś");
                }
            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B9")) {
                    Wynik.setText("Kliknąłeś B9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B9 Nie trafiłeś");
                }
            }
        });

        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("B10")) {
                    Wynik.setText("Kliknąłeś B10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś B10 Nie trafiłeś");
                }
            }
        });

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C1")) {
                    Wynik.setText("Kliknąłeś C1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C1 Nie trafiłeś");
                }
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C2")) {
                    Wynik.setText("Kliknąłeś C2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C2 Nie trafiłeś");
                }
            }
        });

        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C3")) {
                    Wynik.setText("Kliknąłeś C3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C3 Nie trafiłeś");
                }
            }
        });

        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C4")) {
                    Wynik.setText("Kliknąłeś C4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C4 Nie trafiłeś");
                }
            }
        });

        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C5")) {
                    Wynik.setText("Kliknąłeś C5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C5 Nie trafiłeś");
                }
            }
        });

        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C6")) {
                    Wynik.setText("Kliknąłeś C6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C6 Nie trafiłeś");
                }
            }
        });

        C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C7")) {
                    Wynik.setText("Kliknąłeś C7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C7 Nie trafiłeś");
                }
            }
        });

        C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C8")) {
                    Wynik.setText("Kliknąłeś C8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C8 Nie trafiłeś");
                }
            }
        });

        C9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C9")) {
                    Wynik.setText("Kliknąłeś C9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C9 Nie trafiłeś");
                }
            }
        });

        C10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("C10")) {
                    Wynik.setText("Kliknąłeś C10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś C10 Nie trafiłeś");
                }
            }
        });


        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D1")) {
                    Wynik.setText("Kliknąłeś D1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D1 Nie trafiłeś");
                }
            }
        });

        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D2")) {
                    Wynik.setText("Kliknąłeś D2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D2 Nie trafiłeś");
                }
            }
        });

        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D3")) {
                    Wynik.setText("Kliknąłeś D3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D3 Nie trafiłeś");
                }
            }
        });

        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D4")) {
                    Wynik.setText("Kliknąłeś D4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D4 Nie trafiłeś");
                }
            }
        });

        D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D5")) {
                    Wynik.setText("Kliknąłeś D5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D5 Nie trafiłeś");
                }
            }
        });

        D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D6")) {
                    Wynik.setText("Kliknąłeś D6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D6 Nie trafiłeś");
                }
            }
        });

        D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D7")) {
                    Wynik.setText("Kliknąłeś D7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D7 Nie trafiłeś");
                }
            }
        });

        D8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D8")) {
                    Wynik.setText("Kliknąłeś D8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D8 Nie trafiłeś");
                }
            }
        });

        D9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D9")) {
                    Wynik.setText("Kliknąłeś D9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D9 Nie trafiłeś");
                }
            }
        });

        D10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("D10")) {
                    Wynik.setText("Kliknąłeś D10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś D10 Nie trafiłeś");
                }
            }
        });


        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E1")) {
                    Wynik.setText("Kliknąłeś E1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E1 Nie trafiłeś");
                }
            }
        });

        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E2")) {
                    Wynik.setText("Kliknąłeś E2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E2 Nie trafiłeś");
                }
            }
        });

        E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E3")) {
                    Wynik.setText("Kliknąłeś E3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E3 Nie trafiłeś");
                }
            }
        });

        E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E4")) {
                    Wynik.setText("Kliknąłeś E4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E4 Nie trafiłeś");
                }
            }
        });

        E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E5")) {
                    Wynik.setText("Kliknąłeś E5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E5 Nie trafiłeś");
                }
            }
        });

        E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E6")) {
                    Wynik.setText("Kliknąłeś E6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E6 Nie trafiłeś");
                }
            }
        });

        E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E7")) {
                    Wynik.setText("Kliknąłeś E7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E7 Nie trafiłeś");
                }
            }
        });

        E8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E8")) {
                    Wynik.setText("Kliknąłeś E8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E8 Nie trafiłeś");
                }
            }
        });

        E9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E9")) {
                    Wynik.setText("Kliknąłeś E9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E9 Nie trafiłeś");
                }
            }
        });

        E10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("E10")) {
                    Wynik.setText("Kliknąłeś E10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś E10 Nie trafiłeś");
                }
            }
        });

        F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F1")) {
                    Wynik.setText("Kliknąłeś F1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F1 Nie trafiłeś");
                }
            }
        });

        F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F2")) {
                    Wynik.setText("Kliknąłeś F2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F2 Nie trafiłeś");
                }
            }
        });

        F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F3")) {
                    Wynik.setText("Kliknąłeś F3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F3 Nie trafiłeś");
                }
            }
        });

        F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F4")) {
                    Wynik.setText("Kliknąłeś F4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F4 Nie trafiłeś");
                }
            }
        });

        F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F5")) {
                    Wynik.setText("Kliknąłeś F5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F5 Nie trafiłeś");
                }
            }
        });

        F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F6")) {
                    Wynik.setText("Kliknąłeś F6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F6 Nie trafiłeś");
                }
            }
        });

        F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F7")) {
                    Wynik.setText("Kliknąłeś F7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F7 Nie trafiłeś");
                }
            }
        });

        F8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F8")) {
                    Wynik.setText("Kliknąłeś F8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F8 Nie trafiłeś");
                }
            }
        });

        F9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F9")) {
                    Wynik.setText("Kliknąłeś F9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F9 Nie trafiłeś");
                }
            }
        });

        F10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("F10")) {
                    Wynik.setText("Kliknąłeś F10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś F10 Nie trafiłeś");
                }
            }
        });

        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G1")) {
                    Wynik.setText("Kliknąłeś G1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G1 Nie trafiłeś");
                }
            }
        });
        G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G2")) {
                    Wynik.setText("Kliknąłeś G2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G2 Nie trafiłeś");
                }
            }
        });

        G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G3")) {
                    Wynik.setText("Kliknąłeś G3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G3 Nie trafiłeś");
                }
            }
        });

        G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G4")) {
                    Wynik.setText("Kliknąłeś G4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G4 Nie trafiłeś");
                }
            }
        });

        G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G5")) {
                    Wynik.setText("Kliknąłeś G5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G5 Nie trafiłeś");
                }
            }
        });

        G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G6")) {
                    Wynik.setText("Kliknąłeś G6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G6 Nie trafiłeś");
                }
            }
        });

        G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G7")) {
                    Wynik.setText("Kliknąłeś G7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G7 Nie trafiłeś");
                }
            }
        });

        G8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G8")) {
                    Wynik.setText("Kliknąłeś G8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G8 Nie trafiłeś");
                }
            }
        });

        G9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G9")) {
                    Wynik.setText("Kliknąłeś G9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G9 Nie trafiłeś");
                }
            }
        });

        G10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("G10")) {
                    Wynik.setText("Kliknąłeś G10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś G10 Nie trafiłeś");
                }
            }
        });

        H1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H1")) {
                    Wynik.setText("Kliknąłeś H1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H1 Nie trafiłeś");
                }
            }
        });

        H2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H2")) {
                    Wynik.setText("Kliknąłeś H2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H2 Nie trafiłeś");
                }
            }
        });

        H3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H3")) {
                    Wynik.setText("Kliknąłeś H3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H3 Nie trafiłeś");
                }
            }
        });

        H4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H4")) {
                    Wynik.setText("Kliknąłeś H4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H4 Nie trafiłeś");
                }
            }
        });

        H5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H5")) {
                    Wynik.setText("Kliknąłeś H5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H5 Nie trafiłeś");
                }
            }
        });

        H6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H6")) {
                    Wynik.setText("Kliknąłeś H6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H6 Nie trafiłeś");
                }
            }
        });

        H7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H7")) {
                    Wynik.setText("Kliknąłeś H7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H7 Nie trafiłeś");
                }
            }
        });

        H8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H8")) {
                    Wynik.setText("Kliknąłeś H8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H8 Nie trafiłeś");
                }
            }
        });

        H9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H9")) {
                    Wynik.setText("Kliknąłeś H9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H9 Nie trafiłeś");
                }
            }
        });

        H10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("H10")) {
                    Wynik.setText("Kliknąłeś H10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś H10 Nie trafiłeś");
                }
            }
        });

        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I1")) {
                    Wynik.setText("Kliknąłeś I1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I1 Nie trafiłeś");
                }
            }
        });

        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I2")) {
                    Wynik.setText("Kliknąłeś I2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I2 Nie trafiłeś");
                }
            }
        });

        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I3")) {
                    Wynik.setText("Kliknąłeś I3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I3 Nie trafiłeś");
                }
            }
        });

        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I4")) {
                    Wynik.setText("Kliknąłeś I4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I4 Nie trafiłeś");
                }
            }
        });

        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I5")) {
                    Wynik.setText("Kliknąłeś I5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I5 Nie trafiłeś");
                }
            }
        });

        I6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I6")) {
                    Wynik.setText("Kliknąłeś I6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I6 Nie trafiłeś");
                }
            }
        });

        I7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I7")) {
                    Wynik.setText("Kliknąłeś I7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I7 Nie trafiłeś");
                }
            }
        });

        I8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I8")) {
                    Wynik.setText("Kliknąłeś I8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I8 Nie trafiłeś");
                }
            }
        });

        I9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I9")) {
                    Wynik.setText("Kliknąłeś I9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I9 Nie trafiłeś");
                }
            }
        });

        I10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("I10")) {
                    Wynik.setText("Kliknąłeś I10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś I10 Nie trafiłeś");
                }
            }
        });

        J1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J1")) {
                    Wynik.setText("Kliknąłeś J1 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J1 Nie trafiłeś");
                }
            }
        });

        J2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J2")) {
                    Wynik.setText("Kliknąłeś J2 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J2 Nie trafiłeś");
                }
            }
        });

        J3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J3")) {
                    Wynik.setText("Kliknąłeś J3 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J3 Nie trafiłeś");
                }
            }
        });

        J4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J4")) {
                    Wynik.setText("Kliknąłeś J4 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J4 Nie trafiłeś");
                }
            }
        });

        J5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J5")) {
                    Wynik.setText("Kliknąłeś J5 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J5 Nie trafiłeś");
                }
            }
        });

        J6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J6")) {
                    Wynik.setText("Kliknąłeś J6 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J6 Nie trafiłeś");
                }
            }
        });

        J7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J7")) {
                    Wynik.setText("Kliknąłeś J7 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J7 Nie trafiłeś");
                }
            }
        });

        J8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J8")) {
                    Wynik.setText("Kliknąłeś J8 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J8 Nie trafiłeś");
                }
            }
        });

        J9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J9")) {
                    Wynik.setText("Kliknąłeś J9 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J9 Nie trafiłeś");
                }
            }
        });

        J10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wylosowanePola.contains("J10")) {
                    Wynik.setText("Kliknąłeś J10 Trafiłeś");
                } else {
                    Wynik.setText("Kliknąłeś J10 Nie trafiłeś");
                }
            }
        });
    }
}
