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
}