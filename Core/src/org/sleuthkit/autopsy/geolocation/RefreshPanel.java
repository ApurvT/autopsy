/*
 * Autopsy Forensic Browser
 *
 * Copyright 2019 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.geolocation;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * Message panel to info user that the MapPanel may need to be refreshed 
 * due to new artifacts.
 * 
 */
final class RefreshPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form RefreshPanel
     */
    RefreshPanel() {
        initComponents();
    }
    
    void addCloseActionListener(ActionListener listener) {
        closeButton.addActionListener(listener);
    }
    
    void addRefreshActionListner(ActionListener listener) {
        refreshButton.addActionListener(listener);
    }
    
    void removeCloseActionListner(ActionListener listener) {
        closeButton.removeActionListener(listener);
    }
    
    void removeRefreshActionListner(ActionListener listener) {
        refreshButton.removeActionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        refreshLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new java.awt.GridBagLayout());

        refreshLabel.setForeground(new java.awt.Color(255, 255, 255));
        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/images/warning16.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(refreshLabel, org.openide.util.NbBundle.getMessage(RefreshPanel.class, "RefreshPanel.refreshLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        add(refreshLabel, gridBagConstraints);

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/geolocation/images/arrow-circle-double-135.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(refreshButton, org.openide.util.NbBundle.getMessage(RefreshPanel.class, "RefreshPanel.refreshButton.text")); // NOI18N
        refreshButton.setMargin(new java.awt.Insets(2, 5, 2, 5));
        add(refreshButton, new java.awt.GridBagConstraints());

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/geolocation/images/cross-script.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(closeButton, org.openide.util.NbBundle.getMessage(RefreshPanel.class, "RefreshPanel.closeButton.text")); // NOI18N
        closeButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        closeButton.setOpaque(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(closeButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        
    }//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel refreshLabel;
    // End of variables declaration//GEN-END:variables
}
