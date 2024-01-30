package exercicioDois;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Administrador admin = new Administrador();

        Usuario usuario1 = new Usuario("kaka00", "12345678");
        Usuario usuario2 = new Usuario("pepe11", "123Juju$#");

        usuario1.setNome("Kalena");
        usuario1.setTelefone("(67)92341-1234");
        admin.inserirUsuario(usuario1);

        usuario2.setNome("Pelucia");
        usuario2.setTelefone("(67)82837-1284");
        admin.inserirUsuario(usuario2);

        Usuario usuario3 = new Usuario("alalalalal", "123alalala123");
        usuario3.setNome("Lala");
        usuario3.setTelefone("(67)0987-3456");
        admin.inserirUsuario(usuario3);

        System.out.println("Usuários no sistema atuais:\n");
        ArrayList<Usuario> usuarios = admin.getListaUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Nome de Acesso: " + usuario.getNomeAcesso());
            System.out.println();
        }


        admin.excluirUsuario(usuario3);


        System.out.println("\nUsuários no sistema após exclusão:\n");
        usuarios = admin.getListaUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Nome de Acesso: " + usuario.getNomeAcesso());
            System.out.println();
        }
    }
}