/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.server;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MiloServerEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":itemId";

    @Override
    public boolean isEnabled(String scheme) {
        return "milo-server".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "itemId", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

