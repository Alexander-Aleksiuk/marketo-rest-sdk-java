package com.smartling.marketo.sdk.rest;

import javax.ws.rs.core.MediaType;
import java.lang.reflect.Type;
import java.util.Map;

public interface Command<T> {
    String getPath();

    String getMethod();

    Type getResultType();

    Map<String, Object> getParameters();

    default MediaType getMediaType() {
        return MediaType.APPLICATION_FORM_URLENCODED_TYPE;
    }
}
