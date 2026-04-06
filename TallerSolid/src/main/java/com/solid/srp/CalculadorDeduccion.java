package com.solid.srp;

public class CalculadorDeduccion {
    public float calcularDeduccion(float importe, int porcentaje) {
        // Punto 1: Nueva lógica de negocio
        if (importe > 10000) {
            return (importe * porcentaje + 3) / 100.0f;
        }
        return (importe * porcentaje) / 100.0f;
    }
}
