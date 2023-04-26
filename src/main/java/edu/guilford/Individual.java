package edu.guilford;

public class Individual {
    // three attributes for name, email, and phone
    private String name;
    private String email;
    private String phone;

    // constructor
    public Individual() {
        // set name to "John Doe"
        name = "";
        // set email to "jdoe@guilford"
        email = "";
        // set phone to "555-555-5555"
        phone = "";
    }

    // Constructor that takes three String parameters
    public Individual(String name, String email, String phone) {
        // set name to the name parameter
        this.name = name;
        // set email to the email parameter
        this.email = email;
        // set phone to the phone parameter
        this.phone = phone;
    }

    // getters and setters
    // getName
    public String getName() {
        // return name
        return name;
    }

    // setName
    public void setName(String name) {
        // set name to the name parameter
        this.name = name;
    }

    // getEmail
    public String getEmail() {
        // return email
        return email;
    }

    // setEmail
    public void setEmail(String email) {
        // set email to the email parameter
        this.email = email;
    }

    // getPhone
    public String getPhone() {
        // return phone
        return phone;
    }

    // setPhone
    public void setPhone(String phone) {
        // set phone to the phone parameter
        this.phone = phone;
    }

    // toString
    @Override
    public String toString() {
        // return a String representation of the object
        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone;
    }
}
