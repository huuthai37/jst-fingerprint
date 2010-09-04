/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TestThreshold.java
 *
 * Created on Sep 3, 2010, 8:04:11 AM
 */

package misc;

import com.java.skripsi.ImagePanel;
import com.java.skripsi.Thinner;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author user
 */
public class TestThreshold extends javax.swing.JFrame {

    /** Creates new form TestThreshold */
    public TestThreshold() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOri = new ImagePanel();
        txtInput = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        pnlFuzzy = new ImagePanel();
        pnlThreshold = new ImagePanel();
        pnlThinning = new ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlOri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlOri.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlOriLayout = new javax.swing.GroupLayout(pnlOri);
        pnlOri.setLayout(pnlOriLayout);
        pnlOriLayout.setHorizontalGroup(
            pnlOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        pnlOriLayout.setVerticalGroup(
            pnlOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        btnBrowse.setText("BROWSE");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        pnlFuzzy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFuzzy.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlFuzzyLayout = new javax.swing.GroupLayout(pnlFuzzy);
        pnlFuzzy.setLayout(pnlFuzzyLayout);
        pnlFuzzyLayout.setHorizontalGroup(
            pnlFuzzyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        pnlFuzzyLayout.setVerticalGroup(
            pnlFuzzyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pnlThreshold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlThreshold.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlThresholdLayout = new javax.swing.GroupLayout(pnlThreshold);
        pnlThreshold.setLayout(pnlThresholdLayout);
        pnlThresholdLayout.setHorizontalGroup(
            pnlThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        pnlThresholdLayout.setVerticalGroup(
            pnlThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        pnlThinning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlThinning.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlThinningLayout = new javax.swing.GroupLayout(pnlThinning);
        pnlThinning.setLayout(pnlThinningLayout);
        pnlThinningLayout.setHorizontalGroup(
            pnlThinningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        pnlThinningLayout.setVerticalGroup(
            pnlThinningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(pnlOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFuzzy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlThinning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFuzzy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlThinning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser jfc = new JFileChooser(new File("images"));
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.showOpenDialog(this);

        try {
            if (jfc.getSelectedFile() != null) {
                txtInput.setText(jfc.getSelectedFile().getAbsolutePath());
                Image image = Toolkit.getDefaultToolkit().getImage(jfc.getSelectedFile().toURI().toURL());
                ((ImagePanel) pnlOri).setImage(image);

                BufferedImage oriImage = ImageIO.read(jfc.getSelectedFile());

                NewFuzzy nf = new NewFuzzy(oriImage);                
                ((ImagePanel) pnlFuzzy).setImage(nf.getResult());
                
                NewThreshold nt = new NewThreshold(nf.getResult());               
                ((ImagePanel) pnlThreshold).setImage(nt.getResult());

                Thinner thinner = new Thinner(nt.getResult());                
                ((ImagePanel) pnlThinning).setImage(thinner.getResult());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new TestThreshold().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TestThreshold.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(TestThreshold.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TestThreshold.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TestThreshold.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JPanel pnlFuzzy;
    private javax.swing.JPanel pnlOri;
    private javax.swing.JPanel pnlThinning;
    private javax.swing.JPanel pnlThreshold;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}