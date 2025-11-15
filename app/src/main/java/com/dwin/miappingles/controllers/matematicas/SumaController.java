package com.dwin.miappingles.controllers.matematicas;

import com.dwin.miappingles.models.matematicas.ModelSuma;

public class SumaController {

    private ModelSuma model;

    public SumaController() {
        model = new ModelSuma();
    }

    public int procesarSuma(String n1, String n2) throws NumberFormatException {

        if (n1.isEmpty() || n2.isEmpty()) {
            throw new NumberFormatException("Campos vacíos");
        }

        model.setNum1(Integer.parseInt(n1));
        model.setNum2(Integer.parseInt(n2));

        return model.getResultadoSuma();
    }
}
