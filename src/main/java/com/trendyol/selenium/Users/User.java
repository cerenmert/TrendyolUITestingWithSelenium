package com.trendyol.selenium.Users;

public class User {

    private String email;
    private String password;

    //Constructor is created.
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //en üstteki email ve password field'leri best practice olarak private oluşturulmalı.
    //bu fieldlere ulaşmak için aşağıdaki gibi methodlar (getEmail..) oluştururuz.
    //önce bunlara "get" ile eriştik, ancak bunları bir şeye "set" etmemiz lazım. this.email=email gibi..
    //Yoksa null gelir. nullPointerException patlatır.
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
