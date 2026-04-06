package com.solid.isp;

public class EmailSender {
    public static void sendEmail(IEmailable c, String message) {
        System.out.println("Enviando Email a " + c.getEmailAddress() + ": " + message);
    }
}
