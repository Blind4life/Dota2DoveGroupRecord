package com.gugugu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HistoryResultQueryInfo {
    private int status;
    private int numResults;
    private int totalResults;
    private int resultsRemaining;
    private List<Match> matches;

    public int getResultsRemaining() {
        return resultsRemaining;
    }
    @JsonProperty("results_remaining")
    public void setResultsRemaining(int resultsRemaining) {
        this.resultsRemaining = resultsRemaining;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "HistoryResultQueryInfo{" + "\n" +
                "status=" + status + "\n" +
                ", numResults=" + numResults + "\n" +
                ", totalResults=" + totalResults + "\n" +
                ", resultsRemaining=" + resultsRemaining + "\n" +
                ", matches=" + matches + "\n" +
                '}';
    }
}
