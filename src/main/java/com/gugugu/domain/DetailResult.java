package com.gugugu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailResult {
    private Match match;

    public Match getMatch() {
        return match;
    }

    @JsonProperty("result")
    public void setMatch(Match match) {
        this.match = match;
    }

    public static void main(String[] args) {
        System.out.println("helloWorld");
    }
}
