/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfoliognz.ailin.gnz.Security.Service;

import com.porfoliognz.ailin.gnz.Security.Entity.Usuario;
import com.porfoliognz.ailin.gnz.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario (String nombreUsuario){
        return iusuarioRepository.finByNombreUsuario(nombreUsuario);
    }
        
    
