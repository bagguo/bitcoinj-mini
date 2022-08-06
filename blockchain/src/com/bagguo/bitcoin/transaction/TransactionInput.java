package com.bagguo.bitcoin.transaction;

public class TransactionInput {
    public String transactionOutputId;
    //每一个输入都对应着一笔交易的输出，沿用比特币白皮书中的描述，将其命名为UTXO
    public TransactionOutput UTXO;

    public TransactionInput(String transactionOutputId){
        this.transactionOutputId = transactionOutputId;
    }
}
