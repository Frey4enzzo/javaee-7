package org.book.chapter05.ex7_onetomany_sequence;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Использование таблицы соединения - правило по умолчанию для связи "один ко многим"
 * joinColumns - характеризует владеющую сторону (владелец связи) и ссылается на таблицу ORDER
 * inverseJoinColumns - определяет противоположную сторону (цель связи) и ссылается на ORDER_LINE
 */

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @OneToMany
    @JoinTable(name = "jnd_ord_line",
                joinColumns = @JoinColumn(name = "order_fk"),
                inverseJoinColumns = @JoinColumn(name = "order_line_fk"))
    private List<OrderLine> orderLines;

    // конструктор
    public Order() {
        this.creationDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
