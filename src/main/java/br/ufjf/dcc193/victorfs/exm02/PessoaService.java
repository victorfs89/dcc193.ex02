package br.ufjf.dcc193.victorfs.exm02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository rep;
    List<Pessoa> listaPessoas(){
        return rep.findAll();
    }

    void removePessoa(Long id){
        rep.deleteById(id);
    }

    void adiconaPessoa(Pessoa p){
        rep.save(p);
    }

    Pessoa retornarPessoa(Long id){
        Pessoa p = rep.getById(id);

        return p;
    }

    void atualizaPessoa(Pessoa p){
        rep.save(p);
    }
}
