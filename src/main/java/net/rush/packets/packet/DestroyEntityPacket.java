package net.rush.packets.packet;

import net.rush.packets.Packet;

public interface DestroyEntityPacket extends Packet {
    int getEntityId();
}
