package com.gugugu.client;

public enum ApiUrlMethod {
    History("GetMatchHistory"),
    Detail("GetMatchDetails");

    private final String apiMethod;

    ApiUrlMethod(String apiMethod) {
        this.apiMethod = apiMethod;
    }

    public String getApiMethod() {
        return apiMethod;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
