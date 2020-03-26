package com.chaochaowu.characterrecognition.bean;

/**
 * @author xyh
 * @Description : AccessTokenBean
 * @class : AccessTokenBean
 * @time Create at 6/4/2019 4:27 PM
 */


public class AccessTokenBean {

    /**
       refresh_token : 25.3ffbbc4bb5b3768eaaed62768216700f.315360000.1868964173.282335-15847527"
       expires_in : 2592000
       session_key : 9mzdAqFW7Dirqkf6sf6cUPap16CaRevoH0onZUbgcbeQY+gqy9na5F7y9K6k6JWYqEWtWMHFxR4MVsZXtIVHlOPSy4vXtg==
       access_token : 24.9c4442d6e282c30aa0b14edef528f38b.2592000.1556196173.282335-15847527
       session_secret : 4a48bf00f919a4252597f5f486a7d1a9
     */
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String session_key;
    private String access_token;
    private String session_secret;

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getSession_secret() {
        return session_secret;
    }

    public void setSession_secret(String session_secret) {
        this.session_secret = session_secret;
    }
}
