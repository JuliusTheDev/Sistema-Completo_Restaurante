package exercicioDois;

public class Cliente extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Cliente(String cnpj, String razaoSocial) {
        super();
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
}
