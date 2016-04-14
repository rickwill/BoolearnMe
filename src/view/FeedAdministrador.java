/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyVetoException;

/**
 *
 * @author Marcielli
 */
public class FeedAdministrador extends javax.swing.JInternalFrame {

    /**
     * Creates new form FeedAdministrador
     */
    public FeedAdministrador() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelTopoFeedAdministrador = new javax.swing.JPanel();
        lbTopoFeedAdministrador = new javax.swing.JLabel();
        jLabelTopoFeedAdministrador = new javax.swing.JLabel();
        jLabelImgTopoFeedAdministrador = new javax.swing.JLabel();
        jPanelRodapeFeedAdministrador = new javax.swing.JPanel();
        jLabelRodapeFeedAdministrador = new javax.swing.JLabel();
        labelMenuFeedADMInicio = new javax.swing.JLabel();
        labelMenuFeedADMCadProfessor = new javax.swing.JLabel();
        labelMenuFeedADMCadTurma = new javax.swing.JLabel();
        labelMenuFeedADMCadMateria = new javax.swing.JLabel();
        labelMenuFeedADMCadAluno = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Feed Administrador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTopoFeedAdministrador.setBackground(new java.awt.Color(6, 161, 196));

        lbTopoFeedAdministrador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTopoFeedAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        lbTopoFeedAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTopoFeedAdministrador.setText("Bom Dia, Nome.");

        jLabelTopoFeedAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logos/logo-topo.png"))); // NOI18N

        jLabelImgTopoFeedAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/perfil/administrador/erik-leonel.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTopoFeedAdministradorLayout = new javax.swing.GroupLayout(jPanelTopoFeedAdministrador);
        jPanelTopoFeedAdministrador.setLayout(jPanelTopoFeedAdministradorLayout);
        jPanelTopoFeedAdministradorLayout.setHorizontalGroup(
            jPanelTopoFeedAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoFeedAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopoFeedAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTopoFeedAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jLabelImgTopoFeedAdministrador)
                .addGap(20, 20, 20))
        );
        jPanelTopoFeedAdministradorLayout.setVerticalGroup(
            jPanelTopoFeedAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopoFeedAdministradorLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelTopoFeedAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgTopoFeedAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTopoFeedAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTopoFeedAdministradorLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbTopoFeedAdministrador)))
                .addContainerGap())
        );

        jPanelRodapeFeedAdministrador.setBackground(new java.awt.Color(6, 161, 196));

        jLabelRodapeFeedAdministrador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRodapeFeedAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRodapeFeedAdministrador.setText("ABEP Educa. 2016");

        javax.swing.GroupLayout jPanelRodapeFeedAdministradorLayout = new javax.swing.GroupLayout(jPanelRodapeFeedAdministrador);
        jPanelRodapeFeedAdministrador.setLayout(jPanelRodapeFeedAdministradorLayout);
        jPanelRodapeFeedAdministradorLayout.setHorizontalGroup(
            jPanelRodapeFeedAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeFeedAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRodapeFeedAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRodapeFeedAdministradorLayout.setVerticalGroup(
            jPanelRodapeFeedAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeFeedAdministradorLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabelRodapeFeedAdministrador)
                .addGap(19, 19, 19))
        );

        labelMenuFeedADMInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMenuFeedADMInicio.setForeground(new java.awt.Color(6, 161, 196));
        labelMenuFeedADMInicio.setText("Início");
        labelMenuFeedADMInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuFeedADMInicioMouseClicked(evt);
            }
        });

        labelMenuFeedADMCadProfessor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMenuFeedADMCadProfessor.setForeground(new java.awt.Color(6, 161, 196));
        labelMenuFeedADMCadProfessor.setText("Cadastrar Professor");

        labelMenuFeedADMCadTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMenuFeedADMCadTurma.setForeground(new java.awt.Color(6, 161, 196));
        labelMenuFeedADMCadTurma.setText("Cadastrar Turma");

        labelMenuFeedADMCadMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMenuFeedADMCadMateria.setForeground(new java.awt.Color(6, 161, 196));
        labelMenuFeedADMCadMateria.setText("Cadastrar Matéria");

        labelMenuFeedADMCadAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMenuFeedADMCadAluno.setForeground(new java.awt.Color(6, 161, 196));
        labelMenuFeedADMCadAluno.setText("Cadastrar Aluno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopoFeedAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodapeFeedAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelMenuFeedADMInicio)
                .addGap(18, 18, 18)
                .addComponent(labelMenuFeedADMCadProfessor)
                .addGap(18, 18, 18)
                .addComponent(labelMenuFeedADMCadMateria)
                .addGap(18, 18, 18)
                .addComponent(labelMenuFeedADMCadTurma)
                .addGap(18, 18, 18)
                .addComponent(labelMenuFeedADMCadAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTopoFeedAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenuFeedADMInicio)
                    .addComponent(labelMenuFeedADMCadProfessor)
                    .addComponent(labelMenuFeedADMCadMateria)
                    .addComponent(labelMenuFeedADMCadAluno)
                    .addComponent(labelMenuFeedADMCadTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(jPanelRodapeFeedAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMenuFeedADMInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuFeedADMInicioMouseClicked
        
        FeedAdministrador mostrarFeedAdministrador = new FeedAdministrador();
        jDesktopPane1.add(mostrarFeedAdministrador);
        mostrarFeedAdministrador.show();
         try {
             mostrarFeedAdministrador.setMaximum(true);
                } catch (PropertyVetoException ex) {
        }
    }//GEN-LAST:event_labelMenuFeedADMInicioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelImgTopoFeedAdministrador;
    private javax.swing.JLabel jLabelRodapeFeedAdministrador;
    private javax.swing.JLabel jLabelTopoFeedAdministrador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelRodapeFeedAdministrador;
    private javax.swing.JPanel jPanelTopoFeedAdministrador;
    private javax.swing.JLabel labelMenuFeedADMCadAluno;
    private javax.swing.JLabel labelMenuFeedADMCadMateria;
    private javax.swing.JLabel labelMenuFeedADMCadProfessor;
    private javax.swing.JLabel labelMenuFeedADMCadTurma;
    private javax.swing.JLabel labelMenuFeedADMInicio;
    private javax.swing.JLabel lbTopoFeedAdministrador;
    // End of variables declaration//GEN-END:variables
}