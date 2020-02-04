/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleSheetsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "accessToken": ((GoogleSheetsEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationName": ((GoogleSheetsEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientId": ((GoogleSheetsEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientSecret": ((GoogleSheetsEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "inBody": ((GoogleSheetsEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshToken": ((GoogleSheetsEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleSheetsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((GoogleSheetsEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((GoogleSheetsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GoogleSheetsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((GoogleSheetsEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((GoogleSheetsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((GoogleSheetsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleSheetsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((GoogleSheetsEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((GoogleSheetsEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((GoogleSheetsEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleSheetsEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleSheetsEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((GoogleSheetsEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((GoogleSheetsEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((GoogleSheetsEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((GoogleSheetsEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleSheetsEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((GoogleSheetsEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((GoogleSheetsEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((GoogleSheetsEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((GoogleSheetsEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((GoogleSheetsEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname": ((GoogleSheetsEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid": ((GoogleSheetsEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret": ((GoogleSheetsEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "inbody": ((GoogleSheetsEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken": ((GoogleSheetsEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleSheetsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((GoogleSheetsEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((GoogleSheetsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GoogleSheetsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((GoogleSheetsEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((GoogleSheetsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((GoogleSheetsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleSheetsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((GoogleSheetsEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((GoogleSheetsEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((GoogleSheetsEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleSheetsEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleSheetsEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((GoogleSheetsEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((GoogleSheetsEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((GoogleSheetsEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((GoogleSheetsEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleSheetsEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((GoogleSheetsEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((GoogleSheetsEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((GoogleSheetsEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((GoogleSheetsEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
