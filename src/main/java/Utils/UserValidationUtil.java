package Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import Hello.LoginData;
import Hello.User;

public class UserValidationUtil {
    private static Map<String, String> userLoginDetails = new HashMap<>();
    private static String lastNames[] = { "Patani", "Verma", "Kapoor", "Khan", "Emanuel", "Lucas", "Bill", "Kovalski", "Lee", "Hashimoto" };
    private static boolean marriedStatus[] = { true, false};
    private static String sex[] = { "MALE", "FEMALE", "OTHERS"};
    private static int counter = 0;

    private enum SEX {
        MALE, FEMALE
    };

    private static void init() {
        userLoginDetails.put("ayush", "passw0rd");
        userLoginDetails.put("megha", "p@ssw0rd");
        userLoginDetails.put("ayusme", "p@$$w0rd");
    }

    public static boolean validate(LoginData loginData) {
        init();
        if (userLoginDetails.containsKey(loginData.getUsername().toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void populateUserData(User user) {
        String username = user.getFirstName();
        if (username.equalsIgnoreCase("ayush")) {
            populateUserData(user, "Verma", 30, "Male", true);
        } else if (username.equalsIgnoreCase("megha")) {
            populateUserData(user, "Verma", 27, "Female", true);
        } else {
            populateUserDataUnknownUser(user);
        }
    }

    private static void populateUserData(User user, String lastName, int age, String sex, boolean isMarried) {
        user.setLastName(lastName);
        user.setAge(age);
        user.setSex(sex);
        user.setMarried(isMarried);
    }

    private static void populateUserDataUnknownUser(User user) {
        counter++;
        int lnIndex = counter%10;
        user.setLastName(lastNames[lnIndex]);

        int sexIndex = counter%3;
        user.setSex(sex[sexIndex]);

        int marriageIndex = counter%2;
        user.setMarried(marriedStatus[marriageIndex]);

        if(counter > 125){
            counter = 1;
        }
        user.setAge(counter);
    }
}
