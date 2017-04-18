package Hello;

public class Login {
    private String loginResult = "";
    private User userDetails = null;

    public Login(){};
    public void testLogin(String username, String password, boolean validate){
        if(validate){
            if(validUserName(username)
                    && validPassword(password)){
                setLoginResult("Welcome, " +username);
                prepareUserDetails(username);
            }else{
                setLoginResult("Username or password is incorrect!");
            }
        }else{
            prepareUserDetails(username);
        }
        
    }
    private boolean validUserName(String username){
       if (username.equalsIgnoreCase("ayush") || username.equalsIgnoreCase("megha")){
           return true;
       }        
       return false;
    }
    
    private boolean validPassword(String password){
        if(password.equalsIgnoreCase("passw0rd")
                || password.equalsIgnoreCase("pa$$word")
                || password.equalsIgnoreCase("p@ssword")){
            return true;
        }
        return false;
    }
    
    private void prepareUserDetails(String username){
        userDetails = new User();
        userDetails.populateUserData(username);
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
