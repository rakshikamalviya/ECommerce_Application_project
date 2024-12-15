package ecommerce.main;

class UserService {
 private final UserDAO userDAO = new UserDAO();

 public boolean registerUser(String username, String password, String email) {
     User user = new User(username, password, email);
     return userDAO.saveUser(user);
 }

 public User loginUser(String username, String password) {
     User user = userDAO.getUserByUsername(username);
     if (user != null && user.getPassword().equals(password)) {
         return user;
     }
     return null;
 }
}
