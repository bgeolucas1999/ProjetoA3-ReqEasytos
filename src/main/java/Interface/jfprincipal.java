/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author georg
 */
public class jfprincipal extends javax.swing.JFrame {

    static int master;
    
    /**
     * Creates new form jfprincipal
     */
    public jfprincipal(int master) {
        this.master = master;
        initComponents();

        
    }
    public void desabilitarBotao(int master){
        System.out.println("master "+master);
        if(master==1){
            jmCadastroProjeto.setEnabled(true);
            jmCadastroRequisitos.setEnabled(true);
            jmCadastroUsuario.setEnabled(true); 

            
        }else{
            jmCadastroProjeto.setEnabled(false);
            jmCadastroRequisitos.setEnabled(false);
            jmCadastroUsuario.setEnabled(false);           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmLogin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmConsultaProjetos = new javax.swing.JMenuItem();
        jmConsultaRequisitos = new javax.swing.JMenuItem();
        jmConsultaUsuario = new javax.swing.JMenuItem();
        jmCadastro = new javax.swing.JMenu();
        jmCadastroProjeto = new javax.swing.JMenuItem();
        jmCadastroRequisitos = new javax.swing.JMenuItem();
        jmCadastroUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReqEasytos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1231, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        jMenu1.setText("Login");

        jmLogin.setText("Login");
        jmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLoginActionPerformed(evt);
            }
        });
        jMenu1.add(jmLogin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listagem");

        jmConsultaProjetos.setText("Projetos");
        jmConsultaProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaProjetosActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultaProjetos);

        jmConsultaRequisitos.setText("Requisitos");
        jmConsultaRequisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaRequisitosActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultaRequisitos);

        jmConsultaUsuario.setText("Usuarios");
        jmConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultaUsuario);

        jMenuBar1.add(jMenu2);

        jmCadastro.setText("CRUD");
        jmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroActionPerformed(evt);
            }
        });

        jmCadastroProjeto.setText("Projetos");
        jmCadastroProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroProjetoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCadastroProjeto);

        jmCadastroRequisitos.setText("Requisitos");
        jmCadastroRequisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroRequisitosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCadastroRequisitos);

        jmCadastroUsuario.setText("Usuarios");
        jmCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroUsuarioActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCadastroUsuario);

        jMenuBar1.add(jmCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        //jfprincipal.cadastro=false;
        //jfprincipal.login=false;


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroActionPerformed

    private void jmCadastroProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroProjetoActionPerformed
       
        jfCadastroProjeto obj = new jfCadastroProjeto(master);       
        obj.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroProjetoActionPerformed

    private void jmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLoginActionPerformed
        //if(login==false){
        jifLogin obj = new jifLogin();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        //}
        // TODO add your handling code here:
    }//GEN-LAST:event_jmLoginActionPerformed

    private void jmConsultaRequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaRequisitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmConsultaRequisitosActionPerformed

    private void jmCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroUsuarioActionPerformed
        jfCadastro obj = new jfCadastro(master);
        obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroUsuarioActionPerformed

    private void jmConsultaProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaProjetosActionPerformed
        jfConsultaProjeto obj = new jfConsultaProjeto(master);
        obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jmConsultaProjetosActionPerformed

    private void jmConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaUsuarioActionPerformed
        jfConsulta obj = new jfConsulta(master);
        obj.setVisible(true);
    }//GEN-LAST:event_jmConsultaUsuarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
            
        //desabilitarBotao(master);    
        
    }//GEN-LAST:event_formWindowActivated

    private void jmCadastroRequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroRequisitosActionPerformed
        jfRequisitos obj = new jfRequisitos();
        obj.setVisible(true);
    }//GEN-LAST:event_jmCadastroRequisitosActionPerformed

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfprincipal(master).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmCadastroProjeto;
    private javax.swing.JMenuItem jmCadastroRequisitos;
    private javax.swing.JMenuItem jmCadastroUsuario;
    private javax.swing.JMenuItem jmConsultaProjetos;
    private javax.swing.JMenuItem jmConsultaRequisitos;
    private javax.swing.JMenuItem jmConsultaUsuario;
    private javax.swing.JMenuItem jmLogin;
    // End of variables declaration//GEN-END:variables




}