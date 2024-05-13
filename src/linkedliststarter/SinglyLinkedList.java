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

    /**
     * Return the size of the Linked List
     *
     * @return an int representing the size
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the first instance of item from the linked list
     *
     * @param item The item to be removed
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(Data item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the item from the particular index
     *
     * @param index The index of the item to remove
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // edwar stuff
    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        Node added = new Node(item);
        Node indexed = head;
        int count = 0;

        while (indexed != added) {
            indexed = indexed.getNext();
            count++;

            if (indexed == added) {
                return count;
            }
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Data get(int index) {
        Node getting = head;
        Node indexed = head;

        for (int i = 0; i < index; i++) {
            indexed = indexed.getNext();
        }
        
        getting.setD(indexed.getD());
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item) {
        Node added = new Node(item);

        if (head == null && tail == null) {
            head = added;
            tail = added;
        }

        Node end = head;
        while (end.getNext() != null) {
            end = end.getNext();
        }
        end.setNext(added);
        
        return true;
    }

    /**
     * Add the gen item to the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item, int index) {
        Node added = new Node(item);
        Node indexed = head;

        // use size and compare to index later or something
        
        for (int i = 0; i < index; i++) {
            indexed = indexed.getNext();
        }

        added.setNext(indexed.getNext());
        indexed.setNext(added);
        
        return true;
    }
}
