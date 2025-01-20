package org.pronsky.securitysandbox.exception;

public class UserNotFoundException extends RuntimeException {

    public static final String USER_NOT_FOUND_MESSAGE = "User with login %s not found";

    public UserNotFoundException(String message) {
        super(String.format(USER_NOT_FOUND_MESSAGE, message));
    }
}
