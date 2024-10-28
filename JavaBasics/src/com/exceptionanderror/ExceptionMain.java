package com.exceptionanderror;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionMain {
	
	private final String name = "Satya";

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\temp\\error.html"));
		} 
		
		
		catch (IOException | ArithmeticException e ) {
			// TODO: handle exception
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
		}  
		
		
		

		/*
		 * int x = 1; int y = 1; int z = 0;
		 * 
		 * // runtime exception //try { if (y!= 0) { z = x/y;
		 * System.out.println("the result " + z); } else {
		 * System.out.println("divide by zero error"); } } catch (Exception e) { //
		 * TODO: handle exception //System.out.println("inside exception " );
		 * e.printStackTrace(); }
		 * 
		 * System.out.println("world");
		 * 
		 * 
		 */
		ExceptionMain exceptionMain = new ExceptionMain();
	//	try {
			exceptionMain.compileTimeException();
	//	} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void compileTimeException() throws UserDefinedException {
		// compile time exception
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(new File("C:\\temp\\error.html")); //
			byte[] b = new byte[1024];
			System.out.println("print " + fis.read(b));
			System.out.println(fis.toString());
			

			fos = new FileOutputStream(new File("C:\\temp\\error1.html"));
			fos.write(b);
			fos.flush();
			fos.close();
			(new DataOutputStream(System.out)).write(b);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserDefinedException("Exception thrown from compile time method",e);
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
