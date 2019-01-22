package com.moticon.network.headerField;

public interface HeaderField {
    String toString();

    String toTransmissionString();

    String toHexString();

    String explainSelf();

    String toAsciiString();
}
