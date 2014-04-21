/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import AgendaSpringH.controladores.ContactoEntidad;
import AgendaSpringH.controladores.PruebaControlador;
import java.util.HashMap;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author angelaprades
 */
public class ControladorTest {
    
    public ControladorTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testHandleRequestView() throws Exception{
        PruebaControlador testControl = new PruebaControlador();
        //ModelAndView modelo = testControl.manejarCadena(new HashMap<String,Object>());
        //ModelAndView modelo = testControl.handleRequest(null, null);
        
        //Assert.assertEquals("index", modelo.getViewName());
        //Assert.assertNotNull(modelo.getModel());
        //ContactoEntidad nowValue = (ContactoEntidad) modelo.getModel().get("contacto");
        //Assert.assertNotNull(nowValue);
    }
}
