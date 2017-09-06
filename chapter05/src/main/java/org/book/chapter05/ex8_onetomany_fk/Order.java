package org.book.chapter05.ex8_onetomany_fk;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Внешний ключ переименовывается с помощью аннотации в order_fk
 * и располагается в целевой таблице ORDER_LINE
 */

@Entity
public class Order {

    @Id @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_fk")
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
