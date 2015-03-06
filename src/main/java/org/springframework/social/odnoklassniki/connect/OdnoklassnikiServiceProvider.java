package org.springframework.social.odnoklassniki.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.odnoklassniki.api.Odnoklassniki;
import org.springframework.social.odnoklassniki.api.impl.OdnoklassnikiTemplate;

/**
 * @author Anton Rudenko.
 */
public class OdnoklassnikiServiceProvider extends AbstractOAuth2ServiceProvider<Odnoklassniki> {

    private final String clientId;
    private final String clientPublicKey;
    private final String clientSecret;

    public OdnoklassnikiServiceProvider(String clientId, String clientPublicKey, String clientSecret) {
        super(new OAuth2Template(clientId, clientSecret,
                "http://www.odnoklassniki.ru/oauth/authorize",
                "http://api.odnoklassniki.ru/oauth/token.do"));
        this.clientId = clientId;
        this.clientPublicKey = clientPublicKey;
        this.clientSecret = clientSecret;
        ((OAuth2Template) this.getOAuthOperations()).setUseParametersForClientAuthentication(true);
    }

    public Odnoklassniki getApi(String accessToken) {
        return new OdnoklassnikiTemplate(clientId, clientPublicKey, clientSecret ,accessToken);
    }
}
