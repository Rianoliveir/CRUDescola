/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.sql.Date;
/**
 *
 * @author rcosta
 */
public class ProfessoresModels {
    private int id_professor;
    private String nome;
    private int idade;
    private String genero ;
    private String disciplina;


    public ProfessoresModels(int id_professor, String nome, int idade, String genero, String disciplina) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.disciplina = disciplina;
    }

    public ProfessoresModels() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getid_professor() {
        return id_professor;
    }

    public void setid_professor(int id_professor) {
        this.id_professor = id_professor;
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
     public String getdisciplina() {
        return disciplina;
    }

    public void setdisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

    

