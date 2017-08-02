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
class NonEmptyBST<T extends Comparable> implements Tree<T> {

    T data;
    Tree<T> right;
    Tree<T> left;

    public NonEmptyBST(T element) {
        this.data = element;
        left = new EmptyBST();
        right = new EmptyBST();

    }

    private NonEmptyBST(T data, Tree<T> right, Tree<T> left) {
        this.data = data;
        this.right = right;
        this.left = left;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return (1 + left.cardinality() + right.cardinality());
    }

    @Override
    public boolean member(T element) {
        if (element.compareTo(data) == 0) {
            return true;
        } else if (element.compareTo(data) < 0) {
            return left.member(element);
        } else {
            return right.member(element);
        }

    }

    @Override
    public NonEmptyBST<T> add(T element) {
        if (data == element) {
            return this;
        } else if (data.compareTo(element) < 0) {
            return new NonEmptyBST(data, left.add(element), right);
        } else {
            return new NonEmptyBST(data, right.add(element), left);
        }

    }

}
