package org.springframework.social.odnoklassniki.api;

import org.springframework.social.ApiBinding;

/**
 * @author Anton Rudenko.
 */
public interface Odnoklassniki extends ApiBinding {

    UsersOperations usersOperations();

}
