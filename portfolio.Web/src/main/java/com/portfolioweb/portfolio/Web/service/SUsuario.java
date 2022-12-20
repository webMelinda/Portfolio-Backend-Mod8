
package com.portfolioweb.portfolio.Web.service;

import com.portfolioweb.portfolio.Web.entity.Usuario;
import com.portfolioweb.portfolio.Web.repository.RUsuario;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SUsuario {
    @Autowired
    public RUsuario usuaRepo;
    
    
    public List<Usuario> verUsuarios() {
        List<Usuario> listaUsuarios= usuaRepo.findAll();
        return listaUsuarios;
    }
    
    public Usuario buscarUsuario(int id){
        Usuario usua = usuaRepo.findById(id).orElse(null);
        return usua;
    }
    
    
    public void crearUsuario(Usuario usua) {
        usuaRepo.save(usua);
    }
    
   
    public void borrarUsuario(int id) {
        usuaRepo.deleteById(id);
    }
    
     public void editarUsuario(Usuario usua) {
        usuaRepo.save(usua);
     }
}
