package com.dwin.miappingles.controllers.matematicas;

import com.dwin.miappingles.models.matematicas.ModelsImc;

public class ImcController {

    private ModelsImc model;

    public ImcController() {
        model = new ModelsImc();
    }

    public float calcularImc(String pesoStr, String alturaStr) {
        if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
            throw new NumberFormatException("Campos vacíos");
        }

        float peso = Float.parseFloat(pesoStr);
        float altura = Float.parseFloat(alturaStr);

        model.setPeso(peso);
        model.setAltura(altura);

        return model.calcularImc();
    }

    public String obtenerCategoria() {
        return model.getCategoria();
    }

    public int obtenerImagenCategoria() {
        return model.getImagenCategoria();
    }
}
