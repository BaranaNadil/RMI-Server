package lk.jiat.rmi;

import lk.jiat.rmi.client.Massage;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import lk.jiat.rmi.model.*;

public class MassageIMPL extends UnicastRemoteObject implements Massage, Remote {

    protected MassageIMPL() throws RemoteException {
    }

    @Override
    public String hello() {
        System.out.println("Server: hello....");
        return null;
    }

    @Override
    public Data getData() throws RemoteException {
        return new Data(1, "Barana");
    }

    @Override
    public String getResult(int num1, int num2) throws RemoteException {
        return String.valueOf(num1 * num2);
    }
}
