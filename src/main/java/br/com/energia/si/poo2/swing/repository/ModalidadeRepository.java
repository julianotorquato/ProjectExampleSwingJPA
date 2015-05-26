package br.com.energia.si.poo2.swing.repository;

import br.com.energia.si.poo2.swing.interfaces.IModalidadeRepository;
import br.com.energia.si.poo2.swing.model.Modalidade;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Juliano Torquato
 */
public class ModalidadeRepository  extends GenericRepository<Modalidade, Integer> implements Serializable{

    public ModalidadeRepository() {
        super();
    }
    
    @Override
    public void salvar(Modalidade entity) {
        super.salvar(entity);    
    }
    
    @Override
    public void atualizar(Modalidade entity) {
        super.atualizar(entity);
    }

    @Override
    public void remover(Modalidade entity) {
        super.remover(entity);
    }
    
    @Override
    public Modalidade getById(Class<Modalidade> classe, Integer id) {
        return (Modalidade) super.getById(classe, id);
    }
   
     public List<Modalidade> getAll(Class<Modalidade> classe){
         return super.getAll(classe);
     }
}
