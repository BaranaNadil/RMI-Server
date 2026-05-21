package lk.jiat.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer{
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(6666);
            registry.bind("massage_service", new MassageIMPL());
            registry.bind("user_service", new UserIMPL());

            System.out.println("RMI server started...");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}