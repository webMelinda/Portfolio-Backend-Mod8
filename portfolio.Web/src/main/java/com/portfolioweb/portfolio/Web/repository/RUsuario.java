
package com.portfolioweb.portfolio.Web.repository;

import com.portfolioweb.portfolio.Web.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario extends JpaRepository <Usuario, Integer> {
    
}
