/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * ConnectionManagerPanel.java
 *
 * Created on 2015-10-5, 11:38:42
 */
package org.alvin.ui;

import org.alvin.action.ActionManager;
import org.alvin.action.AddConnectAction;
import org.alvin.action.DelConnectionAction;
import org.alvin.action.EditConnectAccountAction;
import org.alvin.model.ConnectAccountTableModel;
import craky.componentc.JCButton;
import craky.componentc.JCScrollPane;
import craky.componentc.JCTable;
import java.awt.Dimension;
import javax.swing.JTable;

/**
 *
 * @author Administrator
 */
public class ConnectionManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConnectionManagerPanel
     */
    public ConnectionManagerPanel() {
        initComponents();

        //
        jTable1.setModel(new ConnectAccountTableModel());
        jButton1.setPreferredSize(new Dimension(80, 21));
        jButton1.setAction(ActionManager.getAction(AddConnectAction.class));
        jButton2.setPreferredSize(new Dimension(80, 21));
        jButton2.setAction(ActionManager.getAction(EditConnectAccountAction.class));
        jButton3.setPreferredSize(new Dimension(80, 21));
        jButton3.setText("连 接");
        jButton4.setPreferredSize(new Dimension(80, 21));
        jButton5.setPreferredSize(new Dimension(80, 21));
        jButton5.setAction(ActionManager.getAction(DelConnectionAction.class));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new JCScrollPane();
        jTable1 = new JCTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new JCButton();
        jButton2 = new JCButton();
        jButton3 = new JCButton();
        jButton4 = new JCButton();
        jButton5 = new JCButton();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(561, 29));

        jButton1.setText("添 加");
        jButton1.setName("jButton1"); // NOI18N
        jPanel1.add(jButton1);

        jButton2.setText("编 辑"); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jPanel1.add(jButton2);

        jButton3.setText("Connect"); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jPanel1.add(jButton3);

        jButton4.setText("DisConnect"); // NOI18N
        jButton4.setEnabled(false);
        jButton4.setName("jButton4"); // NOI18N
        jPanel1.add(jButton4);

        jButton5.setText("删 除"); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        jPanel1.add(jButton5);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public JTable getTable() {
        return jTable1;
    }

    public void buttonActionEnabledChange() {
        ActionManager.getAction(AddConnectAction.class).changeState();
        ActionManager.getAction(EditConnectAccountAction.class).changeState();
        ActionManager.getAction(DelConnectionAction.class).changeState();
    }

}