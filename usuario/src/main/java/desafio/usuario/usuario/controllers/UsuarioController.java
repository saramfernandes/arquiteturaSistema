package main.java.desafio.usuario.usuario.controllers;

import main.java.desafio.usuario.usuario.repository.UsuarioRepositorio;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepositorio repository;

    @GetMapping("/usuario/cadastrousuario")
    public String cadastro() {
        return "cadastro";
    }

    @PostMapping("/usuario/cadastrousuario")
    public String cadastroUsuario(Usuario usuario) {
        repository.save(usuario);
        return "cadastro";
    }

    @GetMapping("/usuario/lista")
    public ModelAndView listaUsuario() {
        ModelAndView mv = new ModelAndView("lista");
        List<Usuario> usuario = new ArrayList<>();
        usuario = repository.findAll();
        mv.addObject("alunos", alunos);
        return mv;
    }
}
