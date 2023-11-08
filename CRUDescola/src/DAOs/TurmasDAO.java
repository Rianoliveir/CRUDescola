package DAOs;

import Models.TurmasModels;
import conexao.Conexao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TurmasDAO {

    public void CadastrarTurmas(TurmasModels pm) {

        String sql = "INSERT INTO turmas (numero,serie,responsavel,) VALUES (?,?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = conexao.Conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setInt(1, pm.getnumero());
            ps.setString(2, pm.getserie());
            ps.setString(3, pm.getresponsavel());
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "Turma cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

    public List<TurmasModels> ShowTurmas() {

        String sql = "SELECT * FROM turmas";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<TurmasModels> turmas= new ArrayList<>();

        try {

            connection = conexao.Conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                TurmasModels pm = new TurmasModels();

                pm.setid_turma(resultSet.getInt("id_turma"));
                pm.setnumero(resultSet.getInt("numero"));
                pm.setserie(resultSet.getString("serie"));
                pm.setresponsavel(resultSet.getString("responsavel"));

               turmas.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return turmas;
    }

    public void DeletarTurmas(int id) {

        String sql = "DELETE FROM alunos WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

           connection = conexao.Conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em deletar Aluno: " + e);

        }

    }

}
