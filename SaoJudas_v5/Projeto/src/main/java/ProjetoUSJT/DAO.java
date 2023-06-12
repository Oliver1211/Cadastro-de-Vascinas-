package ProjetoUSJT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {

    public boolean existeUsuario(Usuario usuario)
            throws Exception {
        String sql = "select * from tb_usuario where nome = ? and senha = ?";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();

            }
        }
    }

    public boolean pesquisaUsuario(CadastroUsuario cadastroUsuario)
            throws Exception {
        String sql = "select * from cadastro_vacina where CPF_Paciente = ?";
        try (Connection conn = ConnectionFactory.procuraPaciente(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cadastroUsuario.getCPF());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

}
