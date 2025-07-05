package com.zaden.bigz_blockchain.encryption;

import com.zaden.bigz_blockchain.blocks.Block;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Sha256Hash {

    private String completeHash;

    public String createCompleteHash(String blockData) throws NoSuchAlgorithmException {
        var dataToBytes = blockData.getBytes();

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(dataToBytes);

        String digest = Arrays.asList(messageDigest.digest()).toString();
        return digest;
    }

//    public String getCompleteHash(){}\

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Sha256Hash hash = new Sha256Hash();

        System.out.println(hash.createCompleteHash("zaden"));
    }


}