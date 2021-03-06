/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Tela;


import easysurf.Controlador.ControladorAluno;
import easysurf.Controlador.ControladorPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caroline
 */
public class TelaCadastroAluno extends javax.swing.JFrame {
    
    public static TelaCadastroAluno instance;
    boolean sabequeehmenor = false;
    
    /**
     * Creates new form TelaCadastroAluno
     */
    public TelaCadastroAluno() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel6.setText("Contato Emergência*");
        jLabel6.setToolTipText("Nome do contato de emergência");

        jLabel7.setText("Telefone Emergência*");
        jLabel7.setToolTipText("Telefone do contato de Emergência");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraNovoAluno(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaParaTelaAnterior(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Cadastro de novo aluno");

        jLabel9.setText("Relação Emergência:");

        jLabel10.setText("E-mail:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel8)
                        .addGap(81, 81, 81)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jFormattedTextField3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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

    private void cadastraNovoAluno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraNovoAluno
        String nome = jTextField1.getText();
        String rg = jTextField2.getText();
        String cpf = jFormattedTextField1.getText();
        String telefone = jFormattedTextField2.getText();
        String dataNascimento = jFormattedTextField3.getText();
        String contatoEmergencia  = jTextField3.getText();
        String relacaoEmergencia = jTextField4.getText();
        String telefoneEmergencia= jFormattedTextField4.getText();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
        Date dataAtual = new Date();
        Calendar calendar = Calendar.getInstance();
        try {
            data = formatador.parse(dataNascimento);
            calendar.setTime(data);
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + 18);
            if (dataAtual.after(calendar.getTime()) || sabequeehmenor){
               if (nome.length() > 0 && cpf.length() == 14 && contatoEmergencia.length() > 0 && telefoneEmergencia.length() == 14 && telefone.length() == 14){
                    cadastraAluno(nome, rg, cpf, telefone, data, contatoEmergencia, relacaoEmergencia, telefoneEmergencia);
                    sabequeehmenor = false;    
                }
               else{
               JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
               }
            }
            else{
                JOptionPane.showMessageDialog(null, "Aluno menor de 18 anos!! Matrícula autorizada somente com acompanhamento dos responsáveis!");
                sabequeehmenor = true;
            }

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
            Logger.getLogger(TelaCadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastraNovoAluno

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
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAluno().setVisible(true);
            }
        });
    }
    
    public void limpaTela(){
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jFormattedTextField4.setText("");
        TelaPrincipal.getInstance().loadTables();
        ControladorPrincipal.getInstance().escondeTelaCadastroAluno(); 
    }
    
    public void cadastraAluno(String nome, String rg, String cpf, String telefone, Date dataNascimento, String contatoEmergencia, String relacaoEmergencia, String telefoneEmergencia)
    {
         if (ControladorAluno.getInstance().criaAluno(nome, rg, cpf, telefone, dataNascimento, contatoEmergencia, relacaoEmergencia, telefoneEmergencia)) {
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
                    limpaTela();
                }else{
                    JOptionPane.showMessageDialog(null, "Aluno já está cadastrado.");
                    limpaTela();
                }
    }
    
    public void acoes() {
        
//        jButton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                
//                String nome = jTextField1.getText();
//                String rg = jTextField2.getText();
//                String cpf = jFormattedTextField1.getText();
//                String telefone = jFormattedTextField2.getText();
//                String dataNascimento = jFormattedTextField3.getText();
//                String contatoEmergencia  = jTextField3.getText();
//                String relacaoEmergencia = jTextField4.getText();
//                String telefoneEmergencia= jFormattedTextField4.getText();
//                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//                Date data;
//                Date dataAtual = new Date();
//                Calendar calendar = Calendar.getInstance();
//                try {
//                    data = formatador.parse(dataNascimento);
//                    calendar.setTime(data);
//                    calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + 18);
//                    if (dataAtual.after(calendar.getTime()) || sabequeehmenor){
//                       if (nome.length() > 0 && cpf.length() == 14 && contatoEmergencia.length() > 0 && telefoneEmergencia.length() == 14 && telefone.length() == 14){
//                            cadastraAluno(nome, rg, cpf, telefone, data, contatoEmergencia, relacaoEmergencia, telefoneEmergencia);
//                        sabequeehmenor = false;    
//                        }
//                       else{
//                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
//                       }
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(null, "Aluno menor de 18 anos!! Matrícula autorizada somente com acompanhamento dos responsáveis!");
//                        sabequeehmenor = true;
//                    }
//                    
//                } catch (ParseException ex) {
//                    JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
//                    Logger.getLogger(TelaCadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              }
//        });
//        jButton2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jTextField1.setText("");
//                jTextField2.setText("");
//                jFormattedTextField1.setText("");
//                jFormattedTextField2.setText("");
//                jFormattedTextField3.setText("");
//                jTextField3.setText("");
//                jTextField4.setText("");
//                jFormattedTextField4.setText("");
//                ControladorPrincipal.getInstance().escondeTelaCadastroAluno();
//            }
//        });
    }
    
    public static TelaCadastroAluno getInstance() {
        if (instance == null) {
            return instance = new TelaCadastroAluno();
        }
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
