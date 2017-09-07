package org.book.chapter05.ex13_attrubutes_override;

import javax.persistence.*;

/**
 *
 */

@Entity
@Table(name = "cd")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "cd_id")),
        @AttributeOverride(name = "title", column = @Column(name = "cd_title")),
        @AttributeOverride(name = "description", column = @Column(name = "cd_description"))
})
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
