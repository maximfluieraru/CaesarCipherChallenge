/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caesarcipherchallenge;

import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxim
 */
public class CaesarCipherTest {

    public CaesarCipherTest() {
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
     * Test of cipher method, of class CaesarCipher.
     */
    @Test
    public void testCipher() {
        System.out.println("cipher");
        String value = "Hello";
        CaesarCipher instance = new CaesarCipher(4);
        String expResult = "Lipps";
        
        String result = instance.encipher(value);
        assertEquals(expResult, result);

        instance = new CaesarCipher(0);
        assertEquals("Hello", instance.encipher("Hello"));

        instance = new CaesarCipher(-1);
        assertEquals("Ana fhudr 0//$ sn @khbd.", instance.encipher("Bob gives 100$ to Alice."));
    }

}
