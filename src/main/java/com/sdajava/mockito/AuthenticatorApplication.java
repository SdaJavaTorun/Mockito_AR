package com.sdajava.mockito;

/**
 * Created by RENT on 2017-04-10.
 */
public class AuthenticatorApplication {
    private AuthenticatorInterface authenticator;
    public AuthenticatorApplication(AuthenticatorInterface authenticator) {
        this.authenticator = authenticator;
    }

    public boolean authenticate(String username, String password) {
        boolean authenticated;
        authenticated = this.authenticator.authenticateUser(username, password);
        return authenticated;
    }
}
