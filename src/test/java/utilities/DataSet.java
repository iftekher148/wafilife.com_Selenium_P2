package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "invalidCredentials")
    public static Object invalidCredentialsDataSet(){
        Object[][] dataset = {
                {"","","Error: ইউজার নাম প্রয়োজন"},
                {"polokhack123@gmail.com","","Error: The password field is empty."},
                {"","polokhack123","Error: ইউজার নাম প্রয়োজন"},
                {"abc234@gmail.com","123","Unknown email address. Check again or try your username."}
        };
        return dataset;
    }
}
