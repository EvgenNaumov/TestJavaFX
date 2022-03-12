package sample.DataUser;

public class Users {
    private String name;
    private String login;
    private String password;
    private String nic;

    public Users() {
        this.name = "";
        this.login = "";
        this.password = "";
        this.nic = "avto";

    }

    public Users(String name, String login, String password, String nic) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNic() {
        return nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
