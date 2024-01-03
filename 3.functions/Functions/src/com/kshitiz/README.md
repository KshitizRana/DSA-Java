# Functions/methods
    -Block of code which only runs when it is called.
    - Define the code once , &use it many times.
    - Syntax:
    	public class Main{
    		static void userfxn(){
    			//body
    			
    			// return statement;
    		}
    	}
    	
    - userfxn() // function call
    
###return type
    - return type of data returned should be compatible with the return type of the methods.if return type is string we cannot return boolean.
    - variable recieving the value, returned by the method must also be compaitable with the return type specified for the method.
    
###passbyvalue
     #####Imp Points:
        - primtive data types like int, short, char, byte etc just pass the value 
        - Objects & reference passes value of the reference variable..
        
        
###Scopes

     #####function scope:
     variables declared inside a method/function scope (inside the method) can't be accesssed outside the methods.
     -eg:
     	psvm(){
     	}
     	userfxn(){
     	   int a=20; // it can only be accesed in the userfxn() and cannot be accessed in the psvm() function
     	}
     
     #####block scope:
     variables declared inside a block of code { } cannot be accessed or modified outside the box 
     - eg:
     	psvm(){
     	    int a =20;
     	    int b=50;
     	       {
     	       int c =200;	// in this block of code a and b can be accesed or modified but c cannot be accesed outside this block.
     	       
     	       }	
     	}
     	
     #####loop scope:
     variables declared inside a loop { } cannot be accessed or modified outside the loop
     

###Shadowing
    Using variables in overlappig scopes with the same name where the variable in low-level scope overrides the variable of high-level scope.
    eg:
    	 public class Shadowing {
    	 static int a = 20;
    	 psvm(){
    	     Sout(x); 
    	     x=30;	// high level scope is shadowed by low level scope
    	     sout(x);
    	 
    	   }
    	 }
    	 
###variable arguments
	it is used take multiple number of arguments in the function.
	method that takes variable number of arguments is varargs method
	
	static void fun(int ...a){
		 //method body
		}
		
	Here would be array of type int [] parameters and it could also be of type strings.
	
###Function overloading
	It happens when two functions have same name
	It can be solved by giving the two functions different number of arguments (if arguments of same datatype) or different datatypes of arguments
	Eg:
	
	func(int a){
	//body
	} 
				// Two function with same name but differnt number of arguments (beacuse same datatype of arguments)
	func(int a, int b){
	//code
	}
