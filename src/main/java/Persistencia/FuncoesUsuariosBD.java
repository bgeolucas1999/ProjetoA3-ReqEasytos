/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import Interface.jfConsulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author georg
 */
public class FuncoesUsuariosBD {
    
    private int id;
    private String login;
    private String nome;
    private String email;
    private String fone;
    private String senha;
    private int master;
    
        
    
        public void inserir() throws SQLException{
        String sqlInsert = "insert into usuarios(nome,email,fone,login,senha) values(?,?,?,?,?)";
        Conexao conexao = new Conexao();
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlInsert);

            stm.setString(1, getNome());
            stm.setString(2, getEmail());
            stm.setString(3, getFone());
            stm.setString(4, getLogin());
            stm.setString(5, getSenha());
            stm.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

        public void atualizar(){
            String sqlUpdate = "update usuarios set nome = ?, fone = ?, email = ? where id = ?";
            Conexao conexao = new Conexao();
            try(Connection conn = conexao.conectabd()){
                PreparedStatement stm = conn.prepareStatement(sqlUpdate);
                stm.setString(1, getNome());
                stm.setString(2, getFone());
                stm.setString(3, getEmail());
                stm.setInt(4, getId());
                stm.execute();
            }catch(SQLException e){
                e.printStackTrace();

            }
        }
    
    public void deletar(){
        String sqlDelete = "delete from tb_professor where matricula = ?";
        Conexao conexao = new Conexao();
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlDelete);
            stm.setInt(1, getId());
            stm.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void consultarTodos(){
        String sqlSelect = "select * from usuarios";
        Conexao conexao = new Conexao();
        String msg = "";
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlSelect);
            ResultSet rs = stm.executeQuery();
            
//            DefaultTableModel modelo = (DefaultTableModel) jtDados.getModel();
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                msg = msg + String.format("Id: %d , Nome: %s , Fone: %s , Email: %s.",id,nome,fone,email)+ "\n";
                
            }
        JOptionPane.showMessageDialog(null, msg);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void consultar(){
        String sqlSelect = "select * from tb_professor where matricula = ?";
        Conexao conexao = new Conexao();
        String msg = "";
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlSelect);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                int matricula = rs.getInt("matricula");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                msg = msg + String.format("Matricula: %d , Nome: %s , Fone: %s , Email: %s.",matricula,nome,fone,email)+ "\n";
                
            }
        JOptionPane.showMessageDialog(null, msg);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getFone() {
        return fone;
    }


    public void setFone(String fone) {
        this.fone = fone;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getMaster() {
        return master;
    }


    public void setMaster(int master) {
        this.master = master;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
