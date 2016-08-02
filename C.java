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
}