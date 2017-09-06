package org.book.chapter05.ex9_manytomany_twoways;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 *
 */

@Entity
public class CD {

    @Id @GeneratedValue
    private Long id;
    private String title;
    private Double price;
    private String description;
    @ManyToMany(mappedBy = "appearsOnCDs")
    private List<Artist> createdByArtists;

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

    public void setId(Long id) {
        this.id = id;
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

    public List<Artist> getCreatedByArtists() {
        return createdByArtists;
    }

    public void setCreatedByArtists(List<Artist> createdByArtists) {
        this.createdByArtists = createdByArtists;
    }
}
