package Models;

import java.sql.Date;

public class AlunosModels {

    private int id_aluno;
    private String nome;
    private int idade;
    private String genero ;

    public AlunosModels() {
    }

    public AlunosModels(int id_aluno, String nome, int idade, String genero) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public int getid_aluno() {
        return id_aluno;
    }

    public void setid_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

   

}
