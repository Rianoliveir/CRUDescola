package DAOs;

import Models.AlunosModels;

import conexao.Conexao;
import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunosDAO {

    public void CadastrarAlunos(AlunosModels pm) {

        String sql = "INSERT INTO alunos (nome,idade,genero,) VALUES (?,?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = conexao.Conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, pm.getNome());
            ps.setInt(2, pm.getIdade());
            ps.setString(3, pm.getgenero());
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

    public List<AlunosModels> ShowAlunos() {

        String sql = "SELECT * FROM alunos";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<AlunosModels> alunos= new ArrayList<>();

        try {

             connection = conexao.Conexao.ConexaoSQL();
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                AlunosModels pm = new AlunosModels();

                pm.setid_aluno(resultSet.getInt("id_aluno"));
                pm.setIdade(resultSet.getInt("idade"));
                pm.setNome(resultSet.getString("nome"));
                pm.setgenero(resultSet.getString("genero"));

               alunos.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return alunos;
    }

    public void DeletarAlunos(int id) {

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
