/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 * STUDENT TIMETABLE SCENARIO
 * @author michael.roy-diclemen
 */
public class Node {
    private Data d = null;
    private Node next = null;
    
    public Node(Data insert){
        d = insert;
    }
    
    /**
     * @return the d
     */
    public Data getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Data d) {
        this.d = d;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }


}
