package com.booleanuk.movie.api.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "release")
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "release_year")
    private Integer releaseYear;

    public Release(){
        super();
    }

    public Release(Integer releaseYear){
        super();
        this.setReleaseYear(releaseYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
}