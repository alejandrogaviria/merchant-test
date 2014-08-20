package com.mozido.channels.nextweb.model;


/**
 * @Author Alex Manusovich
 */
public class SessionDTO extends BaseDTO {
    private String token;

    public SessionDTO() {
    }

    public SessionDTO(final String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }
}
