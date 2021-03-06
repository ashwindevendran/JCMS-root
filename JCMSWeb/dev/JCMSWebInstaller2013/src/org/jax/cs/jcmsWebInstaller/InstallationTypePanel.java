/****
Copyright (c) 2015 The Jackson Laboratory

This is free software: you can redistribute it and/or modify it 
under the terms of the GNU General Public License as published by  
the Free Software Foundation, either version 3 of the License, or  
(at your option) any later version.
 
This software is distributed in the hope that it will be useful,  
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
General Public License for more details.

You should have received a copy of the GNU General Public License 
along with this software.  If not, see <http://www.gnu.org/licenses/>.
****/

package org.jax.cs.jcmsWebInstaller;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author cnh
 */
public class InstallationTypePanel extends JCMSPanel {
    
    /**
     * Creates new form InstallationTypePanel
     */
    public InstallationTypePanel() {
        initComponents();
        setIsNewInstallation(true);
    }
    
    public InstallationTypePanel(JDesktopPane desktopPane, JFrame frame) {
        super.JCMSPanel(desktopPane, frame);
        initComponents();
        this.newRadioButton.setSelected(getIsNewInstallation());
        this.upgradeRadioButton.setSelected(!getIsNewInstallation());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        installationTypeButtonGroup = new javax.swing.ButtonGroup();
        installationTypeLabel = new javax.swing.JLabel();
        newRadioButton = new javax.swing.JRadioButton();
        upgradeRadioButton = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        lblMySQLDownload = new javax.swing.JLabel();
        lblJCMSWebInstallation = new javax.swing.JLabel();
        lblWindows = new javax.swing.JLabel();
        lblMAC = new javax.swing.JLabel();
        lblLINUX = new javax.swing.JLabel();
        lblJAVADownload = new javax.swing.JLabel();
        NewAndUpgradeRadioButton = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        installationTypeLabel.setText("Select a JCMS Web installation type:");

        installationTypeButtonGroup.add(newRadioButton);
        newRadioButton.setText("New JCMS Web Application & New Database");
        newRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRadioButtonActionPerformed(evt);
            }
        });

        installationTypeButtonGroup.add(upgradeRadioButton);
        upgradeRadioButton.setText("Upgrade Existing JCMS Web Application");
        upgradeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgradeRadioButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonNextActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonNextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JCMS Web Installation Type");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtMessage.setEditable(false);
        txtMessage.setColumns(20);
        txtMessage.setLineWrap(true);
        txtMessage.setRows(5);
        txtMessage.setText("New JCMS Web Application & New Database - installs a new JCMS Web application and a new JCMS database. This installation requires the following software be installed prior to installing JCMS Web.\n- Install JAVA on the same server or laptop hosting JCMS Web\n- Install MySQL Community Server on a local or remote server\n \nUpgrade Existing JCMS Web Application - updates an existing JCMS Web application and upgrades an existing JCMS database.  The default JCMS database name is \"jcms_db\". JCMS database name can be renamed for new installs. JCMS Web database \"jcmsweb_db\" has been deprecated and will automatically be migrated to \"jcms_db\".\n\nNew JCMS Web Application & Upgrade JCMS Database - installs JCMS Web application and upgrades an existing JCMS database.  \n\n\n");
        txtMessage.setWrapStyleWord(true);
        txtMessage.setCaretPosition(0);
        jScrollPane1.setViewportView(txtMessage);

        lblMySQLDownload.setForeground(new java.awt.Color(0, 0, 255));
        lblMySQLDownload.setText("MySQL Community Server download");
        lblMySQLDownload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMySQLDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMySQLDownloadMouseClicked(evt);
            }
        });

        lblJCMSWebInstallation.setText("MySQL Community Server installation instructions:");

        lblWindows.setForeground(new java.awt.Color(0, 0, 255));
        lblWindows.setText("Windows");
        lblWindows.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWindows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWindowsMouseClicked(evt);
            }
        });

        lblMAC.setForeground(new java.awt.Color(0, 0, 255));
        lblMAC.setText("MAC");
        lblMAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMACMouseClicked(evt);
            }
        });

        lblLINUX.setForeground(new java.awt.Color(0, 0, 255));
        lblLINUX.setText("LINUX");
        lblLINUX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLINUX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLINUXMouseClicked(evt);
            }
        });

        lblJAVADownload.setForeground(new java.awt.Color(0, 0, 255));
        lblJAVADownload.setText("JAVA download");
        lblJAVADownload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJAVADownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJAVADownloadMouseClicked(evt);
            }
        });

        installationTypeButtonGroup.add(NewAndUpgradeRadioButton);
        NewAndUpgradeRadioButton.setText("New JCMS Web Application & Upgrade JCMS Database");
        NewAndUpgradeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAndUpgradeRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(installationTypeLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NewAndUpgradeRadioButton)
                                    .addComponent(upgradeRadioButton)
                                    .addComponent(newRadioButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJAVADownload)
                                    .addComponent(lblMySQLDownload)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblJCMSWebInstallation)
                                        .addGap(28, 28, 28)
                                        .addComponent(lblWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMAC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblLINUX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(installationTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(newRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upgradeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewAndUpgradeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJAVADownload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMySQLDownload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJCMSWebInstallation)
                    .addComponent(lblWindows)
                    .addComponent(lblMAC)
                    .addComponent(lblLINUX))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRadioButtonActionPerformed
        setIsNewInstallation(true);
        this.getFrame().setTitle("JCMS Web Installer - "+ (((JCMSWebInstallerApp)this.getFrame()).getIsNewInstallation() ? "Install" : "Upgrade" ));        
    }//GEN-LAST:event_newRadioButtonActionPerformed

    private void upgradeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgradeRadioButtonActionPerformed
        setIsNewInstallation(false);
        this.getFrame().setTitle("JCMS Web Installer - "+ (((JCMSWebInstallerApp)this.getFrame()).getIsNewInstallation() ? "Install" : "Upgrade" ));        
    }//GEN-LAST:event_upgradeRadioButtonActionPerformed

    private void backButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonNextActionPerformed
        this.previousPanel(this, this.getJcmsView());
    }//GEN-LAST:event_backButtonNextActionPerformed

    private void nextButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonNextActionPerformed
        this.refreshPanel();
        if (this.getIsNewInstallation()) {
            this.nextPanel(this, this.getJcmsView().getInstallMySQLPanel(), this.getJcmsView());
        } else {
            this.nextPanel(this, this.getJcmsView().getDatabaseSetupPanel(), this.getJcmsView());        
        }
    }//GEN-LAST:event_nextButtonNextActionPerformed

    private void lblMySQLDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMySQLDownloadMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLDownloadsURL());
    }//GEN-LAST:event_lblMySQLDownloadMouseClicked

    private void lblWindowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWindowsMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLInstallWindowsURL());
    }//GEN-LAST:event_lblWindowsMouseClicked

    private void lblMACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMACMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLInstallMacURL());
    }//GEN-LAST:event_lblMACMouseClicked

    private void lblLINUXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLINUXMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLInstallLinuxURL());
    }//GEN-LAST:event_lblLINUXMouseClicked

    private void lblJAVADownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJAVADownloadMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getJAVADownloadsURL());
    }//GEN-LAST:event_lblJAVADownloadMouseClicked

    private void NewAndUpgradeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAndUpgradeRadioButtonActionPerformed
        setIsNewInstallation(false);
        this.getFrame().setTitle("JCMS Web Installer - "+ (((JCMSWebInstallerApp)this.getFrame()).getIsNewInstallation() ? "Install" : "Upgrade" ));        
    }//GEN-LAST:event_NewAndUpgradeRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton NewAndUpgradeRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup installationTypeButtonGroup;
    private javax.swing.JLabel installationTypeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJAVADownload;
    private javax.swing.JLabel lblJCMSWebInstallation;
    private javax.swing.JLabel lblLINUX;
    private javax.swing.JLabel lblMAC;
    private javax.swing.JLabel lblMySQLDownload;
    private javax.swing.JLabel lblWindows;
    private javax.swing.JRadioButton newRadioButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JRadioButton upgradeRadioButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the newInstallation
     */
    public Boolean getIsNewInstallation() {
        return ((JCMSWebInstallerApp)this.getFrame()).getIsNewInstallation();
    }

    /**
     * @param newInstallation the newInstallation to set
     */
    public void setIsNewInstallation(Boolean newInstallation) {
        ((JCMSWebInstallerApp)this.getFrame()).setIsNewInstallation(newInstallation);
    }
    
    private void refreshPanel() {
        ((DatabaseSetupPanel)(((JCMSWebInstallerApp)this.getFrame()).getJcmsView().getDatabaseSetupPanel())).refreshPanel();
    }
}
