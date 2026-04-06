package com.solid.isp;

public class Main {
    public static void main(String[] args) {
        GmailAccount cuenta = new GmailAccount();
        cuenta.emailAddress = "dacorredor15@unisalle.edu.co";
        
        // Esto funciona perfecto
        EmailSender.sendEmail(cuenta, "¡Taller SOLID terminado!");
        
        // Si intentaras pasarlo a un SMSSender, el compilador no te dejaría.
        // ¡Eso es seguridad de diseño!
    }
}
