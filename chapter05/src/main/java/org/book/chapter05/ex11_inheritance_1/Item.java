package org.book.chapter05.ex11_inheritance_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Inheritance - определяет стратегию наследования
 * По умолчанию стратегия ОДНА ТАБЛИЦА НА КЛАСС (в этом примере)
 * При использовании данной стратегии, все сущности окажутся в одной таблице,
 * т.е. все атрибуты сущностей будут отображены в одной таблице ITEM
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
