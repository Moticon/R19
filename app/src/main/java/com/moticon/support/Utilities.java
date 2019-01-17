package com.moticon.support;

public class Utilities {

    /**
     * Pad Hex String - User provides number of bytes, not length o fstring
     * @param inputString - string to be prepended.
     * @param byteCount - total bytes to display (3 bytes produces 6 chars)
     * @return returnString - this is the string builder to create string with correct # of leading zeros
     */
    static public String padHexString(String inputString, int byteCount){
        int numberOfCharacters = byteCount * 2;
        StringBuilder returnString = new StringBuilder(inputString.toUpperCase());
        for (int i=inputString.length(); i < numberOfCharacters; i++){
            returnString.insert(0,"0");
        }
        return returnString.toString();
    }
}