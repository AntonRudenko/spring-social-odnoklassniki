package org.springframework.social.odnoklassniki.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.odnoklassniki.api.Odnoklassniki;

/**
 * @author Anton Rudenko.
 */
public class OdoklassnikiConnectionFactory extends OAuth2ConnectionFactory<Odnoklassniki> {
    public OdoklassnikiConnectionFactory(String clientId, String clientPublicKey, String clientSecret) {
        super("odnoklassniki", new OdnoklassnikiServiceProvider(clientId, clientPublicKey, clientSecret), new OdnoklassnikiAdapter());
    }
}
