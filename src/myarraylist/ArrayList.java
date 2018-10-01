/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylist;
//STEP 1: build an array list class
import java.util.Arrays;
public class ArrayList<Z> {

    private Object[] list;
    private int currentSize;
//default constructor for 10 elements

    public ArrayList() {
        this.list = new Object[10];
        this.currentSize = 0;
    }
//constructor for n elements

    public ArrayList(int n) {
        this.list = new Object[n];
        this.currentSize = 0;
    }
//return true if the list is empty

    public boolean isEmpty() {
        return currentSize == 0;
    }
//return size of list
    public int size() {
        return currentSize;
    }
//increase list length when current size>len
    private void increaseLen() {
        Object[] tmp = new Object[(currentSize * 2)+1];
        System.arraycopy(list, 0, tmp, 0, currentSize);
        list = tmp;
    }
//add new item to the end of the list
    public void add(Z item) {
        if (currentSize == list.length) {
            increaseLen();
        }
        list[currentSize] = item;
        currentSize++;
    }
//get item by index
    public Z get(int index) throws RuntimeException{
        if (index<0 || index>=currentSize) {
            throw new RuntimeException("Error: Get index is out of range.");
        }
            return (Z) list[index];
        
    }
//set item by index
    public void set(int index, Z item) {
         if (index<0 || index>=currentSize) {
             throw new RuntimeException("Error: Set index is out of range.");
         }
          list[index] = item;
    }
//remove item by index
    public void remove(int index) {
        if (index<0 || index>=currentSize) {
             throw new RuntimeException("Error: Set index is out of range.");
         }
               for (int i=index;i<currentSize;i++)
               {
                   list[i]=list[i+1];
               }
               currentSize--;

    }
//override to string method
    @Override
    public String toString() {
        String s="";
        if (isEmpty()) {
            s="The list is empty!";
            return s;
        }
        for (int i=0;i<currentSize;i++){
            s+="Number "+(i+1)+" - ";
            s+=list[i].toString();
        }
        return s;
    }
    
    
}
