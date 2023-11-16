package com.portfolioemanuel.dto;

import com.portfolioemanuel.entities.Game;
import com.portfolioemanuel.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
        id = id;
        title = title;
        year = year;
        imgUrl = imgUrl;
        shortDescription = shortDescription;
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgURL();
        shortDescription = projection.getShorDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
