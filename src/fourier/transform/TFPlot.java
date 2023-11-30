/* ITESS-TICS
 * Semestre Agosto-Diciembre 2023 
 * ANSYSC
 * Tema 2 Series de Fourier
 * By FJMP
 * 28/09/2023
 */
package fourier.transform;

import fourier.series.*;
import java.awt.BasicStroke;
import tools.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author TICS03
 */
public class TFPlot extends javax.swing.JFrame {
    Coordinate coorFw;
    Coordinate coorFwMod;
    Coordinate coorFwPhase;
    
    TFSample1 tf1;

    // plot colors:
    private final Color plotBkgColor = new Color(75, 75, 75);
    private final Color plotStrkeColor = new Color(245, 102, 66);
    private final Stroke plotStroke = new BasicStroke((float) 3.0);
    public TFPlot() {
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

        background = new javax.swing.JPanel();
        pnlDrawFw = new javax.swing.JPanel();
        pnlDrawFwPhase = new javax.swing.JPanel();
        pnlDrawFwMod = new javax.swing.JPanel();
        btnDraw = new javax.swing.JButton();
        lbNaprox = new javax.swing.JLabel();
        tfNAproximation = new javax.swing.JTextField();
        lblTitleTF = new javax.swing.JLabel();
        lblIconTF = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDrawFw.setBackground(new java.awt.Color(51, 51, 51));
        pnlDrawFw.setPreferredSize(new java.awt.Dimension(150, 150));
        pnlDrawFw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDrawFwMouseClicked(evt);
            }
        });
        pnlDrawFw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(pnlDrawFw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 150));

        pnlDrawFwPhase.setBackground(new java.awt.Color(51, 51, 51));
        pnlDrawFwPhase.setPreferredSize(new java.awt.Dimension(150, 150));
        pnlDrawFwPhase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDrawFwPhaseMouseClicked(evt);
            }
        });
        pnlDrawFwPhase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(pnlDrawFwPhase, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        pnlDrawFwMod.setBackground(new java.awt.Color(51, 51, 51));
        pnlDrawFwMod.setPreferredSize(new java.awt.Dimension(150, 150));
        pnlDrawFwMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDrawFwModMouseClicked(evt);
            }
        });
        pnlDrawFwMod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(pnlDrawFwMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 150));

        btnDraw.setText("Draw");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });
        background.add(btnDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        lbNaprox.setForeground(new java.awt.Color(255, 255, 255));
        lbNaprox.setText("N puntos");
        background.add(lbNaprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        tfNAproximation.setText("5");
        tfNAproximation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNAproximationActionPerformed(evt);
            }
        });
        background.add(tfNAproximation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 50, 20));

        lblTitleTF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleTF.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleTF.setText("Tema3. Tranformada de Fourier");
        background.add(lblTitleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lblIconTF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TFlogo.png"))); // NOI18N
        lblIconTF.setText("jLabel2");
        background.add(lblIconTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        lblComment.setForeground(new java.awt.Color(255, 255, 255));
        lblComment.setText("Grafica de la transformada de Fouier, espectro y fase de la función f(t) = exp(-at)");
        background.add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 460, 30));

        lblFoot.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot.setText("Francisco Javier Montecillo Puente");
        background.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        lblFoot1.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic ASYSC");
        background.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("F(w)");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("|F(w)|");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phase F(w)");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        setBounds(0, 0, 656, 488);
    }// </editor-fold>//GEN-END:initComponents

    // Fourier Tranform Computation
    private void computeData(int wPoints) {
        // compute data points
        tf1 = new TFSample1(wPoints);
        tf1.computeW();
        tf1.computeFw();
        tf1.computeFwMod();
        tf1.computeFwPhase();
    }
    
    private void drawPlots() {
       
        //1.  Fw: Plot FourierTransform
        //1a. Define proper coodinate range
        coorFw = new Coordinate(-2,2,-2,2, 
                pnlDrawFw.getWidth(), pnlDrawFw.getWidth());
        
        //1b.  Get data, complex numbers
        ComplexNumber cn[] = tf1.getFw();
        float x[] = new float[cn.length];
        float y[] = new float[cn.length];
        for (int i = 0; i < cn.length; i++) {
            //System.out.println(cn[i]);
            x[i] = cn[i].getA();
            y[i] = cn[i].getB();
        }
        drawAxis(pnlDrawFw, coorFw);
        drawFunction(pnlDrawFw, coorFw, x, y, false);
        
        // 2. FwModplot FourierTransform spectrum        
        // 2a. Define proper coodinate range
        coorFwMod = new Coordinate(-1,tf1.getWPoints(),-4,4, 
                pnlDrawFwMod.getWidth(), pnlDrawFwMod.getWidth());
        
        // 2b.  Get data, complex numbers
        drawAxis(pnlDrawFwMod, coorFwMod);
        drawFunction(pnlDrawFwMod, coorFwMod, 
                tf1.getW(), tf1.getFwMod(), true);
        
        
        // 3. FwModplot FourierTransform spectrum        
        // 3a. Define proper coodinate range
        coorFwPhase = new Coordinate(-1,tf1.getWPoints(),-4,4, 
                pnlDrawFwPhase.getWidth(), pnlDrawFwPhase.getWidth());
        
        // 3b.  Get data, complex numbers
        drawAxis(pnlDrawFwPhase, coorFwPhase);
        drawFunction(pnlDrawFwPhase, coorFwPhase, 
                tf1.getW(), tf1.getFwPhase(), true);
    }
    private void drawAxis(javax.swing.JPanel pnlDraw, Coordinate coor) {
        Graphics2D g = (Graphics2D) pnlDraw.getGraphics();
      
        // background color
        g.setColor(plotBkgColor);
        g.fillRect(0,0, pnlDraw.getWidth(), pnlDraw.getHeight());
        
        g.setColor(Color.white);
        
        // draw x axis, from  (0,0) to  (20, 0)  
        g.drawLine(
                coor.toScreenX(coor.getXMIN()),
                coor.toScreenY(0.0f),
                coor.toScreenX(coor.getXMAX()),
                coor.toScreenY(0.0f)
        );
        // draw x axis
        for (float dx = coor.getXMIN(); dx < coor.getXMAX(); dx += 1.0) {
            g.drawLine(
                coor.toScreenX(dx),
                coor.toScreenY(0),
                coor.toScreenX(dx),
                coor.toScreenY(0.05f)
            );
        }
        
        // draw y axis, from  (0,0) to  (0, 20)  
        g.drawLine(
                coor.toScreenX(0.0f),
                coor.toScreenY(coor.getYMIN()),
                coor.toScreenX(0.00f),
                coor.toScreenY(coor.getYMAX())
        );
        
        for (float dy = coor.getYMIN(); dy < coor.getYMAX(); dy += 1.0) {
            g.drawLine(
                coor.toScreenX(0),
                coor.toScreenY(dy),
                coor.toScreenX(0.05f),
                coor.toScreenY(dy)
            );
        } 
    }
    
    private void drawFunction(javax.swing.JPanel pnlDraw, Coordinate coor, 
            float [] x, float[] y, boolean isLine) {

         // Draw function points
         Graphics2D g = (Graphics2D) pnlDraw.getGraphics();
         
         
         // stroke
         g.setStroke(plotStroke);
         
         // color plot
         g.setColor(plotStrkeColor); 
         for (int i = 0; i < x.length - 1; i++) {
             if (isLine) {
                    g.drawString("o", 
                    coor.toScreenX(x[i]),
                    coor.toScreenY(y[i]));
                g.drawLine(
                        
                    coor.toScreenX(x[i]),
                    coor.toScreenY(y[i]),
                    coor.toScreenX(x[i+1]),
                    coor.toScreenY(y[i+1])
                );
             } else {
                 g.drawString("\u2022", 
                    coor.toScreenX(x[i]),
                    coor.toScreenY(y[i]));
            }
         }
    }
    
    private void pnlDrawFwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDrawFwMouseClicked
        // TODO add your handling code here:
        //int N =  Integer.parseInt( 
        //        tfNAproximation.getText()
        //    );
        //drawAxisFw();
        //drawFunctionFw();
    }//GEN-LAST:event_pnlDrawFwMouseClicked

    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        // TODO add your handling code here:
        int wPoints =  Integer.parseInt( 
                tfNAproximation.getText()
            );
        computeData(wPoints);
        drawPlots();
    }//GEN-LAST:event_btnDrawActionPerformed

    private void tfNAproximationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNAproximationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNAproximationActionPerformed

    private void pnlDrawFwModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDrawFwModMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlDrawFwModMouseClicked

    private void pnlDrawFwPhaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDrawFwPhaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlDrawFwPhaseMouseClicked

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
            java.util.logging.Logger.getLogger(TFPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TFPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TFPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TFPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TFPlot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbNaprox;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblIconTF;
    private javax.swing.JLabel lblTitleTF;
    private javax.swing.JPanel pnlDrawFw;
    private javax.swing.JPanel pnlDrawFwMod;
    private javax.swing.JPanel pnlDrawFwPhase;
    private javax.swing.JTextField tfNAproximation;
    // End of variables declaration//GEN-END:variables
}
