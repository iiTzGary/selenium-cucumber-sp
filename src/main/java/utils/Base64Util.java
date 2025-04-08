package utils;

import java.util.Base64;

public class Base64Util {

    /**
     * Decodes the given base64 encoded text
     * @param text to be decoded
     * @return decodedText
     */
    public static String decodeText(final String text){
        byte[] decodedBytes = Base64.getDecoder().decode(text);
        return  new String(decodedBytes);
    }

}
