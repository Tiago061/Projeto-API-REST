package dio.web_api.repository;

import dio.web_api.handler.BusinessException;
import dio.web_api.handler.CampoObrigatorioException;
import dio.web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin() == null)
            throw new CampoObrigatorioException("login");

        if(usuario.getPassword() == null)
            throw new CampoObrigatorioException("password");

        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camda de Repositório.");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("tiago", "1234"));
        usuarios.add(new Usuario("joao", "12367"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("joao", "12367");
    }

    public Usuario findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o Username: %s para localizar um usuario.", username));
        return new Usuario("joao", "12367");
    }
}
