package data.provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimplification {

    //Old way
    /*@DataProvider
    public Object[][] users(){
        return new Object[][] {
                { new User() },
                { new User() }
        };
    }*/

    //New way
    @DataProvider
    public User[] users() {
        return new User[] { new User(), new User() };
    }

    @Test(dataProvider = "users")
    public void userShouldLogin(User user){
        //NOP
    }

    private static class User{
        String userName;
        String password;
    }

}
