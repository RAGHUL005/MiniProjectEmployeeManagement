package com.library.model;

public class Book {
    private String name;
    private String Dept;
    private boolean Dob;

    public Book(String name, String Dept) {
        this.name = name;
        this.Dept = Dept;
        this.Dob = true;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public boolean Dob() {
        return Dob;
    }

    public void Dob(boolean Dob) {
        this.Dob = Dob;
    }

    @Override
    public String toString() {
        return name + " by " + Dept + " [" + (Dob ? "dob" : "Borrowed") + "]";
    }
}