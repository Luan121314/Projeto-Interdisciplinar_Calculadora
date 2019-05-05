/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar_interfacegrafica;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicTableUI;

/**
 *
 * @author Luans
 */
public class Interface extends javax.swing.JFrame {

    ArrayList obj_array = new ArrayList();

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        carregaPreDefinidos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RadioBhaskara = new javax.swing.JRadioButton();
        radioCil = new javax.swing.JRadioButton();
        radioCone = new javax.swing.JRadioButton();
        radioParalelepipedo = new javax.swing.JRadioButton();
        radioPonto = new javax.swing.JRadioButton();
        radioQuadrado = new javax.swing.JRadioButton();
        radioTrian = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtVa = new javax.swing.JTextField();
        txtVb = new javax.swing.JTextField();
        txtVc = new javax.swing.JTextField();
        LbA = new javax.swing.JLabel();
        LbB = new javax.swing.JLabel();
        LbC = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        radioConsClasse = new javax.swing.JRadioButton();
        radioConsTodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto interdisciplinar");
        setBackground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de calculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(RadioBhaskara);
        RadioBhaskara.setText("Bhaskara");
        RadioBhaskara.setActionCommand(RadioBhaskara.getText());
        RadioBhaskara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBhaskaraActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioCil);
        radioCil.setText("Cilindro");
        radioCil.setActionCommand(radioCil.getText());
        radioCil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCilActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioCone);
        radioCone.setText("Cone");
        radioCone.setActionCommand(radioCone.getText());
        radioCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioConeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioParalelepipedo);
        radioParalelepipedo.setText("Paralelepipedo");
        radioParalelepipedo.setActionCommand(radioParalelepipedo.getText());
        radioParalelepipedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioParalelepipedoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioPonto);
        radioPonto.setText("Ponto");
        radioPonto.setActionCommand(radioPonto.getText());
        radioPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPontoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioQuadrado);
        radioQuadrado.setText("Quadrado");
        radioQuadrado.setActionCommand(radioQuadrado.getText());
        radioQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQuadradoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTrian);
        radioTrian.setText("Triângulo");
        radioTrian.setActionCommand(radioTrian.getText());
        radioTrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTrianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTrian)
                    .addComponent(radioCil)
                    .addComponent(RadioBhaskara)
                    .addComponent(radioCone)
                    .addComponent(radioParalelepipedo)
                    .addComponent(radioPonto)
                    .addComponent(radioQuadrado))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioBhaskara)
                .addGap(13, 13, 13)
                .addComponent(radioCil)
                .addGap(18, 18, 18)
                .addComponent(radioCone)
                .addGap(18, 18, 18)
                .addComponent(radioParalelepipedo)
                .addGap(18, 18, 18)
                .addComponent(radioPonto)
                .addGap(18, 18, 18)
                .addComponent(radioQuadrado)
                .addGap(18, 18, 18)
                .addComponent(radioTrian)
                .addGap(21, 21, 21))
        );

        res.setColumns(20);
        res.setRows(5);
        res.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        jScrollPane1.setViewportView(res);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculo de figuras geométricas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de calculos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        txtVa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaActionPerformed(evt);
            }
        });

        LbA.setText("Digite o valor de A:");

        LbB.setText("Digite valor B:");

        LbC.setText("Digite o valor C:");

        btnCalcular.setText("Cadastrar");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtVa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtVb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LbA, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(LbB, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LbC, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addGap(176, 176, 176))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtVc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnCalcular)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LbB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LbC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioConsClasse);
        radioConsClasse.setText("Consultar por classe");
        radioConsClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioConsClasseActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioConsTodos);
        radioConsTodos.setText("Consultar todos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioConsClasse)
                .addGap(75, 75, 75)
                .addComponent(radioConsTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(radioConsTodos)
                    .addComponent(radioConsClasse))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setSize(new java.awt.Dimension(828, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void carregaPreDefinidos() {
        //Cadastros classe Bhaskara
        obj_array.add(new Bhaskara(1f, 5f, 10f)); //Valo de A,B,C
        obj_array.add(new Bhaskara(5f, 10f, 1f)); //Valo de A,B,C
        obj_array.add(new Bhaskara(1f, 5f, 10f)); //Valo de A,B,C
        //Cadastro da classe Cilindro
        obj_array.add(new Cilindro(7f, 3f));  //Valor de Raio e Altura
        obj_array.add(new Cilindro(6f, 10f)); //Valor de Raio e Altura
        //Cadastro de Cone
        obj_array.add(new Cone(10f, 3f)); //Valor de Raio e Altura
        obj_array.add(new Cone(4f, 7f)); //Valor de Raio e Altura
        //Cadastro de paralelepipedo
        obj_array.add(new Paralelepipedo(3f, 5f, 9f)); // Valor de altura, profundidade, largura
        obj_array.add(new Paralelepipedo(9f, 3f, 5f)); // Valor de altura, profundidade, largura
        obj_array.add(new Paralelepipedo(5f, 9f, 3f)); // Valor de altura, profundidade, largura
        //Cadastro dePonto
        obj_array.add(new Ponto(20f, 60f));//Cordenada de X e Cordenade Y
        obj_array.add(new Ponto(73f, 32f));//Cordenada de X e Cordenade Y
        //Cadastro de quadrado
        obj_array.add(new Quadrado(30f));
        obj_array.add(new Quadrado(20f));
        //Cadastro de triângulo
        obj_array.add(new Triangulo(2f, 9f, 21f));
        obj_array.add(new Triangulo(21f, 2f, 9f));
        obj_array.add(new Triangulo(2f, 21f, 2f));

    }

    private void RadioBhaskaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBhaskaraActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(true);
        txtVc.setEnabled(true);
        LbA.setText("Valor de A");
        LbB.setText("Valor de B");
        LbC.setText("Valor de C");
    }//GEN-LAST:event_RadioBhaskaraActionPerformed

    private void txtVaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaActionPerformed

    }//GEN-LAST:event_txtVaActionPerformed

    private void radioCilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCilActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(true);
        txtVc.setEnabled(false);
        LbA.setText("Raio");
        LbB.setText("Altua");
        LbC.setText("");
    }//GEN-LAST:event_radioCilActionPerformed

    private void radioTrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTrianActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(true);
        txtVc.setEnabled(true);
        LbA.setText("Lado A");
        LbB.setText("Lado B");
        LbC.setText("Lado C");

    }//GEN-LAST:event_radioTrianActionPerformed

    private void radioConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConeActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(true);
        txtVc.setEnabled(false);
        LbA.setText("Raio");
        LbB.setText("Altura");
        LbC.setText("");
    }//GEN-LAST:event_radioConeActionPerformed

    private void radioParalelepipedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioParalelepipedoActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(true);
        txtVc.setEnabled(true);
        LbA.setText("Altura");
        LbB.setText("Profundidade");
        LbC.setText("Largura");
    }//GEN-LAST:event_radioParalelepipedoActionPerformed

    private void radioPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPontoActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(true);
        txtVc.setEnabled(false);
        LbA.setText("Cord.X");
        LbB.setText("Cord.Y");
        LbC.setText("");

    }//GEN-LAST:event_radioPontoActionPerformed

    private void radioQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQuadradoActionPerformed
        txtVa.setEnabled(true);
        txtVb.setEnabled(false);
        txtVc.setEnabled(false);
        LbA.setText("Lado do quadrado");
        LbB.setText("");
        LbC.setText("");
    }//GEN-LAST:event_radioQuadradoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        String vla = txtVa.getText();
        String vlb = txtVb.getText();
        String vlc = txtVc.getText();

        if (!vla.isEmpty()) {
            Float vlra = Float.parseFloat(vla);
            Float vlrb = Float.parseFloat(vlb);
            Float vlrc = Float.parseFloat(vlc);

            if (RadioBhaskara.isSelected()) {
                obj_array.add(new Bhaskara(vlra, vlrb, vlrc));
                System.out.println("1");
            } else if (radioCil.isSelected()) {
                obj_array.add(new Cilindro(vlra, vlrb));
                System.out.println("2");
            } else if (radioCone.isSelected()) {
                obj_array.add(new Cone(vlra, vlrb));
                System.out.println("3");
            } else if (radioParalelepipedo.isSelected()) {
                obj_array.add(new Paralelepipedo(vlra, vlrb, vlrc));
                System.out.println("4");
            } else if (radioPonto.isSelected()) {
                obj_array.add(new Ponto(vlra, vlrb));
                System.out.println("5");
            } else if (radioQuadrado.isSelected()) {
                obj_array.add(new Quadrado(vlra));
                System.out.println("6");
            } else if (radioTrian.isSelected()) {
                obj_array.add(new Triangulo(vlra, vlrb, vlrc));
                System.out.println("7");
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um tipo de cálculo !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Digite o valor nos campos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (radioConsTodos.isSelected()) {
            String str = "";
            for (int i = 0; i < obj_array.size(); i++) {
                str += obj_array.get(i);
            }
            res.setText(str);
        } else if (radioConsClasse.isSelected()) {
            /* RadioBhaskara.setActionCommand("Bahskhara");
            radioCil.setActionCommand("Cilindro");
            radioCone.setActionCommand("Cone");
            radioParalelepipedo.setActionCommand("Paralelepipedo");
            radioPonto.setActionCommand("Ponto");
            radioTrian.setActionCommand("Triangulo");
            radioQuadrado.setActionCommand("Quadrado");
            String selecionado = buttonGroup1.getSelection().getActionCommand(); */
            String selecionado = buttonGroup1.getSelection().getActionCommand();

            for (int i = 0; i < obj_array.size(); i++) {
                // if( obj_array.get(i) instanceof selecionado )
               
            }

               
            JOptionPane.showMessageDialog(this, "Selecione o tipo de consulta");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void radioConsClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConsClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioConsClasseActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbA;
    private javax.swing.JLabel LbB;
    private javax.swing.JLabel LbC;
    private javax.swing.JRadioButton RadioBhaskara;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioCil;
    private javax.swing.JRadioButton radioCone;
    private javax.swing.JRadioButton radioConsClasse;
    private javax.swing.JRadioButton radioConsTodos;
    private javax.swing.JRadioButton radioParalelepipedo;
    private javax.swing.JRadioButton radioPonto;
    private javax.swing.JRadioButton radioQuadrado;
    private javax.swing.JRadioButton radioTrian;
    private javax.swing.JTextArea res;
    private javax.swing.JTextField txtVa;
    private javax.swing.JTextField txtVb;
    private javax.swing.JTextField txtVc;
    // End of variables declaration//GEN-END:variables
}
