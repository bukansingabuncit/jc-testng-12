package com.juaracoding;

public class User {

    private String username;
    private String password;
    private String errorMessage = "Invalid usernamw or password";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    // buat check method/login menggunakan return boolean
    // boolean checkLogin()

    public boolean checkLogin() {
        if (username == getUsername() && password == getPassword()){
            return true;
        } else {
            return false;
        }
    }

}
