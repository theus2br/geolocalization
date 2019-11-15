package com.matdoli.geolocalization.exception;

public class GeolocalizationNotFoundException extends Exception {

    private static final long serialVersionUID = -7630009569979446777L;

    public GeolocalizationNotFoundException() {
        super();
    }

    public GeolocalizationNotFoundException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public GeolocalizationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GeolocalizationNotFoundException(String message) {
        super(message);
    }

    public GeolocalizationNotFoundException(Throwable cause) {
        super(cause);
    }

}
