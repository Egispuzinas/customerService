package com.company.user;

public class User {
    private int phone;
    private String phoneNo;
    private String email;

    public User(int phone, String email) {
        if(isValidPhone(phone)){
            this.phoneNo = setPhone(phone);
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Bad phone number");
        }
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Bad email address");
        }
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    private static boolean isValidPhone(int phone) {
        String phoneToCheck;
        phoneToCheck = "" + phone;
        return phoneToCheck.length() == 8;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String setPhone(int phone) {
        this.phoneNo = "+370" + phone;
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
