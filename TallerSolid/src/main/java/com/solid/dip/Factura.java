package com.solid.dip;

public class Factura {
    public float importeFactura;
    public int porcentajeDeduccion;
    public float importeTotal;

    // Aquí está la magia: dependemos de interfaces, no de clases fijas
    private final ServicioIVA iva;
    private final ServicioDeduccion deduccion;

    // Inyección de dependencias por constructor
    public Factura(ServicioIVA iva, ServicioDeduccion deduccion) {
        this.iva = iva;
        this.deduccion = deduccion;
    }

    public void calcularTotal() {
        float montoIva = iva.calcularIva(importeFactura);
        float montoDeduccion = deduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        this.importeTotal = (importeFactura - montoDeduccion) + montoIva;
    }
}