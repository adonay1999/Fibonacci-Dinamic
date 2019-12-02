/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonnaci;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Erick Piche
 */
public class ODF extends javax.swing.JFrame {

    /**
     * Creates new form ODF
     */
    public ODF() {
        initComponents();
    }
    
   public static int FibonacciRecursivo(int n){
       if(n==0){
           return 0;
        }else if (n==1){
            return 1;
        }else{
         return FibonacciRecursivo(n-1)+FibonacciRecursivo(n-2);  
       }
   }
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonacciMejorado(int n){

    if (n < 0) {
            throw new IllegalArgumentException(
                "Index was negative. No such thing as a negative index in a series.");
        // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }
        // see if we've already calculated this
       if (memo.containsKey(n)) {
           // System.out.printf("grabbing memo[%d]\n", n);
          return memo.get(n);
       }
       // System.out.printf("computing fib(%d)\n", n);
        int result = fibonacciMejorado(n - 1) + fibonacciMejorado(n - 2);
        // memoize
        memo.put(n, result);
        return result;
        
    }
     public int fibonacciBottoUp(int n) {
        int fnMin2 = 0;
        int fnMin1 = 1;
        int sum = 0;
        for(int i = 2; i <= n; i++) {
            sum = fnMin1 + fnMin2;
            fnMin2 = fnMin1;
            fnMin1 = sum;
        }
        return sum;
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
        txtResultado = new javax.swing.JTextField();
        txtValorIngresado = new javax.swing.JTextField();
        BtnFibonacciBott = new javax.swing.JButton();
        BtnFibonacciMejorado = new javax.swing.JButton();
        BtnFibonacciNormal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fibonacci ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el valor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 240, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resultado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 60, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Fibonacci-597b99153df78cbb7a255abc.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 220, 130));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Dinamico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 60));

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 0, 204));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 200, 30));

        txtValorIngresado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorIngresado.setForeground(new java.awt.Color(0, 0, 255));
        txtValorIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorIngresadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtValorIngresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 180, 30));

        BtnFibonacciBott.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnFibonacciBott.setText("Fibonacci Bott-Up");
        BtnFibonacciBott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciBottActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFibonacciBott, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 180, 30));

        BtnFibonacciMejorado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnFibonacciMejorado.setText("Fibonacci Mejorado");
        BtnFibonacciMejorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciMejoradoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFibonacciMejorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 180, 30));

        BtnFibonacciNormal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnFibonacciNormal.setText("Fibonacci Normal");
        BtnFibonacciNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFibonacciNormalActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFibonacciNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 393, 490));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 393, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorIngresadoActionPerformed

    private void BtnFibonacciNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciNormalActionPerformed
       int dato = Integer.parseInt(txtValorIngresado.getText());
       int Resultado = FibonacciRecursivo(dato);
       txtResultado.setText(Integer.toString(Resultado));
    }//GEN-LAST:event_BtnFibonacciNormalActionPerformed

    private void BtnFibonacciBottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciBottActionPerformed
         int dato = Integer.parseInt(txtValorIngresado.getText());
       int Resultado = fibonacciBottoUp(dato);
       txtResultado.setText(Integer.toString(Resultado));
    }//GEN-LAST:event_BtnFibonacciBottActionPerformed

    private void BtnFibonacciMejoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFibonacciMejoradoActionPerformed
        int dato = Integer.parseInt(txtValorIngresado.getText());
       int Resultado = fibonacciMejorado(dato);
       txtResultado.setText(Integer.toString(Resultado));
    }//GEN-LAST:event_BtnFibonacciMejoradoActionPerformed

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
            java.util.logging.Logger.getLogger(ODF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ODF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ODF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ODF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ODF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFibonacciBott;
    private javax.swing.JButton BtnFibonacciMejorado;
    private javax.swing.JButton BtnFibonacciNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValorIngresado;
    // End of variables declaration//GEN-END:variables
}
