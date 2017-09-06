package org.book.chapter05.ex9_manytomany_twoways;

import javax.persistence.*;
import java.util.List;

/**
 *
 */

@Entity
public class Artist {

    @Id @GeneratedValue
    private Long id;
    private String fistName;
    private String lastName;
    @ManyToMany
    @JoinTable(name = "jnd_art_cd",
                joinColumns = @JoinColumn(name = "artist_fk"),
                inverseJoinColumns = @JoinColumn(name = "cd_fk"))
    private List<CD> appearsOnCDs;

    public Artist() {
    }

    public Artist(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<CD> getAppearsOnCDs() {
        return appearsOnCDs;
    }

    public void setAppearsOnCDs(List<CD> appearsOnCDs) {
        this.appearsOnCDs = appearsOnCDs;
    }
}
