/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList {

    private Node head;
    private Node tail;
//    private int lSize;
    
    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    /**
     * Return the size of the Linked List
     *
     * @return an int representing the size
     */
    @Override
    public int size() {
        Node temp = head;
        int size = 1;
        if(head == null){
            return -1;
        }
        while (temp.getNext() != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        head.setNext(null);
        tail = null;
        head = null;
    }

    /**
     * Ernest Remove the first instance of item from the linked list
     *
     * @param item The item to be removed
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(Data item) {
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.getD().equals(item)) {
                remove(i);
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }

    /**
     * Ernest Remove the item from the particular index
     *
     * @param index The index of the item to remove
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(int index) {
        Node temp = head;
        int size = size();
        if (index <= size && index >= 0) {
            for (int i = 0; i < index-1; i++) {
                temp = temp.getNext();
            }
            if (temp.equals(head)) {
                head = head.getNext();
                temp.setNext(null);
            } 
            else if (temp.equals(tail)) {
                temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.getNext();
                }
                tail = temp;
                tail.setNext(null);
            } else {
                temp.setNext(temp.getNext().getNext());
//                temp.getNext().setNext(null);
                return true;
            }
        }
        return false;
    }

    /**
     * Edward Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        Node added = new Node(item);
        Node indexed = head;
        //int count = 0;

        for (int count = 0; count < size(); count++) {
            if (indexed.getD().equals(added.getD())) {
                return count;
            }
            indexed = indexed.getNext();
        }
        return -1;
    }

    /**
     * Edward Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Data get(int index) {
        Node getting = head;
        Node indexed = head;
        int size = size();

        if (index < size) {
            for (int i = 0; i < index; i++) {
                indexed = indexed.getNext();
            }
            getting.setD(indexed.getD());
        }
        return getting.getD();
    }

    /**
     * Edward Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item) {
//        System.out.println(item);
        Node added = new Node(item);

        if (head == null && tail == null) {
            head = added;
            tail = added;
        } 
        
        else {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(added);
        }
        return true;
    }

    /**
     * Edward Add the gen item to the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item, int index) {
        Node added = new Node(item);
        Node indexed = head;
        Node indexed2 = head;
        int size = size();

        if (head == null && tail == null) {
            head = added;
            tail = added;
        }

        else if (index == 0) {
            added.setNext(head);
            head = added;
            return true;
        } 
        
        else if (index < size && index > 0) {
            for (int i = 0; i < index; i++) {
                indexed = indexed.getNext();
            }

            for (int j = 0; j < index - 1; j++) {
                indexed2 = indexed2.getNext();
            }

            added.setNext(indexed);
            indexed2.setNext(added);
            return true;
        } 
        
        else if (index == size) {
            add(item);
            return true;
        } 
        
        else {
            System.out.println("Index: " + index + " is out of range.");
        }
        return false;
    }
}
