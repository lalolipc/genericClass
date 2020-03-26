/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp1_genericclass;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lec222
 */
public class MyArray <T extends Comparable>{
     List<T> list = null;
    public MyArray() {
    list=new ArrayList<T>();   
    }
    public void add(T objeto){
    list.add(objeto);
    }

    @Override
    public String toString() {
        return "MyArray{" + "list=" + list + '}';
    }

    public boolean exist(T myElement){
        return list.contains(myElement);
    }

    public T greater(){
        T myElement=list.get(0);
        T GreaterElement = null;
        int r;
      for(int x = 0;x<list.size();x++)
      {
            r= list.get(x).compareTo(myElement);
                 if(r>0){
                     GreaterElement=list.get(x);
                }else
                     GreaterElement=myElement;
            }
       
    return GreaterElement;
    }
    
     public T less(){
        T myElement=list.get(0);
        T GreaterElement = null;
        int r;
      for(int x = 0;x<list.size();x++)
      {
            r= list.get(x).compareTo(myElement);
                 if(r<0){
                     GreaterElement=list.get(x);
                }else
                     GreaterElement=myElement;
            }
       
    return GreaterElement;
    }
  
   public T deleteLast(){
       return  list.remove(list.size()-1);
   }
}
