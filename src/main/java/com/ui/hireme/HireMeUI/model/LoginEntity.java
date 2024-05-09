package com.ui.hireme.HireMeUI.model;

import java.util.Objects;

public class LoginEntity {

    private String email;

    private String psw;

    public LoginEntity(String email, String psw) {
        this.email = email;
        this.psw = psw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "email='" + email + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginEntity that = (LoginEntity) o;
        return Objects.equals(email, that.email) && Objects.equals(psw, that.psw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, psw);
    }
}
