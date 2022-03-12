package sample.DataUser;

import javax.security.auth.login.LoginContext;
import java.util.ArrayList;
import java.util.Arrays;

public class DataUsers {
    private ArrayList<Users> listUsers;

    public DataUsers() {
        listUsers = new ArrayList<>();
    }

    public void  setUserData(Users user){
        listUsers.add(user);
    }


    public Users getUserData(String nic){
        if (nic.isEmpty()){
        return new Users();
        }

        for (Users us:listUsers
             ) {
            if (us.getNic()==nic){
                return us;
            }
        }
        return new Users();
    }

    public void delUserData(String nic){

    }


}
