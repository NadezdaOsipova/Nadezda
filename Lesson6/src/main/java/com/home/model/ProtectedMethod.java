package com.home.model;

public class ProtectedMethod {
    private Addres addres;

    public ProtectedMethod(Addres addres) {
        this.addres = addres;
    }

    public void info(){
   Person person = new Person();
    person.setAddres();
}
}
