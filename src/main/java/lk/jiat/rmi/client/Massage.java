package lk.jiat.rmi.client;

import lk.jiat.rmi.model.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Massage extends Remote {
    public String hello() throws RemoteException;
    public Data getData() throws RemoteException;
    public String getResult(int num1, int num2) throws RemoteException;
}
