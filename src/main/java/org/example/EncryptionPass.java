package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionPass {
    public static String encrypt(String password){

        byte[] bytes= password.getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String decrypt(String password){
        byte[] decoder= Base64.getDecoder().decode(password);
        return new String(decoder, StandardCharsets.UTF_8);

    }
}
