package org.book.chapter07.ex2_withoutstate;

import javax.persistence.*;
import javax.validation.constraints.Size;
import static org.book.chapter07.ex2_withoutstate.CD.FIND_ALL;

/**
 * Created by Alexey on 09.09.2017.
 */

@Entity
@NamedQuery(name = FIND_ALL, query = "SELECT c FROM CD c")
public class CD {

    public static final String FIND_ALL = "CD.findAllCDs";

    @Id @GeneratedValue
    private Long id;
    private String title;
    private Double price;
    @Size(max = 2000)
    private String description;
    @Lob
    private byte[] cover;
    private String musicCompany;

    public CD() {
    }

    public CD(String title, Double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
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

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public String getMusicCompany() {
        return musicCompany;
    }

    public void setMusicCompany(String musicCompany) {
        this.musicCompany = musicCompany;
    }
}
