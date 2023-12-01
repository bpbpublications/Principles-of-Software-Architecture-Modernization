package com.github.diegopacheco.fixingmonoliths.contract.v1;

import java.util.Objects;
import java.util.UUID;

public class User {

    private UUID id;
    private String createdAt;
    private String email;

    public User(){}

    public User(UUID id, String createdAt, String email) {
        this.id = id;
        this.createdAt = createdAt;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createdAt='" + createdAt + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
