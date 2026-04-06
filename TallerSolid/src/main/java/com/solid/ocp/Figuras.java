package com.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Figuras {
    // Usamos una lista genérica de Figura para cumplir OCP
    private List<Figura> lista = new ArrayList<>();

    public void addFigura(Figura f) {
        lista.add(f);
    }

    public void dibujarTodas() {
        for (Figura f : lista) {
            f.dibujar();
        }
    }
}