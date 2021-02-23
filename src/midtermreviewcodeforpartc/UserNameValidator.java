
package midtermreviewcodeforpartc;

import java.util.Scanner;

public class UserNameValidator {
    
    private String username;
    
    private Scanner sc = new Scanner(System.in);
    
    public void validateUsername()
    {
        System.out.println("Enter a usernname");
        username = sc.nextLine();
        if (username == " ")
            System.out.println("username can not be empty");
    }
   
    public String getUsername() {
        return this.username;
    }


    public void setUsername(String username) {
        this.username = username;
    }
    
    

    
    
}
