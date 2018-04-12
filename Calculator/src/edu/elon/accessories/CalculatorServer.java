package edu.elon.accessories;
import java.rmi.RemoteException;
import javax.naming.Context;
import javax.naming.InitialContext;


//server program that CREATES SERVER OBJECTS
public class CalculatorServer {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Constructing server implementations...");
			
			Calculator calc1 = new CalculatorImpl("Calculator One");
			//Calculator calc2 = new CalculatorImpl("Calculator Two");
			
			System.out.println("Binding server implementations to registry...");
			Context namingContext = new InitialContext();
			namingContext.bind("rmi:one", calc1);
			//namingContext.bind("rmi:two", calc2);
			System.out.println("Waiting for invocations from clients...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
