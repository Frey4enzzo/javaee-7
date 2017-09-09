package org.book.chapter07.ex5_singleton;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alexey on 09.09.2017.
 */

//@Startup // инициализация компонента во время запуска приложения
@Singleton
public class CacheEJB {

    private Map<Long, Object> cache = new HashMap<>();

    public void addToCache(Long id, Object object) {
        if (!cache.containsKey(id)) {
            cache.put(id, object);
        }
    }

    public void removeFromCache(Long id) {
        if (cache.containsKey(id)) {
            cache.remove(id);
        }
    }

    public Object getFromCache(Long id) {
        if (cache.containsKey(id)) {
            return cache.get(id);
        } else {
            return null;
        }
    }

    public Integer getNumbersOfItem() {
        if (cache == null || cache.isEmpty()) {
            return 0;
        } else {
            return cache.size();
        }
    }
}
