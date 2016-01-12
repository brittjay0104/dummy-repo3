public class Box<T> {

  private T t;
  private Object o; 

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
  
  public <T> void method(T item){
	  List<T> list = new ArrayList<T>();
  }
  
 

  public static void main(String[] args) {
     
     System.out.printf( "Max of %d, %d and %d is %d\n\n", 
             3, 4, 5, maximum( 3, 4, 5 ) );

	System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
	             6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );
	
	System.out.printf( "Max of %s, %s and %s is %s\n","pear",
			"apple", "orange", maximum( "pear", "apple", "orange" ) );
	
	 this.<Number>method(new Integer(100));
	 
	 List<String> anEmptyStringList = Collections.<String>emptyList();

  }
}g