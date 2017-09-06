package org.book.chapter05.ex3_accesstype;

import javax.persistence.*;

/**
 * AccessType.FIELD - принимаются во внимание только аннотации отображения аттрибутов
 * AccessType.PROPERTY - принимаются во внимание только аннотации отображения свойств
 */

@Entity
@Access(AccessType.FIELD)
public class Customer {

    @Id
    private Long id;
    @Column(name = "firstname", nullable = false, length = 50)
    private String fistName;
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastName;

    public Customer() {
    }

    public Customer(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
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
}
