package org.book.chapter05.ex13_attrubutes_override;

import javax.persistence.*;

/**
 * @Inheritance - определяет стратегию наследования
 * Стратегия ТАБЛИЦА НА КОНКРЕТНЫЙ КЛАСС - каждая сущность отображается в свою таблицу, при этом
 * аттрибуты корневой сущности будут отображены в столбцы дочерней сущности
 */

@Entity
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
