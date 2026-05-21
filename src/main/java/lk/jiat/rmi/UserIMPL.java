package lk.jiat.rmi;

import lk.jiat.rmi.client.UserService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lk.jiat.rmi.model.User;

public class UserIMPL extends UnicastRemoteObject implements Remote, UserService {

    public static Map<Integer, User> userList;

    protected UserIMPL() throws RemoteException {
        userList = new HashMap();
    }

    @Override
    public User getUserById(int id) throws RemoteException {
        return userList.get(id);
    }

    @Override
    public void addUser(User user) throws RemoteException {
        int id = user.getId();
        if(userList.containsKey(id)){
            System.out.println("User id already registerd");
            return;
        }
        userList.put(user.getId(),user);
    }

    @Override
    public void updateUser(User user) throws RemoteException {
        int id = user.getId();
        if(!userList.containsKey(id)){
            System.out.println("User Not Found");
            return;
        }
        userList.put(id, user);
    }

    @Override
    public void deleteUser(int id) throws RemoteException {
        if(!userList.containsKey(id)){
            System.out.println("User Not Found");
            return;
        }
        userList.remove(id);
        System.out.println("User removed seccessfully.");
    }

    @Override
    public List<User> getAllUsers() throws RemoteException {
        List<User> list = new ArrayList<>();
        for(User u : userList.values()){
            list.add(u);
        }
        return list;
    }
}
