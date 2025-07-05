package com.zaden.bigz_blockchain.blocks;

import java.util.LinkedList;

public class Block {

    private String timeStamp;
    private String previousHash;
    private String newHash;

    public Block(){

    }
    public Block(String data, String timeStamp){}

    LinkedList<Object> listOfBlocks = new LinkedList<>();

    protected void addToBlockToChain(Object block){
        listOfBlocks.add(block);
    }

    public LinkedList<Object> getListOfBlocks() {
        
        return listOfBlocks;
    }

    public void setListOfBlocks(LinkedList<Object> listOfBlocks) {
        this.listOfBlocks = listOfBlocks;
    }
}
