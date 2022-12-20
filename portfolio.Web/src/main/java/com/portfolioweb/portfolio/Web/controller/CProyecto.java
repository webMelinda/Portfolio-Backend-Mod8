
package com.portfolioweb.portfolio.Web.controller;

import com.portfolioweb.portfolio.Web.entity.Proyecto;
import com.portfolioweb.portfolio.Web.service.SProyecto;
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
@RequestMapping("proyecto") 
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    @Autowired
    SProyecto proyectServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return proyectServ.verProyectos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyectServ.buscarProyecto(id);
    }
    
    @PostMapping ("/crear")
    public String agregarProyecto (@RequestBody Proyecto pro) {
        proyectServ.crearProyecto(pro);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        proyectServ.borrarProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateProyecto(@RequestBody Proyecto pro){
        proyectServ.editarProyecto(pro);
    }
}
