package com.itosoftware.controller;

import com.ito.prueba.entidad.Usuarios;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "usuariosController")
@ViewScoped
public class UsuariosController extends AbstractController<Usuarios> {

    public UsuariosController() {
        super(Usuarios.class);
    }

}
