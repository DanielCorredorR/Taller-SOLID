package com.solid.isp;

public class Contacto implements IEmailable, ISmsable {
    String name, address, emailAddress, telephone;

    @Override
    public String getEmailAddress() { return emailAddress; }
    @Override
    public String getTelephone() { return telephone; }
}
