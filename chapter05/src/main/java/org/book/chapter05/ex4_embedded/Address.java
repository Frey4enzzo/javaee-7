package org.book.chapter05.ex4_embedded;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Встраиваемый объект (объект без постоянного идентификатора).
 * Может быть только встроен во владеющую сущность.
 * Каждый аттрибут будет отображаться в таблицу владующей сущности(Customer)
 */

@Embeddable
@Access(AccessType.PROPERTY)
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address() {
    }
    @Column(nullable = false)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Column(nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Column(length = 3)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
