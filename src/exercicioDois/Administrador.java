package exercicioDois;

import exercicioDois.Cliente;
import exercicioDois.Usuario;

import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Usuario> listaUsuarios;

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {

        this.listaUsuarios = listaUsuarios;
    }

    public Administrador() {
        listaUsuarios = new ArrayList<>();
    }

    public void inserirUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuário inserido no sistema.\n");
    }

    public void excluirUsuario(Usuario usuario) {
        if (listaUsuarios.contains(usuario)) {
            listaUsuarios.remove(usuario);
            System.out.println("Usuário " + usuario.getNome() + " excluído do sistema.");
        } else {
            System.out.println("Usuário não encontrado");
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

}