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
public class LogInTest {
    
    public LogInTest() {
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
     * Test of charCheck method, of class LogIn.
     */
    @Test
    public void testCharCheck() {
        System.out.println("charCheck");
        String userName = "";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.charCheck(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of passwordComplexityCheck method, of class LogIn.
     */
    @Test
    public void testPasswordComplexityCheck() {
        System.out.println("passwordComplexityCheck");
        String password = "";
        LogIn instance = new LogIn();
        boolean expResult = false;
        boolean result = instance.passwordComplexityCheck(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userRegistration method, of class LogIn.
     */
    @Test
    public void testUserRegistration() {
        System.out.println("userRegistration");
        String userName = "";
        String name = "";
        String password = "";
        String password1 = "";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.userRegistration(userName, name, password, password1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of userLogIn method, of class LogIn.
     */
    @Test
    public void testUserLogIn() {
        System.out.println("userLogIn");
        String userName = "";
        String name = "";
        String password = "";
        String password1 = "";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.userLogIn(userName, name, password, password1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of userLogInStatus method, of class LogIn.
     */
    @Test
    public void testUserLogInStatus() {
        System.out.println("userLogInStatus");
        String firstName = "";
        String lastName = "";
        String userName = "";
        String name = "";
        String password = "";
        String password1 = "";
        LogIn instance = new LogIn();
        String expResult = "";
        String result = instance.userLogInStatus(firstName, lastName, userName, name, password, password1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of taskFeatures method, of class LogIn.
     */
    @Test
    public void testTaskFeatures() {
        System.out.println("taskFeatures");
        String fullNames = "";
        String userName = "";
        String name = "";
        String password = "";
        String password1 = "";
        LogIn instance = new LogIn();
        String expResult = "";
        String result = instance.taskFeatures(fullNames, userName, name, password, password1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
