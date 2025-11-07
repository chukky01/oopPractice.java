import java.util.List;

public class User {
    // Private field to store the user's name
    private String _name;
    // Private field to store the user's membership level, default is "Bronze"
    private String _membership = "Bronze";
    // Static list to hold all admin users
    public static List<User> admins;

    // Default constructor
    public User() {
    }

    // Constructor with name and membership parameters
    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    // Constructor with only name parameter, membership defaults to "Bronze"
    public User(String name) {
        set_name(name);
    }

    // Method to set the user's name
    void set_name(String name) {
        _name = name;
    }

    // Method to get the user's name
    String get_name() {
        return _name;
    }

    // Method to set the user's membership using a String
    void set_membership(String membership) {
        _membership = membership;
    }

    // Method to set the user's membership using the Membership enum
    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    // Method to get the user's membership
    String get_membership() {
        return _membership;
    }

    // Override toString method to provide a string representation of the User object
    public String toString() {
        return get_name() + " " + get_membership();
    }

    // Method to check equality between two User objects based on name and membership
    public boolean equals(User u2) {
        if (get_name().equals(u2.get_name()) && get_membership().equals(u2.get_membership())) {
            return true;
        } else {
            return false;
        }
    }

    // Membership enum with possible membership levels
    public enum Membership {
        Bronze, Silver, Gold;
    }
}
