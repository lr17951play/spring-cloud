/*
package com.lirui.cloud.authorization.factory;

import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.DefaultSecurityContextAccessor;
import org.springframework.security.oauth2.provider.SecurityContextAccessor;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;

import java.util.Map;

*/
/**
 * override DefaultOAuth2RequestFactory to enable spring check scopes for oAuth2
 */
/*

public class OAuth2RequestFactory extends DefaultOAuth2RequestFactory {

    private SecurityContextAccessor securityContextAccessor = new DefaultSecurityContextAccessor();

    public OAuth2RequestFactory(ClientDetailsService clientDetailsService) {
        super(clientDetailsService);
        super.setCheckUserScopes(true);
    }

    @Override
    public void setSecurityContextAccessor(SecurityContextAccessor securityContextAccessor) {
        this.securityContextAccessor = securityContextAccessor;
        super.setSecurityContextAccessor(securityContextAccessor);
    }

    @Override
    public AuthorizationRequest createAuthorizationRequest(Map<String, String> authorizationParameters) {
        AuthorizationRequest request = super.createAuthorizationRequest(authorizationParameters);
        if (securityContextAccessor.isUser()) {
            request.setAuthorities(securityContextAccessor.getAuthorities());
        }
        return request;
    }
}
*/
