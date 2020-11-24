package com.company;

public class Customer {
    private String fName;
    private String lName;
    private String email;

    public Customer(String _fName, String _lName, String _email) {
        fName = _fName;
        lName = _lName;
        email = _email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String _lName) {
        lName = _lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String _fName) {
        fName = _fName;
    }
}
