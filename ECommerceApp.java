package ecommerce.main;

import java.util.Scanner;
public class ECommerceApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     UserService userService = new UserService();
     ProductService productService = new ProductService();

     System.out.println("Welcome to E-Commerce Application!");
     while (true) {
         System.out.println("1. Register");
         System.out.println("2. Login");
         System.out.println("3. Exit");
         System.out.print("Choose an option: ");
         int choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
             case 1:
                 System.out.print("Enter username: ");
                 String username = scanner.nextLine();
                 System.out.print("Enter password: ");
                 String password = scanner.nextLine();
                 System.out.print("Enter email: ");
                 String email = scanner.nextLine();

                 if (userService.registerUser(username, password, email)) {
                     System.out.println("Registration successful!");
                 } else {
                     System.out.println("Registration failed. Try again.");
                 }
                 break;

             case 2:
                 System.out.print("Enter username: ");
                 String loginUsername = scanner.nextLine();
                 System.out.print("Enter password: ");
                 String loginPassword = scanner.nextLine();

                 User user = userService.loginUser(loginUsername, loginPassword);
                 if (user != null) {
                     System.out.println("Login successful! Welcome " + user.getUsername());
                     productService.displayProducts();
                 } else {
                     System.out.println("Invalid credentials. Try again.");
                 }
                 break;

             case 3:
                 System.out.println("Thank you for using E-Commerce Application!");
                 return;

             default:
                 System.out.println("Invalid option. Try again.");
         }
     }
 }
}
