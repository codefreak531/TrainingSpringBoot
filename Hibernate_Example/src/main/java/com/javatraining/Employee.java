package com.javatraining;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private int salary;

    public Employee() {
    }

    public Employee(String fname, String lname, int salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

