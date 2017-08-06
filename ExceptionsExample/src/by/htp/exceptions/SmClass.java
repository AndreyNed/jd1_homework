package by.htp.exceptions;

public class SmClass {
	
	public static String s = new String("");
	
	{
		s = "111";
		Exception ex = new Exception();
		try {
			throw ex;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Exception in initializing block");
		}
	}
	
	public static void Method() throws Exception {
		
	}

	public SmClass() {
		super();
		
	}

	
	
}
