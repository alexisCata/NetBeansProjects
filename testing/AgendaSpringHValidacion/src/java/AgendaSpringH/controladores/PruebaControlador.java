/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AgendaSpringH.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author angelaprades
 */
@Controller
public class PruebaControlador{
/*
    @RequestMapping("/index") //Esta anotacion es pa decirle el mapeo
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView modelo = new ModelAndView();
        //modelo.setViewName("/WEB-INF/jsp/index.jsp");
        modelo.setViewName("index");
        Map<String,Object> mapa = new HashMap();
        ContactoEntidad contacto = new ContactoEntidad();
        contacto.setNombre("Juan");
        contacto.setTelefono("662345123");
        contacto.setEmail("juan@hotmail.com");
        mapa.put("contacto",contacto);
        //mapa.put(contacto.getNombre(), contacto);
        //mapa.put(contacto.getTelefono(), contacto);
        //mapa.put(contacto.getEmail(), contacto);
        modelo.addAllObjects(mapa);
        return modelo; //To change body of generated methods, choose Tools | Templates.
    }
  */  
    
    /*
    @RequestMapping("/index")
    public ModelAndView manejarPeticion() throws Exception{
        ModelAndView modelo = new ModelAndView();
        //modelo.setViewName("/WEB-INF/jsp/index.jsp");
        modelo.setViewName("index");
        Map<String,Object> mapa = new HashMap();
        ContactoEntidad contacto = new ContactoEntidad();
        contacto.setNombre("Juan");
        contacto.setTelefono("662345123");
        contacto.setEmail("juan@hotmail.com");
        mapa.put("contacto",contacto);
        //mapa.put(contacto.getNombre(), contacto);
        //mapa.put(contacto.getTelefono(), contacto);
        //mapa.put(contacto.getEmail(), contacto);
        modelo.addAllObjects(mapa);
        return modelo;
    }
    */
    @RequestMapping("/index")
    public void manejarCadena(Map<String,Object> mapa){
        String vista ="index";
        ContactoEntidad contacto = new ContactoEntidad();
        contacto.setNombre("Juan");
        contacto.setTelefono("662345123");
        contacto.setEmail("juan@hotmail.com");
        
        ContactoEntidad contacto2 = new ContactoEntidad();
        contacto2.setNombre("Angela");
        contacto2.setTelefono("661123123");
        contacto2.setEmail("angela@hotmail.com");
        
        ContactoEntidad contacto3 = new ContactoEntidad();
        contacto3.setNombre("Jose Antonio");
        contacto3.setTelefono("+34654456555");
        contacto3.setEmail("jsantonio@hotmail.com");
        ArrayList<ContactoEntidad> lista = new ArrayList<ContactoEntidad>();
        lista.add(contacto);
        lista.add(contacto2);
        lista.add(contacto3);
        mapa.put("contacto",contacto);
        mapa.put("contacto2",contacto2);
        mapa.put("contacto3",contacto3);
        mapa.put("lista", lista);
        //mapa.put(contacto.getNombre(), contacto);
        //mapa.put(contacto.getTelefono(), contacto);
        //mapa.put(contacto.getEmail(), contacto);
        //return "redirect:./index";
    }
    
    @RequestMapping("/indexFormulario")
    public String indexFormulario(Map<String, Object> now){
        
        return "indexFormulario";
    }
    
    
}
