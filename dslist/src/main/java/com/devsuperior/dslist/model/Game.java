package com.devsuperior.dslist.model;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "tb_game")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    

    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;


    

   public Game (){

    }


    public Game(Long id, String title, Integer year,  String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription ){
       
        this.id = id;
        this.title=title;
        this.year = year;
        this.genre=genre;
        this.platforms=platforms;
        this.score=score;
        this.imgUrl=imgUrl;
        this.shortDescription=shortDescription;
        this.longDescription=longDescription;
        
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return this.platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public Double getScore(){
        return this.score;
    
    }
    public void setScore(Double score){
        this.score = score;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(year, game.year) && Objects.equals(genre, game.genre) && Objects.equals(platforms, game.platforms) && Objects.equals(score, game.score) && Objects.equals(imgUrl, game.imgUrl) && Objects.equals(shortDescription, game.shortDescription) && Objects.equals(longDescription, game.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, genre, platforms, score, imgUrl, shortDescription, longDescription);
    }
  
}

    
