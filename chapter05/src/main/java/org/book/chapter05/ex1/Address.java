package org.book.chapter05.ex1;

import javax.persistence.*;

/**
 * Задача - разбросать данные сущности по нескольким таблицам (вторичным таблицам)
 * @SecondaryTable - ассоциирует вторичную таблицу с сущностью.
 * Две вторичные таблицы CITY и COUNTRY
 */

@Entity
@SecondaryTables({
        @SecondaryTable(name = "city"),
        @SecondaryTable(name = "country")
})
public class Address {

    @Id
    private Long id;
    private String street;
    @Column(table = "city")
    private String city;
    private String state;
    @Column(table = "city")
    private String zipcode;
    @Column(table = "country")
    private String country;
}
