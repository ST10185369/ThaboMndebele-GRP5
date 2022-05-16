/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountregistrationandlogin;



/**
 *
 * @author THABO MNDEBELE
 */
public class Tasks{
    public boolean checkTaskDescription(String taskDescriptions){
      boolean descriptionLength = false; 
      
        for (int i = 0; i < taskDescriptions.length() ; i++) {
            
            if(taskDescriptions.length() > 50)
            {
               descriptionLength = false;
            }
            else
            {
                  descriptionLength = true; 
            }
            
            if(descriptionLength == true)
            {
                System.out.println("Task successfully captured"); 
                break;
            }
            else
            {
                System.out.println("Please enter description of less than "
                        + "50 characters");   
            }
            
            }
             return true;
             
           }
       
    public String createTaskID(String taskID, String taskName, String developerDetails, 
            int numOfTasks)
    {
        taskID = taskName.substring(0,2)+ ":" + Integer.toString(numOfTasks)+":" +
                developerDetails.substring(developerDetails.length()-3);
        
        return taskID.toUpperCase();

    }
    public String printTaskDetails(String taskID, String taskName, String developerDetails,
            String taskDescriptions, String firstName, String lastName, int taskDuration,
            int numOfTasks, String taskStatus){
        
        String printOut = taskName+ " " + Integer.toString(numOfTasks)+ " " +
                taskDescriptions + " " + firstName + " " + lastName + " " + 
                Integer.toString(taskDuration) + " " + taskID + " " +taskStatus;
        
        return printOut;
        
    }
    public int returnTotalHours(int numOfTasks, int taskDuration){
     int totalHours = 0;
        for (int i = 0; i < numOfTasks; i++) {
            totalHours+=taskDuration;
        }
        return totalHours;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
}