package com.solid.srp;

import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeTotal;
    public int porcentajeDeduccion;

    // Instanciamos los ayudantes
    private CalculadorIVA calculadorIVA = new CalculadorIVA();
    private CalculadorDeduccion calculadorDeduccion = new CalculadorDeduccion();

    public void calcularTotal() {
        // Convertimos el String codigo a int para la lógica del IVA (asumiendo formato numérico)
        int codInt = Integer.parseInt(codigo);
        
        float deduccion = calculadorDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        float iva = calculadorIVA.calcularIVA(importeFactura, codInt);
        
        this.importeTotal = (importeFactura - deduccion) + iva;
    }
}