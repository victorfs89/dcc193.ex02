package br.ufjf.dcc193.victorfs.exm02;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Exm02Controller {
    @Autowired
    private PessoaService ps;
    
    @RequestMapping ({"", "index.html"})
    public String home(){
        return "basic/home";
    }

    @RequestMapping ({"formulario.html"})
    public String formulario(){
        return "form/formulario";
    }

    @RequestMapping ({"resultado.html"})
    public ModelAndView resultado(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form/resultado");
        ps.adiconaPessoa(p);
        mv.addObject("pessoa", p);
        return mv;
    }

    @RequestMapping ({"pessoas.html"})
    public ModelAndView listaPessoas(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pessoas");
        List<Pessoa> lp = ps.listaPessoas();

        mv.addObject("pessoas", lp);
        return mv;
    }

    @RequestMapping ("remover.html")
    public ModelAndView removePessoa(Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:pessoas.html");
        try {
            ps.removePessoa(id); 
        } catch (Exception e) {
            
        }       
        return mv;
    }

    @RequestMapping ("editar.html")
    public ModelAndView editarPessoa(Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editar");

        Pessoa p = ps.retornarPessoa(id);

        mv.addObject("pessoa", p);
        return mv;
    }

    @RequestMapping ({"resultado2.html"})
    public ModelAndView resultado2(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form/resultado2");
        ps.atualizaPessoa(p);
        mv.addObject("pessoa", p);
        return mv;
    }
}
