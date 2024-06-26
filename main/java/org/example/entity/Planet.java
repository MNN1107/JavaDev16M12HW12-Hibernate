package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Column(length = 5)
    @Pattern(regexp = "^[A-Z0-9]*$", message = "Incorrect format")
    private String id;

    @Column(nullable = false, length = 500)
    private String name;

    public Planet() {}

    public Planet(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
