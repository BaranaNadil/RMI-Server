package lk.jiat.rmi;

import java.rmi.Remote;

public class MassageIMPL implements Massage, Remote {
    @Override
    public void hello() {
        System.out.println("Server: hello....");
    }
}
