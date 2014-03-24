package net.rush.packets.packet;

import net.rush.packets.Packet;

public interface BlockChangePacket extends Packet {
    int getX();
    byte getY();
    int getZ();
    byte getBlockType();
    byte getBlockMetadata();
}
