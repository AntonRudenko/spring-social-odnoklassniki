package org.springframework.social.odnoklassniki.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.odnoklassniki.api.Odnoklassniki;
import org.springframework.social.odnoklassniki.api.OdnoklassnikiProfile;

/**
 * @author Anton Rudenko.
 */
public class OdnoklassnikiAdapter implements ApiAdapter<Odnoklassniki> {

    public boolean test(Odnoklassniki Odnoklassniki) {
        try {
            OdnoklassnikiProfile profile = Odnoklassniki.usersOperations().currentUser();
            if (profile.getUid() == null) {
                return false;
            }
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    public void setConnectionValues(Odnoklassniki odnoklassniki, ConnectionValues values) {
        OdnoklassnikiProfile profile = odnoklassniki.usersOperations().currentUser();
        values.setProviderUserId(profile.getUid());
        values.setDisplayName(profile.getName());
        if (profile.getUid() != null) {
            values.setProfileUrl("http://www.odnoklassniki.ru/profile/" + profile.getUid());
        }
        values.setImageUrl(profile.getPic1());
    }

    public UserProfile fetchUserProfile(Odnoklassniki odnoklassniki) {
        OdnoklassnikiProfile profile = odnoklassniki.usersOperations().currentUser();
        return new UserProfileBuilder().setName(profile.getName()).setUsername(
                profile.getName()).build();
    }

    public void updateStatus(Odnoklassniki odnoklassniki, String message) {
        // do nothing
    }

}
