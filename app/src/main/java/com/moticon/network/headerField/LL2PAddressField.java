package com.moticon.network.headerField;

public class LL2PAddressField implements HeaderField {
    private boolean isSourceAddress;
    private String fieldContents;

    public LL2PAddressField(String headerContents, boolean isSource){
        isSourceAddress = isSource;
        fieldContents = new String(headerContents);
    }

    @Override
    public String toTransmissionString() {
        return null;
    }

    @Override
    public String toHexString() {
        return null;
    }

    @Override
    public String explainSelf() {
        if (isSourceAddress)
            return fieldContents+", Source Address";
        else
            return fieldContents + ", Destination Address";
    }

    @Override
    public String toAsciiString() {
        return null;
    }
}
