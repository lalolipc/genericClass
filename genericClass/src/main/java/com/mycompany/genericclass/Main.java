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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*1) Generar una clase con generics que contenga un array como atributo 
          y en base a este array implemente metodos
           para obtener la siguiente informacion : */
        System.out.println("1) Array");
        MyArray<Integer> myList=new MyArray<Integer>();
        myList.add(20);
        myList.add(31);
        myList.add(10);
        System.out.println(myList.toString());
        //a) Verificar si un objeto existe en el array 
        System.out.println("a)elelemento 23 existe ? rta: "+ myList.exist(23));
        //b) Devolver el máximo  
        System.out.println("b) Devolver el máximo: " + myList.greater());
        //c) Devolver el mínimo 
        System.out.println("c) Devolver el mínimo: " + myList.less());
        /*2) Agregar un metodo para eliminar el ultimo objeto 
        del array y lo devuelva por parametro (Investigar la clase Arrays). */
        System.out.println("2)eliminar el ultimo objeto  : " + myList.deleteLast());
        System.out.println("volver a mostrar listado:"+ myList.toString());
        /*3) Implementar con generics la clase Pila
        que simule una Pila de datos con los siguientes metodos:*/
        System.out.println("3) STACK ");
        Stack<Integer> myStack=new Stack<Integer>();
        System.out.println("a) push : ");
        myStack.push(1);
        myStack.push(16);
        myStack.push(33);
        myStack.push(18);
        myStack.push(29);
        System.out.println("");       
        System.out.println("b) pop: "+ myStack.pop());
        System.out.println("c) size: "+myStack.size());
     
        
        
       
        
        
        
    }
    
}
