package com.example.sqlitetesting1;

public class Contact {
    // Data initialize
    int _id;
    String _name, _phone_number;

    // Constructor default
    public Contact() {}

    // Constructor with 2 params
    public Contact(
        String _name,
        String _phone_number
    ) {
        this._name = _name;
        this._phone_number = _phone_number;
    }

    // Constructor with 3 params
    public Contact(
        int id,
        String _name,
        String _phone_number
    ) {
        this._id = id;
        this._name = _name;
        this._phone_number = _phone_number;
    }

    // Getter and Setter
    // Getter
    public int getID() {
        return this._id;
    }

    public String getName() {
        return this._name;
    }

    public String getPhoneNumber() {
        return this._phone_number;
    }

    // Setter
    public void setID(int id) {
        this._id = id;
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setPhoneNumber(String _phone_number) {
        this._phone_number = _phone_number;
    }
}
