/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountregistrationandlogin;







/**
 *
 * @author thabo
 */
public class LogIn {
  public boolean charCheck(String userName)
  {
   boolean nameCheck = false;
   
      for (int i = 0; i < userName.length(); i++) {
          if(userName.length() > 5)
          {
              nameCheck = false;
          }
          else if(userName.charAt(i) == 95)
          {
              nameCheck = true;
          }
      
      }
          if(nameCheck == true)
          {
              System.out.println("Username successfuly captured, proceed to password.");
          }
         
          else
          {
            System.out.println("Username is not correctly formatted, "
                     + "please ensure that your username contains an underscore "
                      + "and is no more than 5 characters in length.");
          }
          return true;
        
  }
   public boolean passwordComplexityCheck(String password)
   {
       boolean passwordLength = false;
       boolean upperCase = false;
       boolean lowerCase = false;
       boolean number = false;
       boolean specialCharacter = false;
       
       for (int i = 0; i < password.length(); i++) {
           if((int)password.charAt(i) >= 65 && password.charAt(i) <= 90 || 
                   password.charAt(i) >= 97 && password.charAt(i) <= 122 || 
                   password.charAt(i) >= 48 && password.charAt(i) <= 57 || 
                   password.charAt(i) >= 32 && password.charAt(i) <= 47)
           {
               passwordLength = true;
               upperCase = true;
               lowerCase = true;
               number = true;
               specialCharacter = true;
           }
       }
       if(passwordLength && upperCase && lowerCase && number && specialCharacter
               == true && password.length() >= 8)
       {
           System.out.println("Password successfully captured.");
       }
       else
       {
           System.out.println("Password is not correctly formatted, please ensure "
                   + "that the password contains at least 8 characters, a capital "
                   + "letter, a number and a special character.");   
       }
       return true;
   }
   public boolean userRegistration(String userName, String name, String password,
           String password1)
   {
       if(!userName.equals(name))
       {
           System.out.println("Username is incorrectly formatted "
                   + "re-enter username.");
       }
       else if(!password.equals(password1))
       {
           System.out.println("Password is incorrectly formatted please "
                   + "re-enter password.");
       }
       else
       {
           System.out.println("Registration successful.");
       }
       return true;
   }
   
   public boolean userLogIn(String userName,String name,String password,
           String password1)
   {
       if(userName.equals(name) && password.equals(password1))
       {
         return true;  
       }
          
       else
       {
        return false;   
       }
   }
   public String userLogInStatus(String firstName, String lastName, String userName, String name,
           String password, String password1)
   {
       String fullNames = firstName + lastName;
    if(userLogIn(userName, name, password, password1) == true)
    {
        return ("Welcome " + fullNames  + " it is great to see you.");
    }
    else
    {
     return ("Username or password is incorrectly formatted.");  
        
    }   
}
   public String taskFeatures(String fullNames, String userName, String name,
           String password, String password1){
         if(userLogIn(userName, name, password, password1) == true)
         {
           return ("Welcome to KanBan");  
         }
         else
         {
          return ("");   
         }
         
        
         
   }
  
}
