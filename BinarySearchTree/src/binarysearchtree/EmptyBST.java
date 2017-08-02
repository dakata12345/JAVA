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
public class EmptyBST<T extends Comparable> implements Tree<T> {

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(T element) {
        return false;
    }

    @Override
    public NonEmptyBST<T> add(T element) {
        return new NonEmptyBST<>(element);

    }

}
