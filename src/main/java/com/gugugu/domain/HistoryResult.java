package com.gugugu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoryResult {

    private HistoryResultQueryInfo historyResultQueryInfo;

    public HistoryResultQueryInfo getHistoryResultQueryInfo() {
        return historyResultQueryInfo;
    }

    @JsonProperty("result")
    public void setHistoryResultQueryInfo(HistoryResultQueryInfo historyResultQueryInfo) {
        this.historyResultQueryInfo = historyResultQueryInfo;
    }
}