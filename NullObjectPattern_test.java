package node_visitor;


public class NullObjectPattern_test extends List {
	
	private static final NullObjectPattern_test instance = new NullObjectPattern_test();
	  private NullObjectPattern_test() { }

	  public static NullObjectPattern_test Singleton()
	  {
	    return instance; 
	  }

	  public List getTail()
	  {
	    return this;
	  }
	  
}
