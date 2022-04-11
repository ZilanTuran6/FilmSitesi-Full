/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.aktorDAO;
import entity.aktor;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Asus
 */
public class aktorControllerTest {
    
    public aktorControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of updateForm method, of class aktorController.
     */
    @Test
    public void testUpdateForm() {
        System.out.println("updateForm");
        aktor akt = null;
        aktorController instance = new aktorController();
        String expResult = "";
        String result = instance.updateForm(akt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class aktorController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        aktorController instance = new aktorController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class aktorController.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        aktor akt = null;
        aktorController instance = new aktorController();
        String expResult = "";
        String result = instance.delete(akt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class aktorController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        aktorController instance = new aktorController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlist method, of class aktorController.
     */
    @Test
    public void testGetAlist() throws Exception {
        System.out.println("getAlist");
        aktorController instance = new aktorController();
        List<aktor> expResult = null;
        List<aktor> result = instance.getAlist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlist method, of class aktorController.
     */
    @Test
    public void testSetAlist() {
        System.out.println("setAlist");
        List<aktor> alist = null;
        aktorController instance = new aktorController();
        instance.setAlist(alist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdao method, of class aktorController.
     */
    @Test
    public void testGetAdao() {
        System.out.println("getAdao");
        aktorController instance = new aktorController();
        aktorDAO expResult = null;
        aktorDAO result = instance.getAdao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdao method, of class aktorController.
     */
    @Test
    public void testSetAdao() {
        System.out.println("setAdao");
        aktorDAO adao = null;
        aktorController instance = new aktorController();
        instance.setAdao(adao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktor method, of class aktorController.
     */
    @Test
    public void testGetAktor() {
        System.out.println("getAktor");
        aktorController instance = new aktorController();
        aktor expResult = null;
        aktor result = instance.getAktor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktor method, of class aktorController.
     */
    @Test
    public void testSetAktor() {
        System.out.println("setAktor");
        aktor aktor = null;
        aktorController instance = new aktorController();
        instance.setAktor(aktor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
