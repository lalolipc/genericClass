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
public class Stack<R>{
 
    private Nodo lastNode;

    public void push(R x) {
        Nodo aux;
        aux = new Nodo();
        aux.setData(x);
        if (lastNode == null) {
            aux.setNext(null);
            lastNode = aux;
        } else {
            aux.setNext(lastNode);
            lastNode = aux;
        }
        System.out.println("se agrego : "+ aux.toString());
    }

    public Nodo pop() {
        if (lastNode != null) {
            Nodo aux=new Nodo();
            aux.setData(lastNode.getData());
            lastNode.setNext(lastNode.getNext());
            return aux;
        } else {
            return null;
        }
    }

    public int size() {
     
        int items = 0;
        Nodo aux = lastNode;
        while (aux != null) {
            aux=aux.getNext();
            items++;
        }
        return items;
    }
    @Override
    public String toString() {
        return "Stack{" + "raiz=" + lastNode.getData() + '}';
    }
    
    
    
}
