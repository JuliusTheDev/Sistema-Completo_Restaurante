package exercicioDois;

public class Usuario extends Pessoa{

   private String nomeAcesso;
   private String senha;

   public Usuario(){

   }
    public String getNomeAcesso() {
        return nomeAcesso;
    }

    public void setNomeAcesso(String nomeAcesso) {
        this.nomeAcesso = nomeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nomeAcesso, String senha) {
        this.nomeAcesso = nomeAcesso;
        this.senha = senha;
    }
}
