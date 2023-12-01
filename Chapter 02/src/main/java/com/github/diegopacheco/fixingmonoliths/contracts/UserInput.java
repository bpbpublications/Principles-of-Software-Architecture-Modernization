package com.github.diegopacheco.fixingmonoliths.contracts;

import java.util.Objects;

public class UserInput {

    private Long id;

    public UserInput(){}

    public UserInput(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInput user = (UserInput) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "id=" + id +
                '}';
    }

}