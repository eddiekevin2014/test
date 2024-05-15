/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        
        sli1.add(new Data("TESTing box", "going ", 1), 0);
        sli1.clear();
        
        sli1.add(new Data("Physics", "Egg", 1));
        sli1.add(new Data("Even More Advanced Functions", "", 2));
        sli1.add(new Data("Lunch", "None", 3));
        sli1.add(new Data("Computer Science", "The Aforementioned Mr. P", 4));
        sli1.add(new Data("Calculus", "", 5));
        sli1.add(new Data("Music", "Mark", 6));
        

        sli1.remove(new Data("Music", "Mark", 6));
        System.out.println("List Size: " + sli1.size());
        
        System.out.println("Get Data: " + sli1.get(0));
        System.out.println("Get Data: " + sli1.get(1));
        System.out.println("Get Data: " + sli1.get(2));
        System.out.println("Get Data: " + sli1.get(3));
        System.out.println("Get: " + sli1.get(4));
        System.out.println("Get: " + sli1.get(5));
//        
        System.out.println("Get Index: " + sli1.indexOf(new Data("orange box on pc", "mr ea g",0)));
        System.out.println("Get Index: " + sli1.indexOf(new Data("orange box on ps4", "donkey kong 64",2)));
        System.out.println("Get Index: " + sli1.indexOf(new Data("Music", "Mark", 6)));
        
//        if (sli1.size() != -1){
//            for(int i =0;i<sli1.size();i++){
//                
////                System.out.println("index thing: go go " + i);
//                System.out.println(sli1.get(i));
//            }
//        }
//        else{
//            System.out.println("list is empty");
//        }
        
    }
    
}
