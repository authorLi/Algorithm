package Proxy;

public class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String name) {
        System.out.println("加入了一个员工: " + name);
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("辞退了一个员工: " + name);
    }
}
