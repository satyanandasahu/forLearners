package com.example.exception;

public class UseOfException {
	
	
	
	public int returnStatus(String id, int updateStatus) throws UserDefinedExcpetion {
		
		try {
			System.out.println("Call server");
			System.out.println("update Status");
			int x=0, y=100, z=0;
		//	System.out.println("Exception  happened");
			//z=y/x;
			
			System.out.println("Switch start");
			switch(updateStatus) {
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			case 5:
				System.out.println("case 5");
				break;
			default: 
				System.out.println("default");
				break;
			case 6:
				System.out.println("case 6");
				break;
				
			}
			System.out.println("End of switch");
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("inside exception" + e.getMessage());
			throw new UserDefinedExcpetion( "x value is Zero "+ e.getMessage() + " exception" );
		}
		
		return 0;
	}

}
