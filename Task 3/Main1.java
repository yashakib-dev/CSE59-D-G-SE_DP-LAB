
public class Main1{
    public static void main(String[] args) {
        User user = new User("Shakib", "shakib@gmail.com");
        
        if(EmailValidator.isValid(user.getEmail())){
            UserRepository.save(user);
    }
        else{
            System.out.println("Invalid email format");
        }
}
}

class User{
    private String username;
    private String email;
    
    public User(String username, String email){
        this.username = username;
        this.email = email;
    }
    public String getUsername(){
        return username;
    }
    
    public String getEmail(){
        return email;
    }
    
}

class EmailValidator{
    public static boolean isValid(String email){
        return email!= null&&email.contains("@");
    }
}



class UserRepository{
 public static void save(User user){
     System.out.println("Connecting to database...");
     System.out.println("Saving user" + user.getUsername() + "to the users table.");
 }   
}
