package com.bucur.testing.tdd;

import java.util.Objects;

public class UserDetails {

    public String name;
    public String email;

    public UserDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
