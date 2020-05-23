package service;


import model.User;

public class UserCreator  {

    public static final String TESTDATA_USER_EMAIL= "email";
    public static final String TESTDATA_USER_PASSWORD =  "password";


/*
    public UserCreator(String TESTDATA_USER_EMAIL, String TESTDATA_USER_PASSWORD) {
        super(TESTDATA_USER_EMAIL, TESTDATA_USER_PASSWORD);
    }
*/

    public static User withCredentialsFromProperty() {
        return new User(TestDataReader.getTestData(TESTDATA_USER_EMAIL), TestDataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static User withEmptyUserName() {
        return new User("", TestDataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static User withEmptyPassword() {
        return new User(TestDataReader.getTestData(TESTDATA_USER_EMAIL), "");
    }
}
