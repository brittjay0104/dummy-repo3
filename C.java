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