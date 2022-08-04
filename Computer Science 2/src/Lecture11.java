
public class Lecture11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



 private int[] elements;
 private int size;
 public static final int DEFAULT_CAPACITY = 16;

     /** Construct a stack with the default capacity 16 */
 public Lecture11() {

	 this(DEFAULT_CAPACITY);
 }
 
/** Construct a stack with the specified maximum capacity */
  public StackOfIntegers(int capacity) 
  { 
	  elements = new int[capacity];
	}
}