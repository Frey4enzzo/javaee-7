package org.book.chapter05.ex5_onetoone_oneway;

import javax.persistence.*;

/**
 * Пример двунаправленной связи. Customer является владельцем связи,
 * т.к. содержит внешний ключ address. Стр. 195 книги
 * @JoinColumn определяет столбец соединения, т.е. внешний ключ владеющей стороны (столбец соединения).
 * В этом примере @JoinColumn так же используется для переименования стобца внешнего ключа в address_fk,
 * и делает связь обязательной отклонив значение null
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String fistName;
    private String lastName;
    private String email;
    String phonenumber;

    @OneToOne
    @JoinColumn(name = "address_fk", nullable = false)
    private Address address;

    public Customer() {
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
