/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import java.util.Random;

/**
 *
 * @author IONESCU
 */
public class Tester {

    public static int randomInts(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static Tree rndTree(int count) {
        if (count == 0) {
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(randomInts(0, 50));
        }
    }

    public static void checkIsEmpty(Tree t) throws Exception {
        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("Not good man");
            }
        } else if (t instanceof NonEmptyBST) {
            if (t.isEmpty()) {
                throw new Exception("Not good man");
            }
        }
    }

    public static void checkMemberandCardinality(Tree tree, int x) throws Exception {
        int nT = tree.add(x).cardinality();
        if (nT == tree.cardinality() + 1) {
            if (tree.member(x)) {
                throw new Exception("The thing that was added was already a memeber of the tree");
            }
        } else if (nT == tree.cardinality()) {
            if (!tree.member(x)) {
                throw new Exception("The cardinality didn't increaseby one  but we addeed a new thing");
            }
        } else {
            throw new Exception("There's something wrong with the program");
        }
    }

}
