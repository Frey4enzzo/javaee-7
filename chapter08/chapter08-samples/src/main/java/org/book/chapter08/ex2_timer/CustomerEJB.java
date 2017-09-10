package org.book.chapter08.ex2_timer;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * SchedulerExpression создает выражения на основе календаря.
 * Пример: создание таймера по календарю, на основе дня рождения заказчика.
 *
 * После создания таймера контейнер будет вызывать метод помеченный @Timeout каждый год.
 * Поскольку таймер сериализуется вместе с объектом customer, то метод может
 * получить к нему доступ, вызвав метод getInfo()
 */

@Stateless
public class CustomerEJB {

    @Resource // внедряем ссылку на службу таймера
    TimerService timerService;

    @PersistenceContext(unitName = "chapter08")
    private EntityManager em;

    public void createCustomer(Customer customer) {
        em.persist(customer);
        ScheduleExpression birthDay = new ScheduleExpression().dayOfMonth(customer.getBirthDay()).month(customer.getBirthMonth());
        // создание таймера
        timerService.createCalendarTimer(birthDay, new TimerConfig(customer, true));
    }

    @Timeout
    public void sendBirthdayEmail(Timer timer) {
        Customer customer = (Customer) timer.getInfo();
        // ...
    }
}
