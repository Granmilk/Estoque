package com.GTBR.Estoque.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstoqueController {


    @RequestMapping("/estoque")
    public String visualizaEstoque(){

        return "paginaEstoque.html";
    }


}
