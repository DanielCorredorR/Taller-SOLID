package com.solid.lsp;

import java.util.ArrayList;
import java.util.List;

public class Configuracion {
    // Lista para todo lo que se puede leer
    List<Readable> recursosLectura = new ArrayList<>();
    // Lista solo para lo que se puede guardar
    List<Persistable> recursosEscritura = new ArrayList<>();

    public void cargarTodo() {
        for (Readable r : recursosLectura) r.load();
    }

    public void salvarTodo() {
        for (Persistable p : recursosEscritura) p.save();
    }
}
