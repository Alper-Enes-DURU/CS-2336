
public class MyLinkedList<E> {
	private Node<E> head, tail;
	
	public void addFirst(E e) {
		Node<E> newNode = newNode<>(e);
		newNode.next = head;
		head = newNode;
		size++;
	}
}
