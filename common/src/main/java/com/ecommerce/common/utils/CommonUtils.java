package com.ecommerce.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {
    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logError(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    // Add more utility methods as needed
}