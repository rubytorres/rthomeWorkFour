import java.util.*;

public class CSLinkedList<E> extends AbstractList<E> {

  private static final class Node<E> {
    E data;
    Node<E> next;
    Node(E d, Node<E> n) { data = d; next = n; }
  }

  private final Node<E> head;
  private Node<E> tail;
  private int size;

  public CSLinkedList() {
    head = new Node<>(null, null);
    tail = null;
    size = 0;
  }

  @Override
  public int size() { return size; }

  public boolean isEmpty() { return size == 0; }

  private void checkElementIndex(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
  }

  private void checkPositionIndex(int index) {
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
  }

  private Node<E> nodeAt(int index) {
    checkElementIndex(index);
    Node<E> cur = head.next;
    for (int i = 0; i < index; i++) cur = cur.next;
    return cur;
  }

  @Override
  public boolean add(E e) {
    Node<E> n = new Node<>(e, null);
    if (size == 0) {
      head.next = n;
      tail = n;
    } else {
      tail.next = n;
      tail = n;
    }
    size++;
    modCount++;
    return true;
  }

  @Override
  public void add(int index, E e) {
    checkPositionIndex(index);
    Node<E> prev = (index == 0) ? head : nodeAt(index - 1);
    Node<E> n = new Node<>(e, prev.next);
    prev.next = n;
    if (index == size) tail = n;
    size++;
    modCount++;
  }

  @Override
  public E get(int index) {
    return nodeAt(index).data;
  }

  @Override
  public E set(int index, E e) {
    Node<E> n = nodeAt(index);
    E old = n.data;
    n.data = e;
    return old;
  }

  @Override
  public E remove(int index) {
    checkElementIndex(index);
    Node<E> prev = (index == 0) ? head : nodeAt(index - 1);
    Node<E> target = prev.next;
    prev.next = target.next;
    if (target == tail) {
      tail = (prev == head && prev.next == null) ? null : prev;
    }
    size--;
    modCount++;
    return target.data;
  }

  @Override
  public int indexOf(Object o) {
    int i = 0;
    for (Node<E> cur = head.next; cur != null; cur = cur.next, i++) {
      if (o == null ? cur.data == null : o.equals(cur.data)) return i;
    }
    return -1;
  }

  @Override
  public void clear() {
    head.next = null;
    tail = null;
    size = 0;
    modCount++;
  }

  @Override
  public Iterator<E> iterator() {
    return new Itr();
  }

  private final class Itr implements Iterator<E> {
    private Node<E> prev = head;
    private Node<E> cursor = head.next;
    private Node<E> lastPrev = null;
    private Node<E> lastRet = null;
    private int expectedMod = modCount;

    @Override
    public boolean hasNext() { return cursor != null; }

    @Override
    public E next() {
      checkForComod();
      if (cursor == null) throw new NoSuchElementException();
      lastPrev = prev;
      lastRet = cursor;
      prev = cursor;
      cursor = cursor.next;
      return lastRet.data;
    }

    @Override
    public void remove() {
      checkForComod();
      if (lastRet == null) throw new IllegalStateException();
      lastPrev.next = lastRet.next;
      if (lastRet == tail) {
        tail = (lastPrev == head && lastPrev.next == null) ? null : lastPrev;
      }
      size--;
      modCount++;
      expectedMod++;
      lastRet = null;
    }

    private void checkForComod() {
      if (expectedMod != modCount) throw new ConcurrentModificationException();
    }
  }

  //------------All Helper Methods Implemented--------------

  public boolean addIfAbsent(E item) {
    for(int i = 0; i < size(); i++){
        if(nodeAt(i).data == item){    //If we find the item index in list, return false
            return false;
        }

    }
    add(item); //If we do not find the item, we add item to the list and return true
    return true;
  }

  public void moveToFront(E item){
      int i = indexOf(item);

      if(i == -1){ //If item in not in the list, the list does not change
          return;
      }
      if(i == 0){ //If item is at the front already, the list does not change
          return;
      }
      remove(i); //Remove item from the list and then add it to the front
      add(0, item);

  }

  public boolean addAfter(E target, E newItem) {
      int i = indexOf(target);
      if(i == -1){ //If target is not in list, do not change the list
          return false;
      }
      add(i + 1,  newItem); //If target is in list, add newItem after target's index
      return true;

  }

  public void addInOrder(E item, Comparator<E> cmp) {

      Node<E> prev = head;
      Node<E> curr = head.next;
      tail = head;

      //looping through the list as long as item is greater than the current node value
      while(curr != null){
          if(curr.data == null || cmp.compare(item, curr.data) <= 0 ){
              break;
          }
          prev = curr;  //updating the pointer values
          curr = curr.next;

      }

      Node<E> newNode = new Node<>(item, curr);
      prev.next = newNode; //Adds newNode after the other node

      if(curr == null){
          tail = newNode;

      }
      size++;
      modCount++;

  }

  public boolean removeFirstOccurrence(E item) {
      //IndexOf() method will give us the index of item's first occurrence
      int i = indexOf(item);
      if(i == -1){
          return false;
      }
      remove(i);
      return true;

  }

  public CSLinkedList<E> copy(){
    CSLinkedList<E> copy = new CSLinkedList<>();
    Node<E> curr = head.next;
    while(curr != null){   //while curr is not null, elements from the original list will get added to the copy list
        copy.add(curr.data);
        curr = curr.next;
    }
    return copy; //the copy list is returned

  }
}
