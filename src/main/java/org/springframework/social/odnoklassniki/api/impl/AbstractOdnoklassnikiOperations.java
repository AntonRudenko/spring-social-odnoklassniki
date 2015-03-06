package org.springframework.social.odnoklassniki.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.ParameterMap;
import org.springframework.util.DigestUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Anton Rudenko.
 */
public class AbstractOdnoklassnikiOperations {

    private final static String ODNOKLASSNIKI_REST_URL = "http://api.odnoklassniki.ru/fb.do?";

    private final boolean isAuthorized;
    private final String clientId;
    private final String accessToken;
    private final String clientSecret;
    private final String clientPublicKey;

    public AbstractOdnoklassnikiOperations(boolean isAuthorized, String clientId, String accessToken, String clientPublicKey, String clientSecret) {
        this.isAuthorized = isAuthorized;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientPublicKey = clientPublicKey;
        this.accessToken = accessToken;
    }

    protected void requireAuthorization() {
        if (!isAuthorized) {
            throw new MissingAuthorizationException("odnoklassniki");
        }
    }

    protected String makeOperationURL(Map<String, String> params) {
        Map<String, String > resultParams = prepareParamsMap();
        resultParams.putAll(params);
        resultParams.put("sig", encodeSignature(resultParams));

        return UriComponentsBuilder.fromHttpUrl(ODNOKLASSNIKI_REST_URL).queryParams(mapToMultiValueMap(resultParams)).build().toUriString();
    }

    private MultiValueMap<String, String> mapToMultiValueMap(Map<String, String> map) {
        MultiValueMap<String, String> result = new LinkedMultiValueMap<>();
        result.setAll(map);
        return result;
    }

    private Map<String, String> prepareParamsMap() {
        Map<String, String> result =  new TreeMap<>(String::compareTo);
        result.put("access_token", this.accessToken);
        result.put("application_key", this.clientPublicKey);
        return result;
    }

    private String encode(String sign) {
        return DigestUtils.md5DigestAsHex(sign.getBytes());
    }

    private String encodeSignature(Map<String, String> params) {
        String first = "application_key=" + params.get("application_key")  + "method=" + params.get("method");
        String second = params.get("access_token") + clientSecret;
        return encode(first + encode(second));
    }
}
