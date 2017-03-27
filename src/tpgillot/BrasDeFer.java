/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgillot;

import com.sun.glass.events.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author santor-f16
 */
public class BrasDeFer extends javax.swing.JFrame {

    private Joueur j1;
    private Joueur j2;
    
    private Timer timer;
    
    private final float loseVal = 1.5f;
    
    static public BrasDeFer bras;
    
    private char toucheJ1;
    private char toucheJ2;
    
    /**
     * Creates new form BrasDeFer
     */
    public BrasDeFer() {
        initComponents();
    }
    
    public BrasDeFer(Joueur j1, Joueur j2, long speed, char toucheJ1, char toucheJ2)
    {
        initComponents();
        
        this.toucheJ1 = toucheJ1;
        this.toucheJ2 = toucheJ2;
        
        BrasDeFer.bras = this;
        
        this.j1 = j1;
        this.j2 = j2;
        
        Name1.setText(j1.getNom());
        Name2.setText(j2.getNom());
        
        Time1.setText(""+j1.getTemps());
        Time2.setText(""+j2.getTemps());
        
        timer = new Timer("boucle", true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (brasdefer.getValue() < 50)
                    j1.loseTime(loseVal * ((100 - brasdefer.getValue()) / 50.0f));
                if(brasdefer.getValue() > 50)
                    j2.loseTime(loseVal * (brasdefer.getValue() / 50.0f));
  
                if(j2.isDead())
                {
                    this.cancel();    
                    j2.setTemps(0);

                    Time2.setText(""+(int)j2.getTemps());
                    
                    JOptionPane.showMessageDialog(BrasDeFer.bras, j2.getNom()+" est mort", "Victoire de "+j1.getNom()+"!", JOptionPane.DEFAULT_OPTION );
                    BrasDeFer.bras.dispose();
                }
                else if (j1.isDead())
                {
                    this.cancel();
                    j1.setTemps(0);
                    
                    Time1.setText(""+(int)j1.getTemps());
                    
                    JOptionPane.showMessageDialog(BrasDeFer.bras, j1.getNom()+" est mort", "Victoire de "+j2.getNom()+"!", JOptionPane.DEFAULT_OPTION );            
                    BrasDeFer.bras.dispose();
                }
                
                Time1.setText(""+(int)j1.getTemps());
                Time2.setText(""+(int)j2.getTemps());
            }
        },  (long) 0.1, speed);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Time1 = new javax.swing.JLabel();
        Time2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        brasdefer = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bras de Fer");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        Name1.setText("jLabel1");

        Name2.setText("jLabel2");

        Time1.setText("jLabel1");

        Time2.setText("jLabel2");

        jLabel1.setText("Temps");

        jLabel2.setText("Temps");

        brasdefer.setValue(50);
        brasdefer.setStringPainted(true);

        jLabel3.setText("Appuyez sur x");

        jLabel4.setText("Appuyez sur m");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(brasdefer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Name1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(Time1)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(Time2))))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name1)
                    .addComponent(Name2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time1)
                    .addComponent(Time2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(brasdefer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
      
        final int power = 1;
       
        
        if(evt.getKeyChar() == KeyEvent.getKeyCodeForChar(toucheJ1))
        {
          brasdefer.setValue(brasdefer.getValue() + power);
        }
        
        if(evt.getKeyChar() == KeyEvent.getKeyCodeForChar(toucheJ2))
        {
          brasdefer.setValue(brasdefer.getValue() - power);
        }
    }//GEN-LAST:event_formKeyTyped

    
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
            java.util.logging.Logger.getLogger(BrasDeFer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrasDeFer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrasDeFer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrasDeFer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrasDeFer().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Time1;
    private javax.swing.JLabel Time2;
    private javax.swing.JProgressBar brasdefer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
