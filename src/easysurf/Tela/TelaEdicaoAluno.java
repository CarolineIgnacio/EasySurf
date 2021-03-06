/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Tela;

import easysurf.Controlador.ControladorAluno;
import easysurf.Controlador.ControladorPrincipal;
import easysurf.Entidade.Aluno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Caroline Ignácio
 */
public class TelaEdicaoAluno extends javax.swing.JFrame {

    public static TelaEdicaoAluno instance;
    private Aluno aluno;

    /**
     * Creates new form TelaEdicaoAluno
     */
    public TelaEdicaoAluno() {
        initComponents();
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
        nomeAluno = new javax.swing.JTextField();
        rgAluno = new javax.swing.JTextField();
        cpfAluno = new javax.swing.JFormattedTextField();
        telefoneAluno = new javax.swing.JFormattedTextField();
        dataNascimentoAluno = new javax.swing.JFormattedTextField();
        relacaoEmergencia = new javax.swing.JTextField();
        nomeEmergencia = new javax.swing.JTextField();
        telefoneEmergencia = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelNomeAluno = new javax.swing.JLabel();
        jBsalvar = new javax.swing.JButton();
        jBvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpfAluno.setEditable(false);
        try {
            cpfAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfAlunoActionPerformed(evt);
            }
        });

        try {
            telefoneAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            dataNascimentoAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefoneEmergencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Nome:*");
        jLabel1.setToolTipText("Nome do Aluno");

        jLabel2.setText("RG:");
        jLabel2.setToolTipText("RG do Aluno");

        jLabel3.setText("CPF:*");
        jLabel3.setToolTipText("CPF do Aluno ou responsável");

        jLabel4.setText("Telefone:*");
        jLabel4.setToolTipText("Telefone do aluno");

        jLabel5.setText("Data de Nascimento*");
        jLabel5.setToolTipText("Data de Nascimento do Aluno");

        jLabel9.setText("Relação Emergência:");

        jLabel6.setText("Contato Emergência*");
        jLabel6.setToolTipText("Nome do contato de emergência");

        jLabel7.setText("Telefone Emergência*");
        jLabel7.setToolTipText("Telefone do contato de Emergência");

        labelNomeAluno.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        labelNomeAluno.setText("Nome do aluno");

        jBsalvar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaEdicaoAluno(evt);
            }
        });

        jBvoltar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaParaTelaAnterior(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(labelNomeAluno)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(relacaoEmergencia)
                    .addComponent(nomeAluno)
                    .addComponent(rgAluno)
                    .addComponent(nomeEmergencia)
                    .addComponent(cpfAluno)
                    .addComponent(telefoneAluno)
                    .addComponent(dataNascimentoAluno)
                    .addComponent(telefoneEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBsalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jBvoltar)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelNomeAluno)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rgAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataNascimentoAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(relacaoEmergencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeEmergencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneEmergencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar)
                    .addComponent(jBvoltar))
                .addContainerGap())
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

    private void voltaParaTelaAnterior(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaParaTelaAnterior
        limpaTela();
    }//GEN-LAST:event_voltaParaTelaAnterior

    private void salvaEdicaoAluno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaEdicaoAluno
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        aluno.setNome(nomeAluno.getText());
        aluno.setRG(rgAluno.getText());
        aluno.setTelefone(telefoneAluno.getText());
        try {
            aluno.setDataNascimento(formatador.parse(dataNascimentoAluno.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
            Logger.getLogger(TelaCadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        aluno.setNomeEmergencia(nomeEmergencia.getText());
        aluno.setRelacaoEmergencia(relacaoEmergencia.getText());
        aluno.setTelefoneEmergencia(telefoneEmergencia.getText());
        
        ControladorAluno.getInstance().atualizaAluno(aluno);
        TelaPrincipal.getInstance().loadTables();
        this.setVisible(false);
    }//GEN-LAST:event_salvaEdicaoAluno

    private void cpfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEdicaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdicaoAluno().setVisible(true);
            }
        });
    }

    public static TelaEdicaoAluno getInstance() {
        if (instance == null) {
            return instance = new TelaEdicaoAluno();
        }
        return instance;
    }
    
    public void limpaTela(){
        ControladorPrincipal.getInstance().escondeTelaEdicaoAluno();
        rgAluno.setText("");
        relacaoEmergencia.setText("");
    }

    public void iniciaTela(Aluno aluno) {
        this.aluno = aluno;
        labelNomeAluno.setText(aluno.getNome());
        nomeAluno.setText(aluno.getNome());
        rgAluno.setText(aluno.getRG());
        cpfAluno.setText(aluno.getCPF());
        telefoneAluno.setText(aluno.getTelefone());
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        dataNascimentoAluno.setText(formatador.format(aluno.getDataNascimento()));
        nomeEmergencia.setText(aluno.getNomeEmergencia());
        relacaoEmergencia.setText(aluno.getRelacaoEmergencia());
        telefoneEmergencia.setText(aluno.getTelefoneEmergencia());
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpfAluno;
    private javax.swing.JFormattedTextField dataNascimentoAluno;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNomeAluno;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeEmergencia;
    private javax.swing.JTextField relacaoEmergencia;
    private javax.swing.JTextField rgAluno;
    private javax.swing.JFormattedTextField telefoneAluno;
    private javax.swing.JFormattedTextField telefoneEmergencia;
    // End of variables declaration//GEN-END:variables
}
