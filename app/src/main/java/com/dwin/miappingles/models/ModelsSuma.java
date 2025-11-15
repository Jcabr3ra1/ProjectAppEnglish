package com.dwin.miappingles.models;

public class ModelsSuma {
    private int num1;
    private int num2;
    private int resultadoSuma;


    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultadoSuma() {
        return resultadoSuma;
    }

    public void calculoSuma(){
        this.resultadoSuma = this.num1 + this.num2;
    }

}

