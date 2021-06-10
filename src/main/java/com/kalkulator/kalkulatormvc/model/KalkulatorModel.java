package com.kalkulator.kalkulatormvc.model;

public class KalkulatorModel {
    private int angka1;
    private int angka2;
    private String operator;

    public KalkulatorModel() {
    }

    public KalkulatorModel(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


}
