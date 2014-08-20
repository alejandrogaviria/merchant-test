package com.mozido.channels.nextweb.model.ui;

/**
 * Functional of application with limited access rights
 *
 * @author Alexander Manusovich
 */
public enum FGroup  {
    BALANCE,
    /**
     * Only for demo reasons
     */
    TEST_SECURED_GROUP,

    /**
     * Special type of functional which is available for all users
     * who logged in application
     */
    AUTHENTICATED_USERS
}
