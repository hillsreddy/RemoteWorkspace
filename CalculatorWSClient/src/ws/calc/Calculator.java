/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.calc;

public interface Calculator extends java.rmi.Remote {
    public int add(int a, int b) throws java.rmi.RemoteException;
    public int divide(int a, int b) throws java.rmi.RemoteException;
    public int multiply(int a, int b) throws java.rmi.RemoteException;
    public int subtract(int a, int b) throws java.rmi.RemoteException;
}
