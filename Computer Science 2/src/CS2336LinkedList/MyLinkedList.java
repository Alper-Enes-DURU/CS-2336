package CS2336LinkedList;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {

	private Node<E> head, tail;
	
	public MyLinkedList()
	{
		
	}
	
	public MyLinkedList(E[] objects)
	{
		super(objects);
	}
	
	@Override
	public void add(int index, E e) {
		// TODO Auto-generated method stub
		
	}
	
	public void addFirst(E e)
	{
		Node<E> newNode = new Node<>(e); // Create a new node
		newNode.next = head; // link the new node with the head
		head = newNode;	// head points to the new node
		size++;	// Increase list size
		
		if (tail == null)
			tail = head;	// The new node is the only node in list
		
	}
	
	public void addLast(E e)
	{
		Node<E> newNode = new Node<>(e); // Create a new node for e
		
		if (tail == null)
		{9
			head = tail = newNode; // The only node in list
		}
		else
		{
			tail.next = newNode; // Link the new node with the last node
			tail = newNode; // tail now points to the last node
		}
		
		size++; // Increase size
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size = 0;
		head = tail = null;
		
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E e) {
		// TODO Auto-generated method stub
		System.out.println("Implementation is left as an exercise.");
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	
	
	private class LinkedListIterator implements Iterator<E>
	{
		private Node<E> current = head; // Current index
		
		@Override
		public boolean hasNext()
		{
			return (current != null);
		}
		
		@Override
		public E next()
		{
			E e = current.element;
			current = current.next;
			return e;
		}
		
		@Override
		public void remove()
		{
			System.out.println("");
		}
	}
}



