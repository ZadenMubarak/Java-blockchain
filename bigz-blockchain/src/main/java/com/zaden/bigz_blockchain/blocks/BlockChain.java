package com.zaden.bigz_blockchain.blocks;

import java.util.LinkedList;
/*
* BlockChain class needs to make a chain of 'blocks coming from the Block class
*/
public class BlockChain {

    private LinkedList<Block> lisOfBlocks = new LinkedList<>();

    public BlockChain(){}

    public LinkedList getListOfBlocks(){
        return  this.lisOfBlocks;
    }
}
