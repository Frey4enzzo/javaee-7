package org.book.chapter07.ex3_withstate;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * EJB - компонент с сохранением состояния, при котором контейнер автоматически
 * обеспечивает поддержание диалогового состояния
 */

@Stateful
@StatefulTimeout(value = 20, unit = TimeUnit.SECONDS) // время ожидания
public class ShoppingCartEJB {

    private List<Item> cartItems = new ArrayList<>();

    public void addItem(Item item) {
        if (!cartItems.contains(item)) {
            cartItems.add(item);
        }
    }

    public void removeItem(Item item) {
        if (cartItems.contains(item)) {
            cartItems.remove(item);
        }
    }

    public Integer gentNumberOfItems() {
        if (cartItems == null || cartItems.isEmpty()) {
            return 0;
        } else return cartItems.size();
    }

    public Float getTotalPrice() {
        if (cartItems == null || cartItems.isEmpty()) {
            return 0f;
        } else {
            Float total = 0f;
            for (Item cartItem : cartItems) {
                total += cartItem.getPrice();
            }
            return total;
        }
    }

    public void empty() {cartItems.clear(); }

    @Remove // после вызова этого метода экземпляр навсегда удалится из памяти
    public void checkout(){
        // some logic
        cartItems.clear();
    }
}
