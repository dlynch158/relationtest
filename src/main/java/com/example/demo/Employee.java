package com.example.demo;

import org.springframework.hateoas.server.core.Relation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Relation(collectionRelation = "workers", itemRelation = "worker")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;


    private String lastName;
    private String role;

    Employee() {}

    Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Long getId() { return this.id; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() { return firstName + " " + lastName; }
}
