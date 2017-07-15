package com.example.zamorajm_parejas;

import com.google.android.gms.common.api.GoogleApiClient;

public class Partida {
    public static GoogleApiClient mGoogleApiClient;

    public static int FILAS = -1;
    public static int COLUMNAS = -1;
    public static int[][] casillas;
    public static int turno;
    public static int puntosJ1;
    public static int puntosJ2;
    public static String tipoPartida = "LOCAL";
}