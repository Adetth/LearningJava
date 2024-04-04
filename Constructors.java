//The main class has to have the same name as the file.
public class Constructors {

    // Initializing a variable inside the main class
    int x;

    // This is a constructor of the main class
    // A constructor does not have a return type
    // A constructor can be overloaded or overwritten
    public Constructors() {

        // Setting the initial value of x as 5
        x = 5;

    }

    // Main method in java
    public static void main(String[] args) {

        // Creating an object for the main class and calling its constructor
        // Calling a constructor is nothing but running that constructor / anything
        // inside it.
        Constructors objName = new Constructors();

        // Using the class' object name to access the variable x that resides inside the
        // class
        // and not in any method.
        System.out.println(objName.x);

    }
}