package com.example.spinnerdemotdi;

public class Country {
    private String Name;
    private int imagC;

    public Country(String name, int imagC) {
        Name = name;
        this.imagC = imagC;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImagC() {
        return imagC;
    }

    public void setImagC(int imagC) {
        this.imagC = imagC;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name='" + Name + '\'' +
                ", imagC=" + imagC +
                '}';
    }
}
