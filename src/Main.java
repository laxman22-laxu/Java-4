public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person("John", 30);

        // Accessing data using getters
        System.out.println("Name: " + person.getName()); // Output: John
        System.out.println("Age: " + person.getAge());   // Output: 30

        // Modifying data using setters
        person.setName("Alice");
        person.setAge(25);

        // Displaying updated information
        person.displayInfo();
    }
}
