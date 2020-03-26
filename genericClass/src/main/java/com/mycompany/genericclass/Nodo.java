/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp1_genericclass;

/**
 *
 * @author Lec222
 */
public class Nodo<T> {
    private T data;
    private Nodo<T> next;

    public Nodo() {
    }

    public Nodo(T data, Nodo<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "data=" + data + ", next=" + next + '}';
    }

    
   

   
    
    
}
