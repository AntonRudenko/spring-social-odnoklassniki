package org.springframework.social.odnoklassniki.api.impl;

import org.springframework.social.ApiException;
import org.springframework.social.UncategorizedApiException;
import org.springframework.social.odnoklassniki.api.OdnoklassnikiProfile;
import org.springframework.social.odnoklassniki.api.UsersOperations;
import org.springframework.social.support.URIBuilder;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anton Rudenko.
 */
public class UsersTemplate extends AbstractOdnoklassnikiOperations implements UsersOperations {

    private RestTemplate restTemplate;

    public UsersTemplate(RestTemplate restTemplate, boolean isAuthorizedForUser, String clientId, String accessToken, String clientPublicKey, String clientSecret) {
        super(isAuthorizedForUser, clientId, accessToken, clientPublicKey, clientSecret);
        this.restTemplate = restTemplate;
    }

    @Override
    public OdnoklassnikiProfile currentUser() {
        requireAuthorization();

        Map<String, String> params = new HashMap<String, String>();
        params.put("method", "users.getCurrentUser");
        URI uri = URIBuilder.fromUri(makeOperationURL(params)).build();

        OdnoklassnikiProfile odnoklassnikiProfile = restTemplate.getForObject(uri, OdnoklassnikiProfile.class);

        if (odnoklassnikiProfile.getUid() == null) throw new ApiException("odnoklassniki", "Error consuming odnoklassniki REST API");

        return odnoklassnikiProfile;
    }
}
