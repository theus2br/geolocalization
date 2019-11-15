package com.matdoli.geolocalization.exception;

public class GeolocalizationResourceException extends Exception {

    private static final long serialVersionUID = -6681777147239341684L;

    public GeolocalizationResourceException() {
        super();
    }

    public GeolocalizationResourceException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public GeolocalizationResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public GeolocalizationResourceException(String message) {
        super(message);
    }

    public GeolocalizationResourceException(Throwable cause) {
        super(cause);
    }

}
