package com.example.sqlitetesting1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);


        // Inserting Contacts
        Log.d("Insert: ", "Inserting .. ");
        db.addContact(new Contact("Ravi", "91"));
        db.addContact(new Contact("Srinivas", "92"));
        db.addContact(new Contact("Peter", "94"));
        db.addContact(new Contact("Christopher", "96"));

        // Reading all the contacts
        Log.d("Reading: ", "Reading all contacts");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn: contacts) {
            String log
                = "Id: " + cn.getID() + " ,Name" + cn.getName() + " ,Phone:" + cn.getPhoneNumber();

            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}