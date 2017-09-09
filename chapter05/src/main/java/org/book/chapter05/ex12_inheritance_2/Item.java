package org.book.chapter05.ex12_inheritance_2;

import javax.persistence.*;

/**
 * @Inheritance - определяет стратегию наследования
 * Стратегия ТАБЛИЦА НА КОНКРЕТНЫЙ КЛАСС - каждая сущность отображается в свою таблицу, при этом
 * аттрибуты корневой сущности будут отображены в столбцы дочерней сущности
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Item {

    @Id
    @GeneratedValue
    protected Long id;
    protected String title;
    protected Double price;
    protected String description;

    public Item() {
    }

    public Item(String title, Double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
