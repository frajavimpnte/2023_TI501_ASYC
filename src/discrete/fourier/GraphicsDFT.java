/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * Tema 4 Señales discretas
 * By FJMP
 * 28/09/2023
 */
package discrete.fourier;

import discrete.system.*;
import fourier.series.*;
import tools.*;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author TICS03
 */
public class GraphicsDFT extends javax.swing.JFrame {
   
    public GraphicsDFT() {
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

        pnlDraw = new javax.swing.JPanel();
        btnDraw = new javax.swing.JButton();
        lbNpoints = new javax.swing.JLabel();
        tfNpoints = new javax.swing.JTextField();
        lblSampleTime = new javax.swing.JLabel();
        tfSampleTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDraw.setBackground(new java.awt.Color(50, 90, 20));
        pnlDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDrawMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDrawLayout = new javax.swing.GroupLayout(pnlDraw);
        pnlDraw.setLayout(pnlDrawLayout);
        pnlDrawLayout.setHorizontalGroup(
            pnlDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pnlDrawLayout.setVerticalGroup(
            pnlDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(pnlDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 300, 300));

        btnDraw.setText("Draw");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });
        getContentPane().add(btnDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        lbNpoints.setText("Numero de puntos:");
        getContentPane().add(lbNpoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        tfNpoints.setText("10");
        tfNpoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNpointsActionPerformed(evt);
            }
        });
        getContentPane().add(tfNpoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 60, -1));

        lblSampleTime.setText("Tiempo de muestreo:");
        getContentPane().add(lblSampleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        tfSampleTime.setText("0.1");
        tfSampleTime.setPreferredSize(new java.awt.Dimension(100, 22));
        getContentPane().add(tfSampleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        setBounds(0, 0, 656, 488);
    }// </editor-fold>//GEN-END:initComponents

    private void drawAxis() {
        Graphics2D g = (Graphics2D) pnlDraw.getGraphics();
      
        g.setColor(new Color(50, 90, 20));
        g.fillRect(0,0, 300, 300);
        
        g.setColor(Color.white);
        
        // draw x axis, from  (0,0) to  (20, 0)  
        g.drawLine(
                Coordinate.toScreenX(Coordinate.XMIN),
                Coordinate.toScreenY(0.0f),
                Coordinate.toScreenX(Coordinate.XMAX),
                Coordinate.toScreenY(0.0f)
        );
        
        for (float dx = Coordinate.XMIN; dx < Coordinate.XMAX; dx += 1.0) {
            g.drawLine(
                Coordinate.toScreenX(dx),
                Coordinate.toScreenY(0),
                Coordinate.toScreenX(dx),
                Coordinate.toScreenY(0.5f)
            );
        }
        
        // draw y axis, from  (0,0) to  (0, 20)  
        g.drawLine(
                Coordinate.toScreenX(0.0f),
                Coordinate.toScreenY(Coordinate.YMIN),
                Coordinate.toScreenX(0.00f),
                Coordinate.toScreenY(Coordinate.YMAX)
        );
        
        for (float dy = Coordinate.YMIN; dy < Coordinate.YMAX; dy += 1.0) {
            g.drawLine(
                Coordinate.toScreenX(0),
                Coordinate.toScreenY(dy),
                Coordinate.toScreenX(0.5f),
                Coordinate.toScreenY(dy)
            );
        } 
    }
    
    private void drawFunction(int nPoints, float ts) {
        // discrete signal
        DiscreteFunctionTP01a sf = new DiscreteFunctionTP01a (ts, nPoints);
        sf.compute();
        
        // dft
        DFT dft = new DFT(sf.getSamplesNumber(), sf.getSamplingTime(),
                sf.getSignal());
        dft.compute();
        
        ComplexNumber cn[] = dft.getFw();
        
        float x[] = new float[cn.length];
        float y[] = new float[cn.length];
        
        for (int i = 0; i < cn.length; i++) {
            x[i] = cn[i].getA();
            y[i] = cn[i].getB();
        }
      

        // Draw function points
         Graphics2D g = (Graphics2D) pnlDraw.getGraphics();
         g.setColor(Color.white);         
         for (int i = 0; i < x.length; i++) {
             /*
             g.drawLine(
                Coordinate.toScreenX(x[i]),
                Coordinate.toScreenY(0),
                Coordinate.toScreenX(x[i]),
                Coordinate.toScreenY(y[i])
            );
             */
            g.drawString("o", 
                    Coordinate.toScreenX(x[i]), 
                    Coordinate.toScreenY(y[i]));
         }
    }
    
    private void pnlDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDrawMouseClicked
        // TODO add your handling code here:
        int Naprox =  Integer.parseInt( 
                tfNpoints.getText()
            );
        float ts = Float.parseFloat(
                tfSampleTime.getText()
            );
        drawAxis();
        drawFunction(Naprox, ts);
    }//GEN-LAST:event_pnlDrawMouseClicked

    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        // TODO add your handling code here:
        int Naprox =  Integer.parseInt( 
                tfNpoints.getText()
            );
         float ts = Float.parseFloat(
                tfSampleTime.getText()
            );
        drawAxis();
        drawFunction(Naprox, ts);
    }//GEN-LAST:event_btnDrawActionPerformed

    private void tfNpointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNpointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNpointsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphicsDFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsDFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsDFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsDFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicsDFT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDraw;
    private javax.swing.JLabel lbNpoints;
    private javax.swing.JLabel lblSampleTime;
    private javax.swing.JPanel pnlDraw;
    private javax.swing.JTextField tfNpoints;
    private javax.swing.JTextField tfSampleTime;
    // End of variables declaration//GEN-END:variables
}
