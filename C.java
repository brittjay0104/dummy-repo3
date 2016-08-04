public class C extends RuntimeException {
	
	public void exceptionTest() throws Exception {
		throw new Exception e;
	}

	public void catchThis() {
		try {
			exceptionTest();
		}
		catch (RuntimeException e) {
			
		}
	}

	static String readFirstLineFromFile(String path) throws IOException {
    	try (BufferedReader br =
                   new BufferedReader(new FileReader(path))) {
        	return br.readLine();
    	}
    	
        try{
        	//Child try block1
             try{
                System.out.println("Inside block1");
                int b =45/0;
                System.out.println(b);
             }
             catch(ArithmeticException e1){
                System.out.println("Exception: e1");
             }
             //Child try block2
             try{
                System.out.println("Inside block2");
                int b =45/0;
                System.out.println(b);
             }
             catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Exception: e2");
             }
            System.out.println("Just other statement");
        }
        catch(ArithmeticException e3){
        	 System.out.println("Arithmetic Exception");
             System.out.println("Inside parent try catch block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
        	System.out.println("ArrayIndexOutOfBoundsException");
             System.out.println("Inside parent try catch block");
        }
        catch(Exception e5){
        	System.out.println("Exception");
             System.out.println("Inside parent try catch block");
         }
         System.out.println("Next statement..");
	}

	public void writeList() {
	    PrintWriter out = null;

	    try {
	        System.out.println("Entering" + " try statement");

	        out = new PrintWriter(new FileWriter("OutFile.txt"));
	        for (int i = 0; i < SIZE; i++) {
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.err.println("Caught IndexOutOfBoundsException: "
	                           +  e.getMessage());
	                                 
	    } catch (IOException e) {
	        System.err.println("Caught IOException: " +  e.getMessage());
	                                 
	    } finally {
	        if (out != null) {
	            System.out.println("Closing PrintWriter");
	            out.close();
	        } 
	        else {
	            System.out.println("PrintWriter not open");
	        }
	    }
	}
}