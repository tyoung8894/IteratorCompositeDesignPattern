package edu.elon.accessories;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.awt.event.ActionEvent;
import java.rmi.*;

//the server class

//the object the client wants to call methods on
//implements the methods of the remote interface
//contains methods that do the real work
//pretends to be the service object

//doesnt have any of actual method logic, instead contacts the server, transfers
//info about the method call(name of method, args) and waits for return from server
public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
	private String name;
	private double value;
	private boolean bool;
	private String operation;
	//CalculatorClient client = new CalculatorClient();
	double val1 = 0;
	double val2 = 0;
	double result = 0.0;
	int counter = 1;


	protected CalculatorImpl(String n) throws RemoteException {
		//super();
		name = n;
		value = 0;
	}

	@Override
	public void add(double addValue) throws RemoteException {
		// TODO Auto-generated method stub
		value += addValue;
	}

	@Override
	public void subtract(double subValue) throws RemoteException {
		// TODO Auto-generated method stub
		value -= subValue;
	}

	@Override
	public void divide(double divValue) throws RemoteException {
		// TODO Auto-generated method stub
		value = value/divValue;
	}

	@Override
	public void multiply(double multValue) throws RemoteException {
		// TODO Auto-generated method stub
		value = value * multValue;
	}

	@Override
	public double enter() throws RemoteException {
		// TODO Auto-generated method stub
		return value;
	}

	/*@Override
	public double getValue() throws RemoteException {
		return value;
	}*/

	public void setValue(double newValue) throws RemoteException{
		//bool = true;
		//operation = op;

	}
	
	@Override
	public void operation(String operator) {
		switch(operator)  {
			case "+": result = val1 + val2;
				break;
			case "-": result = val1 - val2;
				break;
			case "*": result = val1 * val2;
				break;
			case "/": result = val1 / val2;
				break;
		}

	}
}
