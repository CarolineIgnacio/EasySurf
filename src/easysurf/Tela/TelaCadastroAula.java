/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Tela;

import easysurf.Controlador.ControladorAula;
import easysurf.Controlador.ControladorPrincipal;
import easysurf.Entidade.Aluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caroline
 */
public class TelaCadastroAula extends javax.swing.JFrame {

    private static TelaCadastroAula instance;
    private Aluno aluno;
    private boolean ehPacote = false;
    private boolean estaPago = false;

    /**
     * Creates new form TelaCadastroAula
     */
    public TelaCadastroAula() {
        initComponents();
        acoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLnome = new javax.swing.JLabel();
        cbEhPacote = new javax.swing.JCheckBox();
        cbPagou = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLnivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLnome.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLnome.setText("Nome do Aluno");

        cbEhPacote.setText("Pacote");
        cbEhPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEhPacoteActionPerformed(evt);
            }
        });

        cbPagou.setText("Pagou");
        cbPagou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPagouActionPerformed(evt);
            }
        });

        jLabel2.setText("Nível:");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraNovaAula(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaParaTelaAnterior(evt);
            }
        });

        jLnivel.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPagou)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbEhPacote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLnivel)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLnome)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLnome)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEhPacote)
                    .addComponent(jLabel2)
                    .addComponent(jLnivel))
                .addGap(18, 18, 18)
                .addComponent(cbPagou)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEhPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEhPacoteActionPerformed
        ehPacote = !ehPacote;
    }//GEN-LAST:event_cbEhPacoteActionPerformed

    private void cadastraNovaAula(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraNovaAula
        ControladorAula.getInstance().adicionaNovasAulas(ehPacote, estaPago, aluno.getCPF());
        limpaTela();
    }//GEN-LAST:event_cadastraNovaAula

    private void cbPagouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPagouActionPerformed
        estaPago = !estaPago;
    }//GEN-LAST:event_cbPagouActionPerformed

    private void voltaParaTelaAnterior(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaParaTelaAnterior
       limpaTela();
    }//GEN-LAST:event_voltaParaTelaAnterior

    /**
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
            java.util.logging.Logger.getLogger(TelaCadastroAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAula().setVisible(true);
            }
        });
    }


    public void acoes() {
//        jButton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (jCheckBox1.isSelected()) {
//                    ehPacote = true;
//                } else {
//                    ehPacote = false;
//               }
//                
//                if(jCheckBox2.isSelected()) {
//                    estaPago = true;
//                }else {
//                    estaPago = false;
//                }
//                
//                ControladorAula.getInstance().adicionaNovasAulas(ehPacote, estaPago, aluno.getCPF());
//                ControladorPrincipal.getInstance().escondeTelaCadastroAula();
//            }
//        });
    }
    
    

    public static TelaCadastroAula getInstance() {
        if (instance == null) {
            return instance = new TelaCadastroAula();
        }
        return instance;
    }
    
     public void iniciaTela(Aluno aluno) {
        this.aluno = aluno;
        jLnome.setText(aluno.getNome());
        jLnivel.setText(String.valueOf(aluno.getNivel()));
        this.setVisible(true);
        }
     
     public void limpaTela(){
        ehPacote = false;
        estaPago = false;
        this.aluno = null;
        jLnome.setText("");
        jLnivel.setText("");
        cbEhPacote.setSelected(false);
        cbPagou.setSelected(false);
        this.setVisible(false);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbEhPacote;
    private javax.swing.JCheckBox cbPagou;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLnivel;
    private javax.swing.JLabel jLnome;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
