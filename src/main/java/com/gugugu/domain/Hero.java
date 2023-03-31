package com.gugugu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hero {
    private int heroId;
    private String heroName;

    public int getHeroId() {
        return heroId;
    }

    @JsonProperty("id")
    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public String getHeroName() {
        return heroName;
    }

    @JsonProperty("name")
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
