package org.book.chapter05.ex5_onetoone_oneway;

import javax.persistence.*;

/**
 * Address - противоположный владелец связи, поскольку обладает элементом mappedBy.
 * mappedBy говорит о том, что столбец соединения (address) указан на другом конце связи
 */

@Entity
public class Address {

    @Id @GeneratedValue
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    @OneToOne(mappedBy = "address")
    private Customer customer;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

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
