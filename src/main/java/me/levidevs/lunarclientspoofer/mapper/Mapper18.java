package me.levidevs.lunarclientspoofer.mapper;

import com.google.common.collect.ImmutableMap;

/**
 * @author Levi Taylor
 * @since 08 October, 2020
 */
public class Mapper18 implements Mapper {

    private final ImmutableMap<String, String> mappings = ImmutableMap.<String, String>builder()
            .put("handleJoinGame", "a")
            .put("S01PacketJoinGame", "gt")
            .put("NetHandlerPlayClient", "bcy")
            .put("netManager", "c")
            .put("NetworkManager", "ek")
            .put("C17PacketCustomPayload", "im")
            .put("scheduleOutboundPacket", "a")
            .put("Packet", "ff")
            .build();

    @Override
    public String map(String key) {
        return this.mappings.get(key);
    }

}
