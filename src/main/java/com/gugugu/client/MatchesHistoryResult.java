package com.gugugu.client;

import com.gugugu.domain.HistoryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class MatchesHistoryResult {

    private RestTemplate restTemplate;

    public HistoryResult pullMatchesHistory(@Nullable String accountId, @Nullable String startAtMatchId) throws IOException {
        String accountIdStr = String.format("&account_id=%s", accountId);
        String fullUrl = ApiUrl.getFullUrl(ApiUrlMethod.History) + accountIdStr;
        if (startAtMatchId == null)  return restTemplate.getForObject(fullUrl, HistoryResult.class);
        String startAtMatchIdStr = String.format("&start_at_match_id=%s", startAtMatchId);
        fullUrl += startAtMatchIdStr;
        return  restTemplate.getForObject(fullUrl, HistoryResult.class);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}