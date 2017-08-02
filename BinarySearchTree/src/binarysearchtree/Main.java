/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author IONESCU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        EmptyBST t = new EmptyBST();
        NonEmptyBST e = new NonEmptyBST(5);
        try {
            Tester.checkIsEmpty(t);

            Tester.checkIsEmpty(e);
            Tester.checkMemberandCardinality(e, 5);
            Tester.checkMemberandCardinality(e, 6);
            Tester.checkMemberandCardinality(e, 5);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        int no = 1000;
        for (int i = 0; i < no; i++) {
            Tree tree ;
            if (i % 10 == 0) {
                tree = Tester.rndTree(0);
            } else {
                tree = Tester.rndTree(10);
            }
            Tester.checkMemberandCardinality(tree, i);
        }
    }

}
