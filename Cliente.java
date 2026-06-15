package ESTUDOSJAVA.Projects;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Cliente(String nome,String cpf,String telefone,String email){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean validarCpf(){
        if(getCpf().length() == 11){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Nome: "+ nome+ ","+
                "CPF: "+ cpf + ","+
                "Telefone: "+ telefone +","+
                "Email: "+ email;
    }
}
