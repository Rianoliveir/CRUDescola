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
public class TurmasModels {
     private int id_turma;
    private String serie;
    private int numero;
    private String responsavel ;
    

    public TurmasModels(int id_turma, String serie, int numero, String responsavel) {
        this.id_turma = id_turma;
        this.serie = serie;
        this.numero = numero;
        this.responsavel = responsavel;
    }

    public TurmasModels() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getid_turma() {
        return id_turma;
    }

    public void setid_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getserie() {
        return serie;
    }

    public void setserie(String serie) {
        this.serie = serie;
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public String getresponsavel() {
        return responsavel;
    }

    public void setresponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

   

}

