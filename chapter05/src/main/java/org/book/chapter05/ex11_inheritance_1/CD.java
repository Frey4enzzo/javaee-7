package org.book.chapter05.ex11_inheritance_1;

import javax.persistence.Entity;

/**
 *
 */

@Entity
public class CD extends Item {

    private String musicCompany;
    private Integer numberOfCDs;
    private String genre;

    public CD() {}

    public CD(String title, Double price, String description, String musicCompany, Integer numberOfCDs, String genre) {
        super(title, price, description);
        this.musicCompany = musicCompany;
        this.numberOfCDs = numberOfCDs;
        this.genre = genre;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
