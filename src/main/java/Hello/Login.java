package Hello;

import Utils.UserValidationUtil;

public class Login {
    private String loginResult = "";
    private User userDetails = null;

    public Login(){};

    public void testLogin(String username, String password){
        LoginData loginData = new LoginData(username,password);
        if(UserValidationUtil.validate(loginData)){
            setLoginResult("Welcome, " +username);
            prepareUserDetails(username);
        }else{
            setLoginResult("Username or password is incorrect!");
        }
    }

    public void testLoginWithRequest(LoginData loginData){
        String username = loginData.getUsername();
        if(UserValidationUtil.validate(loginData)){
            setLoginResult("Welcome, " +username);
        }else{
            setLoginResult("Username or password is incorrect!");
        }
        prepareUserDetails(username);
    }

    private void prepareUserDetails(String username){
        userDetails = new User();
        userDetails.setFirstName(username);
        UserValidationUtil.populateUserData(userDetails);
    }

    public String getLoginResult() {
        return loginResult;
    }
    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult;
    }
    public User getUserDetails() {
        return userDetails;
    }
    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
    }
}
