package me.levidevs.lunarclientspoofer.mapper;

/**
 * @author Levi Taylor
 * @since 08 October, 2020
 * Represents a mapper used to map class names, method names etc.
 */
public interface Mapper {

    /**
     * Gets the specified mapping for the specified key.
     * @param key The key
     * @return The specified mapping, or {@code null} if no value for the specified key is present
     */
    String map(String key);

}
