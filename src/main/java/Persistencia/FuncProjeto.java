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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author georg
 */
public class FuncProjeto {
    private int id;
    private String nome;
    private String descricao;
    private String usuarioprop;
    private String ididentificador;
    private int master;
    
        public void inserir() throws SQLException{
        String sqlInsert = "insert into projetos(nome,descricao,usuarioprop) values(?,?,?)";
        Conexao conexao = new Conexao();
        System.out.println("To parado aqui 3");
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlInsert);
            
            stm.setString(1, getNome());
            stm.setString(2, getDescricao());
            stm.setString(3, getUsuarioprop());   
            stm.execute();
            conn.close();
            System.out.println("To parado aqui 2");
        }catch(SQLException e){
            e.printStackTrace();
        }
    
}
//        public void consultarTodosProjetos() throws SQLException{
//        
//        
//        String sqlSelect = "select * from projetos";
//        Conexao conexao = new Conexao();
//        
//        
//        try(Connection conn = conexao.conectabd()){
//            PreparedStatement stm = conn.prepareStatement(sqlSelect);
//            //stm.setString(1, getNomeprojeto());
//            ResultSet rs = stm.executeQuery();
//            jfConsultaProjeto tabela = new jfConsultaProjeto(master);
//            DefaultTableModel modelo = (DefaultTableModel) tabela.jtProjetos1.getModel();
//            modelo.setNumRows(0);
//            while(rs.next()){
//                modelo.addRow(new Object[]{rs.getInt("id"),rs.getString("nome"),rs.getString("descricao"),rs.getString("usuarioprop") });
////                int matricula = rs.getInt("matricula");
////                String nome = rs.getString("nome");
////                String fone = rs.getString("fone");
////                String email = rs.getString("email");
////                msg = msg + String.format("Matricula: %d , Nome: %s , Fone: %s , Email: %s.",matricula,nome,fone,email)+ "\n";
//                
//            }
//            rs.close();
//            conn.close();
//
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }

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

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the usuarioprop
     */
    public String getUsuarioprop() {
        return usuarioprop;
    }

    /**
     * @param usuarioprop the usuarioprop to set
     */
    public void setUsuarioprop(String usuarioprop) {
        this.usuarioprop = usuarioprop;
    }

    /**
     * @return the ididentificador
     */
    public String getIdidentificador() {
        return ididentificador;
    }

    /**
     * @param ididentificador the ididentificador to set
     */
    public void setIdidentificador(String ididentificador) {
        this.ididentificador = ididentificador;
    }

    /**
     * @return the master
     */
    public int getMaster() {
        return master;
    }

    /**
     * @param master the master to set
     */
    public void setMaster(int master) {
        this.master = master;
    }
}