package com.solid.isp;

public class GmailAccount implements IEmailable {
    String name, emailAddress;

    @Override
    public String getEmailAddress() { return emailAddress; }
}