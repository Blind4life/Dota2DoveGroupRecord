package com.gugugu.client;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ApiUrl {
    /***
     * A static class to generate the full url for HTTP request
     * IdString need to correspond to the ApiUrlMethod, ie. ApiUrlMethod.History => <&account_id>[&start_at_match_id]
     *                                                      ApiUrlMethod.History => <&match_id>
      * @param apiUrlMethod
     * @return
     * @throws IOException
     */
    private final static String path = "src/main/resources/ApiRelated.properties";

    public static String getFullUrl(ApiUrlMethod apiUrlMethod) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(path));
        String url = properties.getProperty("api.url");
        String key = properties.getProperty("api.key");
        return String.format(url, apiUrlMethod.getApiMethod(), key);
    }
}