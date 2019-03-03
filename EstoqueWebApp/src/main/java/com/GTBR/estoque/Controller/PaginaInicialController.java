package com.GTBR.Estoque.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginaInicialController {

    @RequestMapping("/pagina-inicial")
    public String visualizaPaginaInicial(){


        return "/paginaInicial.html";
    }

}
