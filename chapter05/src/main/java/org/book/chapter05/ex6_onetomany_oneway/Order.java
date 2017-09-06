package org.book.chapter05.ex6_onetomany_oneway;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Заказ на покупку включает несколько строк заказа.
 * Order - источник связи - сторона "одного"
 */

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

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
