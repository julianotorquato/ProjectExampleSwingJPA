
package br.com.energia.si.poo2.swing.service;

import br.com.energia.si.poo2.swing.model.Curso;
import br.com.energia.si.poo2.swing.repository.CursoRepository;
import java.util.List;

/**
 *
 * @author Juliano Torquato
 */
public class CursoService {

    private CursoRepository repository;

    public CursoService() {
        repository = new CursoRepository();
    }
    
    public void salvar(Curso c){
        repository.salvar(c);
    }
    
    public void atualizar(Curso c){
        repository.atualizar(c);
    }
    
    public void remover(Curso c){
        repository.remover(c);
    }
    public Curso getById(int id){
        return repository.getById(Curso.class, id);
    }
    public List<Curso> getAll(){
        return repository.getAll(Curso.class);
    }

    public List<Curso> pesquisarPorDescricao(String descricao) {
        return repository.pesquisarPorDescricao(descricao);
    }
}
