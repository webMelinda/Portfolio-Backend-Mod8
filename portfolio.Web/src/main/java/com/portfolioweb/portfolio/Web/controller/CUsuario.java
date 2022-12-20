
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Usuario;
import com.portfolioweb.portfolio.Web.service.SUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class CUsuario {
   @Autowired
    SUsuario usuaServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Usuario> verUsuarios(){
        return usuaServ.verUsuarios();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Usuario verUsuario(@PathVariable int id){
        return usuaServ.buscarUsuario(id);
    }
    
    @PostMapping ("/crear")
    public String agregarUsuario (@RequestBody Usuario usu) {
        usuaServ.crearUsuario(usu);
        return "La usuana fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarUsuario(@PathVariable int id){
        usuaServ.borrarUsuario(id);
        return "La usuana fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public void updateUsuario(@RequestBody Usuario usu){
        usuaServ.editarUsuario(usu);
    } 
}
