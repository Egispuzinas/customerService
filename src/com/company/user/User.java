package com.company.user;

public class User {
    private int phone;
    private String phoneNo;
    private String email;

    public User(int phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhone(int phone) {
        this.phoneNo = "+370" + phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        if(isValid(email)){
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
