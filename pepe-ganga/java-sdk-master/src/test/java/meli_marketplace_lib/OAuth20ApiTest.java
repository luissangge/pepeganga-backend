/*
 * MELI Markeplace SDK
 * This is a the codebase to generate a SDK for Open Platform Marketplace
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package meli_marketplace_lib;

import meli.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuth20Api
 */
@Ignore
public class OAuth20ApiTest {

    private final OAuth20Api api = new OAuth20Api();

    
    /**
     * Authentication Endpoint
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authTest() throws ApiException {
        String responseType = null;
        String clientId = null;
        String redirectUri = null;
        api.auth(responseType, clientId, redirectUri);

        // TODO: test validations
    }
    
    /**
     * Request Access Token
     *
     * Partner makes a request to the token endpoint by adding the following parameters described below
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenTest() throws ApiException {
        String grantType = null;
        String clientId = null;
        String clientSecret = null;
        String redirectUri = null;
        String code = null;
        String refreshToken = null;
        Object response = api.getToken(grantType, clientId, clientSecret, redirectUri, code, refreshToken);

        // TODO: test validations
    }
    
}