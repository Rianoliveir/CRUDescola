/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import Models.ProfessoresModels;
import conexao.Conexao;


import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rcosta
 */
public class ProfessoresDAO {
    public void CadastrarProfessores(ProfessoresModels pm) {

        String sql = "INSERT INTO professores (nome,idade,genero,disciplina) VALUES (?,?,?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = conexao.Conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, pm.getNome());
            ps.setInt(2, pm.getIdade());
            ps.setString(3, pm.getgenero());
            ps.setString(4, pm.getdisciplina());
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

     public List<ProfessoresModels> ShowProfessores() {

        String sql = "SELECT * FROM professores";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<ProfessoresModels> professores= new ArrayList<>();

        try {

            connection = conexao.Conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ProfessoresModels pm = new ProfessoresModels();

                pm.setid_professor(resultSet.getInt("id_professor"));
                pm.setIdade(resultSet.getInt("idade"));
                pm.setNome(resultSet.getString("nome"));
                pm.setgenero(resultSet.getString("genero"));
                pm.setdisciplina(resultSet.getString("disciplina"));

                professores.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return professores;
    }

    public void DeletarProfessores(int id) {

        String sql = "DELETE FROM professores WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = conexao.Conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Professor deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em deletar professor: " + e);

        }

    }

}

    

