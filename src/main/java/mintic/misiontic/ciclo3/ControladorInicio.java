/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mintic.misiontic.ciclo3.modelo.Usuario;

/**
 *
 * @author USUARIO
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.mensaje}")
    String dato;

    @GetMapping("/")
    public String inicio(Model modelo) {
        String mensaje = "Saludos desde Spring MVC";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        Usuario u1 = new Usuario();
        u1.setCedula("1234");
        u1.setClave("Abcd");
        u1.setNombre("JAMIR YESSID AVILEZ C");
        u1.setEmail("javilez@unicolombo.edu.com");
        modelo.addAttribute("alguien", u1);
        Usuario u2 = new Usuario();
        u2.setCedula("6253553");
        u2.setClave("jajjsg");
        u2.setNombre("CACHON JOSE MARULANDA GOMEZ");
        u2.setEmail("infiel6252@hotmail.com.edu.com");
        Usuario u3 = new Usuario();
        u3.setCedula("987653");
        u3.setClave("hsgyss");
        u3.setNombre("MARCUS RASHFORD DE INGLATERRA");
        u3.setEmail("marcus@manunited.edu.com");
        List<Usuario> listaUsuarios = Arrays.asList(u2, u3);
        modelo.addAttribute("usuarios", listaUsuarios);
        log.info("Ejecutando el controlador Inicio");
        return "index";
    }

}
