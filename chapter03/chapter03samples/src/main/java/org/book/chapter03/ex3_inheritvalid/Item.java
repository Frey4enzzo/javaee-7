package org.book.chapter03.ex3_inheritvalid;


import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class Item {

    @NotNull
    protected Long id;

    protected String title;
    protected Double price;
    protected String description;

    public Double calculateVAT() {
        return price * 0.196;
    }

    public Double calculatePrice(@DecimalMin("1.2") Double rate) {
        return price * rate;
    }
}
