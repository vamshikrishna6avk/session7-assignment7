package package2;
//here I'm taking package name as package2 
//and class name as TwoClass


import package1.OneClass;//to get the value for other package we are importing the values using this code 

public class TwoClass extends OneClass{    // here we are extending the TwoClass with OncClass this is done by using INHERITANCE

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	/*
	 * here we are trying to access protected integer  value directly 
	 * but it is not possible while because the value is protected
	 * for accessing the value of i there is only way by inheritance
	 * access of protected is only done with the help of inheritance in the class of another package
	 *  	  
	 */
		TwoClass a = new TwoClass();
		System.out.println("value of i is  " +a.i); //here we are printing the protected value 
		

	}

}
