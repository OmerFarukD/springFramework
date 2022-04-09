package com.qubitfaruk.ioc;

public class Calisan {
    private Patron patron;

    public Calisan() {
        patron=new Patron();
    }
    public String getData(String data){
        return patron.surum(data);
    }
}
