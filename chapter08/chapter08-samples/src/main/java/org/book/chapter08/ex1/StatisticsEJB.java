package org.book.chapter08.ex1;

import javax.ejb.Schedule;
import javax.ejb.Schedules;

/**
 * Created by Alexey on 09.09.2017.
 */

public class StatisticsEJB {

    @Schedule(dayOfMonth = "1", hour = "5", minute = "30")
    public void statisticsItemSold(){
        // ...
    }

    @Schedules({
            @Schedule(hour = "2"),
            @Schedule(hour = "14", dayOfMonth = "Wed")
    })
    public void generateReport() {
        // ...
    }

    @Schedule(minute = "*/10", hour = "*", persistent = false)
    public void refreshCache(){
        // ...
    }
}
