/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstier;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PaymentBusinessTierTest {
    
    public PaymentBusinessTierTest() {
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
     * Test of createPayment method, of class PaymentBusinessTier.
     */
    @Test
    public void testCreatePayment() throws Exception {
        System.out.println("createPayment");
        String payment_id = "P1006";
        String order_no = "O1006";
        String payment_type = "Cash";
        String account_no = "";
        double subtotal =5;
        double gst = 0.3;
        double total = 5.3;
        PaymentBusinessTier instance = new PaymentBusinessTier();
        boolean expResult = false;
        boolean result = instance.createPayment(payment_id, order_no, payment_type, account_no, subtotal, gst, total);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPaymentId method, of class PaymentBusinessTier.
     */
    @Test
    public void testGetPaymentId() throws Exception {
        System.out.println("getPaymentId");
        PaymentBusinessTier instance = new PaymentBusinessTier();
        String expResult = "P1000"+"P1001"+"P1002"+"P1003"+"P104"+"P1005"+"P1006";
        String result = instance.getPaymentId();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calculation method, of class PaymentBusinessTier.
     */
    @Test
    public void testCalculation() throws Exception {
        System.out.println("calculation");
        String order_no = "O1006";
        PaymentBusinessTier instance = new PaymentBusinessTier();
        double expResult = 5;
        double result = instance.calculation(order_no);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of retrievePayment method, of class PaymentBusinessTier.
     */
    @Test
    public void testRetrievePayment() throws Exception {
        System.out.println("retrievePayment");
        String payment_id = "P1000";
        PaymentBusinessTier instance = new PaymentBusinessTier();
        String expResult = "O1001"+"O1002";
        String result = instance.retrievePayment(payment_id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrievePaymentId method, of class PaymentBusinessTier.
     */
    @Test
    public void testRetrievePaymentId() throws Exception {
        System.out.println("retrievePaymentId");
        PaymentBusinessTier instance = new PaymentBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrievePaymentId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of generateReceipt method, of class PaymentBusinessTier.
     */
    @Test
    public void testGenerateReceipt() throws Exception {
        System.out.println("generateReceipt");
        String payment_id = "";
        String member = "";
        PaymentBusinessTier instance = new PaymentBusinessTier();
        String expResult = "";
        String result = instance.generateReceipt(payment_id, member);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of retrieveReceipt method, of class PaymentBusinessTier.
     */
    @Test
    public void testRetrieveReceipt() throws Exception {
        System.out.println("retrieveReceipt");
        String payment_id = "";
        PaymentBusinessTier instance = new PaymentBusinessTier();
        ArrayList expResult = null;
        ArrayList result = instance.retrieveReceipt(payment_id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewItem method, of class PaymentBusinessTier.
     */
    @Test
    public void testViewItem() throws Exception {
        System.out.println("viewItem");
        DefaultTableModel model = null;
        String order_no = "";
        PaymentBusinessTier instance = new PaymentBusinessTier();
        instance.viewItem(model, order_no);
        
    }
    
}
