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

    void editarPessoa(Long id, String nome, Integer idade){
        Pessoa p = rep.getById(id);
        p.setNome(nome);
        p.setIdade(idade);

        rep.save(p);
    }
}
