package com.zaden.bigz_blockchain.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Sha256Hash {

    private String completeHash;

    static  void print(byte[] msg){
        var encoded = Base64
                .getEncoder()
                .encodeToString(msg);
        System.out.println(encoded);
    }

    public void createCompleteHash(String blockData) throws NoSuchAlgorithmException {
        var dataToBytes = blockData.getBytes();

        var messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(dataToBytes);

        print(messageDigest.digest(dataToBytes));
    }


    public static void main(String[] args) throws NoSuchAlgorithmException {
        Sha256Hash hash = new Sha256Hash();
        //47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=
        hash.createCompleteHash("zaden");
    }

}