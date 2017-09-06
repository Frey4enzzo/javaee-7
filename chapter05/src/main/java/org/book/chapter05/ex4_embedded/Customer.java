package org.book.chapter05.ex4_embedded;

import javax.persistence.*;

/**
 * Address вляется постоянным атрибутом, который будет сохранен как внутренняя часть.
 * Встраиваемый объект неявно имеет такой же тип доступа как и владеющая сущность.
 * Рекомендуется явно задавать тип доступа для встраиваемого объекта
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "firstname", nullable = false, length = 50)
    private String fistName;
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastName;
    private String email;
    @Embedded
    private Address address;

    public Customer() {
    }

    public Customer(String fistName, String lastName, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
