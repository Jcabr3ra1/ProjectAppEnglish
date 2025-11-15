package com.dwin.miappingles.models;

import com.dwin.miappingles.R;

public class ModelsImc {
    private float peso;
    private float altura;
    private float resultadoImc;

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float calcularImc() {
        this.resultadoImc = (float) (this.peso / Math.pow(this.altura, 2));
        return this.resultadoImc;
    }

    public String getCategoria() {
        float imc = this.resultadoImc;

        if (imc < 18.5f) {
            return "Bajo peso";
        } else if (imc < 24.9f) {
            return "Normal";
        } else if (imc < 29.9f) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public int getImagenCategoria() {
        float imc = this.resultadoImc;

        if (imc < 18.5f) {
            return R.drawable.bajo_peso;
        } else if (imc < 24.9f) {
            return R.drawable.normal;
        } else if (imc < 29.9f) {
            return R.drawable.sobrepeso;
        } else {
            return R.drawable.obesidad;
        }
    }
}
