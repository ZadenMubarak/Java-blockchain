package com.zaden.bigz_blockchain.blocks;

public class CreateGenesisBlock {

    private Block s;

    private String gebesisBlockTestDAta = "This is the very first block"+
                                            "Because in the beginning etc ...";

    public static Block generateGenesisBlock(){
        return new Block();
    }
}
