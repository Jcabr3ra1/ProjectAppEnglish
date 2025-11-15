package com.dwin.miappingles.models.matematicas;

public class ModelSuma {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultadoSuma() {
        return num1 + num2;
    }
}
