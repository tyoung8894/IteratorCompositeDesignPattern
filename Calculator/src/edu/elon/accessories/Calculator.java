package edu.elon.accessories;

import java.rmi.Remote;
import java.rmi.RemoteException;


//provide a set of methods to be called remotely by client
//the client will use this as the class type for service
public interface Calculator extends Remote {

	void add(double addValue) throws RemoteException;
	void subtract(double subValue) throws RemoteException;
	void divide(double divValue) throws RemoteException;
	void multiply(double multValue) throws RemoteException;
	double enter() throws RemoteException;
	//double getValue() throws RemoteException;
	void setOperation(String op) throws RemoteException;
	void operation(String operator) throws RemoteException;
}
