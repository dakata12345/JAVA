/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author IONESCU
 * @param <T>
 */
public interface Tree<T extends Comparable> {

    public boolean isEmpty();

    public int cardinality();

    public boolean member(T element);

    public NonEmptyBST<T> add(T element);
}
