package com.senai.desafiousuario.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.senai.desafiousuario.model.Usuario;
import com.senai.desafiousuario.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class UsuarioController {
    @Autowired
    UsuarioRepository repository;

    @GetMapping("/usuario/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @PostMapping("/usuario/cadastro")
    public String cadastroUsuario(Usuario usuario) {
        repository.save(usuario);
        return "redirect:/usuario/lista";
    }

    @GetMapping("/usuario/lista")
    public ModelAndView listaUsuario() {
        ModelAndView mv = new ModelAndView("lista");
        List<Usuario> usuario = new ArrayList<>();
        usuario = repository.findAll();
        mv.addObject("usuarios", usuario);
        return mv;
    }

    @GetMapping("/usuario/login")
    public String login() {
        return "login";
    }

    @PostMapping("/usuario/login")
    public ModelAndView realizaLogin(@RequestParam String email, @RequestParam String senha) {
        ModelAndView mv = new ModelAndView("login");
        Usuario usuarioPuxado = repository.findByEmail(email);
        if (usuarioPuxado != null && senha.equals(usuarioPuxado.getSenha())){
            return new ModelAndView("redirect:/usuario/lista");
        }else{
            mv.addObject("error", "Coloca certo aí, isso ta errado.");
            return mv;
        }
    }
    
    

}
