import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Darya", "Dancova", "Sales", 5000);
        employees[1] = new Employee("Irina", "Krug", "Marketing", 6000);
        employees[2] = new Employee("Igor", "Ribakov", "IT", 5500);
        employees[3] = new Employee("Nikita", "Demokratov", "Finance", 6500);
        employees[4] = new Employee("Yan", "Kochev", "IT", 70000);

       
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter last name to search: ");
         String lastName = scanner.nextLine();
         
         boolean found = false;
         for (Employee employee : employees) {
         if (employee.getLastName().equalsIgnoreCase(lastName)) {
         System.out.println(employee);
         found = true;
         }
         }
         
         if (!found) {
         System.out.println("No employees found with the last name " + lastName);
         }
        
    }
}