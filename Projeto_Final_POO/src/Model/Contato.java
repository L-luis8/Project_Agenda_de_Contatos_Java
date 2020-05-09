package Model;

public class Contato {
    private String nome;
    private String endereco;
    private String dataDeNascimento;
    private String telefoneFixo;
    private String celular;
    private String turma;

    public Contato(String nome, String endereco, String dataDeNascimento, String telefoneFixo, String celular, String turma) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
        this.turma = turma;
    }

    public Contato(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}