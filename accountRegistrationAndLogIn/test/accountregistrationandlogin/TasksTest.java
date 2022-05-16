/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountregistrationandlogin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author THABO MNDEBELE
 */
public class TasksTest {
    
    public TasksTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkTaskDescription method, of class Tasks.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescriptions = "";
        Tasks instance = new Tasks();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescriptions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of createTaskID method, of class Tasks.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskID = "";
        String taskName = "";
        String developerDetails = "";
        int numOfTasks = 0;
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.createTaskID(taskID, taskName, developerDetails, numOfTasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printTaskDetails method, of class Tasks.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskID = "";
        String taskName = "";
        String developerDetails = "";
        String taskDescriptions = "";
        String firstName = "";
        String lastName = "";
        int taskDuration = 0;
        int numOfTasks = 0;
        String taskStatus = "";
        Tasks instance = new Tasks();
        String expResult = "";
        String result = instance.printTaskDetails(taskID, taskName, developerDetails, taskDescriptions, firstName, lastName, taskDuration, numOfTasks, taskStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of returnTotalHours method, of class Tasks.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int numOfTasks = 0;
        int taskDuration = 0;
        Tasks instance = new Tasks();
        int expResult = 0;
        int result = instance.returnTotalHours(numOfTasks, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
