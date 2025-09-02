package com.example.personaje_hilos2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnEquipCasco, btnEquipPechera, btnEquipPantalon, btnEquipBotas;
    private ProgressBar progressCasco, progressPechera, progressPantalon, progressBotas;
    private ImageView imgCasco, imgPechera, imgPantalon, imgBotas;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean estadoCasco, estadoPechera, estadoPantalon, estadoBotas = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEquipCasco = findViewById(R.id.btnEquipCasco);
        btnEquipPechera = findViewById(R.id.btnEquipPechera);
        btnEquipPantalon = findViewById(R.id.btnEquipPantalon);
        btnEquipBotas = findViewById(R.id.btnEquipBotas);

        progressCasco = findViewById(R.id.progressCasco);
        progressPechera = findViewById(R.id.progressPechera);
        progressPantalon = findViewById(R.id.progressPantalon);
        progressBotas = findViewById(R.id.progressBotas);

        imgCasco = findViewById(R.id.imgCasco);
        imgPechera = findViewById(R.id.imgPechera);
        imgPantalon = findViewById(R.id.imgPantalon);
        imgBotas = findViewById(R.id.imgBotas);

        btnEquipCasco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (estadoCasco) return;
                estadoCasco = true;
                progressCasco.setProgress(0);
                Thread threadCasco = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i <= 100; i++) {
                                Thread.sleep(100);
                                int progress = i;

                                handler.post(new Runnable() {
                                    @Override
                                    public void run(){
                                        progressCasco.setProgress(progress);
                                    }
                                });
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if(progressCasco.getProgress() == 100) imgCasco.setVisibility(View.VISIBLE);
                                    }
                                });
                            }
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                threadCasco.start();
            }
        });

        btnEquipPechera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (estadoPechera) return;
                estadoPechera = true;
                progressPechera.setProgress(0);
                Thread threadPechera = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i <= 100; i++) {
                                Thread.sleep(100);
                                int progress = i;

                                handler.post(new Runnable() {
                                    @Override
                                    public void run(){
                                        progressPechera.setProgress(progress);
                                    }
                                });
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (progressPechera.getProgress() == 100) imgPechera.setVisibility(View.VISIBLE);
                                    }
                                });
                            }
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                };
                threadPechera.start();
            }
        });

        btnEquipPantalon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (estadoPantalon) return;
                estadoPantalon = true;
                progressPantalon.setProgress(0);
                Thread threadPantalon = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i <= 100; i++) {
                                Thread.sleep(100);
                                int progress = i;

                                handler.post(new Runnable() {
                                    @Override
                                    public void run(){
                                        progressPantalon.setProgress(progress);
                                    }
                                });
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (progressPantalon.getProgress() == 100) imgPantalon.setVisibility(View.VISIBLE);
                                    }
                                });
                            }
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                threadPantalon.start();
            }
        });

        btnEquipBotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (estadoBotas) return;
                estadoBotas = true;
                progressBotas.setProgress(0);
                Thread threadBotas = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i <= 100; i++) {
                                Thread.sleep(100);
                                int progress = i;

                                handler.post(new Runnable() {
                                    @Override
                                    public void run(){
                                        progressBotas.setProgress(progress);
                                    }
                                });
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (progressBotas.getProgress() == 100) imgBotas.setVisibility(View.VISIBLE);
                                    }
                                });
                            }
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                threadBotas.start();
            }
        });
    }
}