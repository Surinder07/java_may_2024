package june18.encap;

public class LogicMain {
    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp("pragra", "12345");

        // logic to the app
       // loginApp.login("pragra","123456");


        // Hacker
        loginApp.setPassword("mypassword");
        //System.out.println(loginApp.getPassword());
        System.out.println(loginApp.getUsername());
        loginApp.login("pragra", "mypassword");

    }
}

/*
1. Excel Sheet app
1. read only file
2. read and write both





 */