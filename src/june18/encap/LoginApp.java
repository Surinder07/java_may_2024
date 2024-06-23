package june18.encap;

public class LoginApp {

    // access modifier ----- public , private , protected , default[no keyword for default ]
    private String username;
    private String password;

    public LoginApp(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // sets the logic to login into this app
    public void login(String username, String password) {

        if(username.equals(this.username) && password.equals(this.password)){
            System.out.println("Login Successful!");
        }
        else {
            System.out.println("Invalid Credentials...");
        }

    }


    @Override
    public String toString() {
        return "LoginApp{" +
                "userName='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
