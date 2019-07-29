package Proxy;

public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newInstance(new UserManagerImpl());
        userManager.addUser("张三");

        userManager.deleteUser("王五");
    }
}
