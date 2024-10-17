package org.alejanf.webapp.serverlet;

public class Conversor {

    double km;
    double millas;

    final double MILLAS_POR_KM = 0.621371;
    final double KM_POR_MILLAS = 1.60934;


    public Conversor() {
        super();
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMillas() {
        return millas;
    }

    public void setMillas(double millas) {
        this.millas = millas;
    }

    public double getMILLAS_POR_KM() {
        return MILLAS_POR_KM;
    }

    public double getKM_POR_MILLAS() {
        return KM_POR_MILLAS;
    }


    public double convertirKmAMillas(double km) {
        return km * MILLAS_POR_KM;
    }

    public double convertirMillasAKm(double millas) {
        return millas * KM_POR_MILLAS;
    }














}
