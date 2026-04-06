package com.solid.lsp;

public class ConfiguracionSistema implements Persistable {
    @Override
    public void load() { System.out.println("Configuracion sistema cargada"); }
    @Override
    public void save() { System.out.println("Configuracion sistema almacenada"); }
}