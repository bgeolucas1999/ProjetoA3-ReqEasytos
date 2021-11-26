/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import Interface.jfRequisitos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author georg
 */
public class FuncRequisitos {
    
    private int ididentificador;
    private String nome;
    private String usuarioprop;
    private String modulo;
    private String funcionalidade;
    private Date datacriacao;
    private String autor;
    private Date dataultimaalteracao;
    private String autorultimaalteracao;
    private String versao;
    private String prioridade;
    private String complexidade;
    private String esforcohoras;
    private String estado;
    private String fase;
    private String descricao;
    private String nomeprojeto;
            

    
        
    
        public void inserir() throws SQLException{
        String sqlInsert = "insert into requisitos(nome,usuarioprop,modulo,funcionalidade,datacriacao,autor,dataultimaalter,autorultimaalter,versao,prioridade,complexidade,esforcohoras,estado,fase,descricao,nomeprojeto) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Conexao conexao = new Conexao();
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlInsert);

            stm.setString(1, getNome());
            stm.setString(2, getUsuarioprop());
            stm.setString(3, getModulo());
            stm.setString(4, getFuncionalidade());
            stm.setDate(5, getDatacriacao());
            stm.setString(6, getAutor());
            stm.setDate(7, getDataultimaalteracao());
            stm.setString(8, getAutorultimaalteracao());
            stm.setString(9, getVersao());
            stm.setString(10, getPrioridade());
            stm.setString(11, getComplexidade());
            stm.setString(12, getEsforcohoras());
            stm.setString(13, getEstado());
            stm.setString(14, getFase());
            stm.setString(15, getDescricao());
            stm.setString(16, getNomeprojeto());

            stm.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
        public void consultarVisual() throws SQLException{
        
        
        String sqlSelect = "select * from requisitos where nomeprojeto=?";
        Conexao conexao = new Conexao();
        
        
        try(Connection conn = conexao.conectabd()){
            PreparedStatement stm = conn.prepareStatement(sqlSelect);
            stm.setString(1, getNomeprojeto());
            ResultSet rs = stm.executeQuery();
            
//            DefaultTableModel modelo = (DefaultTableModel) jtProjetos.getModel();
//            modelo.setNumRows(0);
//            while(rs.next())
{
//                modelo.addRow(new Object[]{rs.getInt("id"),rs.getString("nome"),rs.getString("email"),rs.getString("fone") });
//                int matricula = rs.getInt("matricula");
//                String nome = rs.getString("nome");
//                String fone = rs.getString("fone");
//                String email = rs.getString("email");
//                msg = msg + String.format("Matricula: %d , Nome: %s , Fone: %s , Email: %s.",matricula,nome,fone,email)+ "\n";
                
}
            rs.close();
            conn.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }     
        

    /**
     * @return the ididentificador
     */
    public int getIdidentificador() {
        return ididentificador;
    }

    /**
     * @param ididentificador the ididentificador to set
     */
    public void setIdidentificador(int ididentificador) {
        this.ididentificador = ididentificador;
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
     * @return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the funcionalidade
     */
    public String getFuncionalidade() {
        return funcionalidade;
    }

    /**
     * @param funcionalidade the funcionalidade to set
     */
    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    /**
     * @return the datacriacao
     */


    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the dataultimaalteracao
     */


    /**
     * @return the autorultimaalteracao
     */
    public String getAutorultimaalteracao() {
        return autorultimaalteracao;
    }

    /**
     * @param autorultimaalteracao the autorultimaalteracao to set
     */
    public void setAutorultimaalteracao(String autorultimaalteracao) {
        this.autorultimaalteracao = autorultimaalteracao;
    }

    /**
     * @return the versao
     */
    public String getVersao() {
        return versao;
    }

    /**
     * @param versao the versao to set
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * @return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the complexidade
     */
    public String getComplexidade() {
        return complexidade;
    }

    /**
     * @param complexidade the complexidade to set
     */
    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    /**
     * @return the esforcohoras
     */
    public String getEsforcohoras() {
        return esforcohoras;
    }

    /**
     * @param esforcohoras the esforcohoras to set
     */
    public void setEsforcohoras(String esforcohoras) {
        this.esforcohoras = esforcohoras;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the fase
     */
    public String getFase() {
        return fase;
    }

    /**
     * @param fase the fase to set
     */
    public void setFase(String fase) {
        this.fase = fase;
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
     * @return the nomeprojeto
     */
    public String getNomeprojeto() {
        return nomeprojeto;
    }

    /**
     * @param nomeprojeto the nomeprojeto to set
     */
    public void setNomeprojeto(String nomeprojeto) {
        this.nomeprojeto = nomeprojeto;
    }

    /**
     * @return the datacriacao
     */
    public Date getDatacriacao() {
        return datacriacao;
    }

    /**
     * @param datacriacao the datacriacao to set
     */
    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }

    /**
     * @return the dataultimaalteracao
     */
    public Date getDataultimaalteracao() {
        return dataultimaalteracao;
    }

    /**
     * @param dataultimaalteracao the dataultimaalteracao to set
     */
    public void setDataultimaalteracao(Date dataultimaalteracao) {
        this.dataultimaalteracao = dataultimaalteracao;
    }
    
}
