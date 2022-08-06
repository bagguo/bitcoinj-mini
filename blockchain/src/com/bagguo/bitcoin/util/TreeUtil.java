package com.bagguo.bitcoin.util;


import com.bagguo.bitcoin.transaction.Transaction;

import java.util.List;


public class TreeUtil {
    /**
     * 获取交易的merkle树的根节点，当一个区块中包含大量的transaction时，计算所有的hash值是不可取的
     * 所以使用merkel tree对全部hash值进行一个计算。
     * @param transactions
     * @return
     */
    public static String getMerkleRoot(List<Transaction> transactions){
        MerkleTree merkleTree = new MerkleTree(transactions);
        return merkleTree.buildTree();
    }
}
