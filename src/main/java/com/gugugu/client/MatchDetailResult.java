package com.gugugu.client;

import com.gugugu.domain.DetailResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class MatchDetailResult {

    private RestTemplate restTemplate;

    public DetailResult pullMatchDetail(String matchId) throws IOException {
        String matchIdStr = String.format("&match_id=%s", matchId);
        String fullUrl = ApiUrl.getFullUrl(ApiUrlMethod.Detail) + matchIdStr;
        return  restTemplate.getForObject(fullUrl, DetailResult.class);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
