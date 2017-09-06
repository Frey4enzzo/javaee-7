package org.book.chapter05.ex10_orderby;

import javax.persistence.*;
import java.util.List;

/**
 * @OrderBy - обеспечивает динамическое упорядочевание. Принимает имена атрибутов
 * которые должны быть упорядочены, а так же метод упорядочивания ASC или DESC
 */

@Entity
public class News {

    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String content;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @OrderBy("postedDate DESC")
    private List<Comment> comments; // комментарии к новости упорядочиваются согласно дате размещения в убывающем порядке

    public News() {
    }

    public News(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
