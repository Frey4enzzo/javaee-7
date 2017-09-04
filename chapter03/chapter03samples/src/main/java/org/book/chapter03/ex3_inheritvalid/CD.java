package org.book.chapter03.ex3_inheritvalid;

import javax.validation.constraints.*;

/**
 * Субкласс наследует так же все ограничения суперкласса
 */

public class CD extends Item {

    @Pattern(regexp = "[A-Z][a-z]{1,}")
    private String musicCompany;
    @Max(value = 5)
    private Integer numberOfCDs;
    private Double totalDuration;
    @MusicGenre
    private String genre;

    public CD() {
    }

    public CD(String musicCompany, Integer numberOfCDs, Double totalDuration, String genre) {
        this.musicCompany = musicCompany;
        this.numberOfCDs = numberOfCDs;
        this.totalDuration = totalDuration;
        this.genre = genre;
    }

    @NotNull
    @DecimalMin("5.8")
    public Double calculatePrice(Double rate) {
        return price * rate;
    }
}
