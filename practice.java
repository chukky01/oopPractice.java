import java.util.ArrayList; // Import ArrayList class
import java.util.List;      // Import List interface

public class practice {

    public static void main(String[] args) {
        // Initialize a static list to hold User objects in the User class
        User.admins = new ArrayList<User>();
        
        // Add new User objects to the static list
        User.admins.add(new User("Paul"));
        User.admins.add(new User("You"));
        User.admins.add(new User("Jacob"));

        // Traditional for-loop to iterate through the list and print each user's name
        for(int i = 0; i < User.admins.size(); i++){
            System.out.println(User.admins.get(i).get_name());
        }

        // Enhanced for-loop (for-each) to iterate through the list and print each user's name
        for(User u: User.admins){
            System.out.println(u.get_name());
        }
    }
}
