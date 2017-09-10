package org.book.chapter08.ex3_security_declar;

import javax.persistence.*;
import java.util.HashMap;

/**
 * Created by Alexey on 09.09.2017.
 */

@Entity
@NamedQuery(name = "CD.findAllCDs", query = "SELECT c FROM CD c")
public class CD {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Float price;
    @Column(length = 2000)
    private String description;
    @Lob
    private byte[] cover;
    private String musicCompany;
    private Integer numberOfCDs;
    private Float totalDuration;
    private String genre;

    public CD() {
    }

    public CD(String title, Float price, String description, HashMap<Integer, String> tracks) {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
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

    public Integer getNumberOfCDs() {
        return numberOfCDs;
    }

    public void setNumberOfCDs(Integer numberOfCDs) {
        this.numberOfCDs = numberOfCDs;
    }

    public Float getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Float totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
