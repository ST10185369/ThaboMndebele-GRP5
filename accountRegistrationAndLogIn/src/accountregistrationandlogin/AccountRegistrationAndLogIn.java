/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountregistrationandlogin;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author thabo
 */
public class AccountRegistrationAndLogIn {
 


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String userName;
       String firstName = "";
       String lastName = "";
       
       String fullNames = firstName + lastName;
       
       String password;
       String taskName = "";
       String taskDescriptions = "";
       String developerName = "";
       String developerSurname = "";
       String developerDetails = "";
       developerDetails = developerName + developerSurname;
       String taskID = "";
       int taskStatus =0;
       int taskDuration = 0;
       int numOfTasks = 0;
       
       
       
       Scanner input = new Scanner(System.in);
       LogIn obj1 = new LogIn();
       
       
       
      
        
        System.out.println("Enter your first name");
        firstName = input.nextLine();
        System.out.println("Enter your last name");
        lastName = input.nextLine();
        
        //Username 
        System.out.println("Create username ,your username must contain an underscore"
                + "and must not be more than five characters in length");
        userName = input.nextLine();
        System.out.println(obj1.charCheck(userName));
        
       
        //password complexity
        System.out.println("Create password, your password must be at least 8 characters "
                + "long, must contain a capital letter, a number and a special character.");
        password = input.nextLine();
        System.out.println(obj1.passwordComplexityCheck(password));
        
        //userRegistration
        System.out.println("Confirm your username to register");
        String name = input.nextLine();
        
        System.out.println("Confirm your password to register");
        String password1 = input.nextLine();
        
        System.out.println(obj1.userRegistration(userName, name, password, password1));
        
        //LogIn
        System.out.println("Confirm your username to login");
        name = input.nextLine();
        System.out.println("Confirm your password to login");
        password1 = input.nextLine();
        obj1.userLogIn(userName, name, password, password1);
       
        System.out.println(obj1.userLogInStatus(firstName, lastName, userName, name, password, password1));
        
        System.out.println(obj1.taskFeatures(fullNames, userName, name, password, password1));
         
        Tasks obj2 = new Tasks();
       //Options
       int loopCount = 1;
       int menuOptions = 3;
       
       while(loopCount != menuOptions){
           String Menu = " Press 1 to add tasks \n " + 
                   "Press 2 to show report \n " + "Press 3 to quit";
           System.out.println(Menu.substring(0));
           loopCount = loopCount + 1;
           menuOptions = input.nextInt();
           
           
           if(menuOptions == 1){
               int numTask = 0;
               System.out.println("Add number of tasks");
               numOfTasks = input.nextInt();
               
               
               System.out.println("Enter task name");
               taskName = input.next();
               
               System.out.println("Enter task a description");
               taskDescriptions = input.next();
               System.out.println(obj2.checkTaskDescription(taskDescriptions));
               
               System.out.println("Enter developer firsts name");
               developerName = input.next();
               System.out.println("Enter developer surname");
               developerSurname = input.next();
               
               
               
               System.out.println(developerName +" " + developerSurname);
              
                System.out.println("Enter task duration ");
                taskDuration = input.nextInt();
                
                //Task status
                taskStatus = 0;
                int numOfOptions = taskStatus + 1;
                
                System.out.println("Option 1. To Do \n" + "Option 2. Doing \n" + "Option 3. Done");
                taskStatus = input.nextInt();
                if(taskStatus == 1){
                    System.out.println("To Do");
                }
                else if(taskStatus == 2){
                    System.out.println("Doing");
                }
                else if(taskStatus == 3){
                    System.out.println("Done");
                }
                else
                {
                    System.out.println("invalid input");
                }
                
           
           
             
               System.out.println(obj2.returnTotalHours(numOfTasks, taskDuration));
           
           }
           else if(menuOptions == 2){
               System.out.println("Coming Soon");
           }
           else if(menuOptions == 3){
               System.out.println("Quit");
           }
           else
           {
               System.out.println("Invalid input");   
           }
          
       
       }
     JOptionPane.showMessageDialog(null, taskStatus+"\n"+developerDetails +"\n"+numOfTasks+
                        "\n"+taskName+ "\n"+taskDescriptions + "\n" + taskID + "\n" + taskDuration);
        
        
        
        
        
    }
    

}