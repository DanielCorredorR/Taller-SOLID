package com.solid.srp;

public class CalculadorIVA {
    public float calcularIVA(float importe, int codigo) {
        // Punto 3: Si el código es 0, no se aplica IVA
        if (codigo == 0) return 0;
        // Punto 2: IVA cambiado al 18% (0.18f)
        return (float) (importe * 0.18);
    }
}