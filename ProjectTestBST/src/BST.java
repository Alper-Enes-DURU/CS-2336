
public class BST<E extends Comparable <E>> {
	protected TreeNode<E> root;
	protected int size = 0;
	
	/** Create an empty binary tree */
	public BST() {
	
	}
	
	public boolean search(E e) {
		TreeNode<E> current = root; // Start from the root
		
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			}
			else if (e.compareTo(current.element) > 0) {
				current = current.right;
			}
			else {// element matches current.element
				print(current);
				return true;
			} // Element is found
		}
		System.out.printf("Keyword %s does not exist in the information database!", e);
		return false;
	}
		
	
	public boolean insert(E e, Article a) {
		if (root == null)
		{
			root = createNewNode(e); // Create a new root
			root.addFirst(a);
		}
		else {
		// Locate the parent node
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		while (current != null)
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			}
			else if (e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			}
			else {
				current.addFirst(a);
				return false; // Duplicate node not inserted
			}
		
		// Create the new node and attach it to the parent node
		if (e.compareTo(parent.element) < 0) {
			parent.left = createNewNode(e);
			parent.left.addFirst(a);
		}
		else {
			parent.right = createNewNode(e);
			parent.right.addFirst(a);
		}
		}
		size++;
		return true; // Element inserted successfully
	}
	
	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}
	
	/** Inorder traversal from the root */
	public void inorder() {
		inorder(root);
	}
	
	/** Inorder traversal from a subtree */
	protected void inorder(TreeNode<E> root) {
		if (root == null) return;
		
		inorder(root.left);
		System.out.print(root.element + " ");
		Node<Article> artRec = root.head;
		System.out.println("\t");
		while (artRec != null) {
			System.out.printf("%s", artRec);
			artRec = artRec.next;
		}
		System.out.println();
		inorder(root.right);
	}
	
	protected void print(TreeNode<E> t) {
		if (t == null) return;
		System.out.print(t.element + " ");
		Node<Article> artRec = root.head;
		System.out.print("\t");
		while (artRec != null) {
			System.out.printf("%s", artRec);
			artRec = artRec.next;
		}
		System.out.println();
	}
}
