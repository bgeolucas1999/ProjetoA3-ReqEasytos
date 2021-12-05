/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import Persistencia.Conexao;
import DTO.UsuarioMasterDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author georg
 */
public class UsuarioBD {
    
    public UsuarioMasterDTO userautentication(UsuarioMasterDTO usuario) {

                
		String sqlSelect = "SELECT login,senha,master,nome FROM usuarios WHERE login=? and senha = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = Conexao.conectabd();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, usuario.getLogin());
                        stm.setString(2, usuario.getSenha());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					usuario.setLogin(rs.getString("login"));
					usuario.setSenha(rs.getString("senha"));
                                        usuario.setMaster(rs.getInt("master"));
                                        usuario.setNome(rs.getString("nome"));
                                }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
                System.out.print(usuario.getLogin()+" "+usuario.getSenha()+" "+usuario.getMaster());
		return usuario;
	}

    
    /*Connection conn;
    public ResultSet userautentication(UsuarioMasterDTO usuario){
        conn = new Conexao().conectabd();
        try{ 
            
            String sql = "select * from usuariomaster where login=?&senha=?";
            
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, usuario.getLogin());
            stm.setString(2, usuario.getSenha());
            
            ResultSet rs = stm.executeQuery();
            return rs;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Deu erro" + error);
            return null;
        }
    }*/
    
}
