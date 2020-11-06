package me.levidevs.lunarclientspoofer.mapper;

import com.google.common.collect.ImmutableMap;

/**
 * @author Levi Taylor
 * @since 08 October, 2020
 */
public class Mapper17 implements Mapper {

    private final ImmutableMap<String, String> mappings = ImmutableMap.<String, String>builder()
            .put("handleJoinGame", "a")
            .put("S01PacketJoinGame", "hd")
            .put("NetHandlerPlayClient", "bjb")
            .put("netManager", "e")
            .put("NetworkManager", "ej")
            .put("C17PacketCustomPayload", "iz")
            .put("scheduleOutboundPacket", "a")
            .put("Packet", "ft")
            .build();

    @Override
    public String map(String key) {
        return this.mappings.get(key);
    }

}
