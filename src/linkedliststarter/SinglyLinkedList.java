/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;
//    private int lSize;

    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    @Override
    public int size() {
        Node temp = head;
        int size = 0;
        while(temp.getNext() != null){
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
     * Ernest
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(Data item) {
        Node temp = head;
        for(int i = 0; i<size();i++){
            if(temp.getD().equals(item)){
                remove(i);
                return true;
            }
            else{
                temp = temp.getNext();
            }
        }
        return false;
    }

    /**
     * Ernest
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        Node temp = head;
        int size = size();
        if(index<=size && index>=0){
            for(int i = 0; i<index;i++){
                temp = temp.getNext();
            }
            if(temp.equals(head)){
                head = head.getNext();
                temp.setNext(null);
            }
            else if(temp.equals(tail)){
                temp = head;
                for(int i = 0; i<size-2;i++){
                    temp = temp.getNext();
                }
                tail = temp;
                tail.setNext(null);
            }
            else{
                temp.setNext(temp.getNext().getNext());
                temp.getNext().setNext(null);
                return true;
            }
        }
        return false;        
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Data get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Data item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Data item, int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
