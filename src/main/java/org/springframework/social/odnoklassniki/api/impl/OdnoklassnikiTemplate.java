package org.springframework.social.odnoklassniki.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.odnoklassniki.api.Odnoklassniki;
import org.springframework.social.odnoklassniki.api.UsersOperations;

/**
 * @author Anton Rudenko.
 */
public class OdnoklassnikiTemplate extends AbstractOAuth2ApiBinding implements Odnoklassniki {

    private UsersOperations usersOperations;

    private String clientId;
    private String clientSecret;
    private String clientPublicKey;
    private String accessToken;

    public OdnoklassnikiTemplate(String clientId, String clientPublicKey, String clientSecret, String accessToken) {
        super(accessToken);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientPublicKey = clientPublicKey;
        this.accessToken = accessToken;
        initialize();
    }

    @Override
    public UsersOperations usersOperations() {
        return usersOperations;
    }

    private void initialize() {
        usersOperations = new UsersTemplate(getRestTemplate(), isAuthorized(), clientId, accessToken, clientPublicKey, clientSecret);
    }
}
