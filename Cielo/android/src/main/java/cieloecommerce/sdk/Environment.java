package cieloecommerce.sdk;

/**
 * Environment configuration interface
 */
public interface Environment {
    /**
     * Gets the environment's Api URL
     *
     * @return the Api URL
     */
    String getApiUrl();

    /**
     * Gets the environment's Api Query URL
     *
     * @return the Api Query URL
     */
    String getApiQueryURL();
}
