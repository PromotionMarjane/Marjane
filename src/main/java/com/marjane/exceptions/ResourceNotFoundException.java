package com.marjane.exceptions;

/**
 * This class is used when an attempt to find an entity has thrown an exception.
 */
public class ResourceNotFoundException extends ResourceException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
