package br.com.meuprojeto.projeto.DAO;

import br.com.meuprojeto.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceUsuario extends CrudRepository<Usuario, Integer> {
}
