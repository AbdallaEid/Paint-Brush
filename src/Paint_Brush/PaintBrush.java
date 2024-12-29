package Paint_Brush;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hayam tarek
 */
public class PaintBrush extends JFrame {

    private DrawingPanel drawingPanel;

    /**
     * Creates new form PaintBrush
     */
    public PaintBrush() {
        initComponents();
        drawingPanel = new DrawingPanel();
        PaintBrushBody.setLayout(new BorderLayout());
        PaintBrushBody.add(drawingPanel, BorderLayout.CENTER);
        chooseColorButton.setIcon(new ImageIcon(
                new ImageIcon("assets/H6Yvv.png").
                        getImage().
                        getScaledInstance(60, 60, Image.SCALE_SMOOTH))
        );
        chooseColorButton.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        functionsLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        paintModeLabel = new javax.swing.JLabel();
        lineButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        ovalButton = new javax.swing.JButton();
        pencliButton = new javax.swing.JButton();
        eraserButton = new javax.swing.JButton();
        solidCheckBox = new javax.swing.JCheckBox();
        dottedCheckBox = new javax.swing.JCheckBox();
        blackButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        greenbutton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        PaintBrushBody = new javax.swing.JPanel();
        chooseColorButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Brush");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(50, 50));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        functionsLabel.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        functionsLabel.setText("MOODS :");

        clearButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        undoButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        undoButton.setText("Undo");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        paintModeLabel.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        paintModeLabel.setText("shapes :");

        lineButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        lineButton.setText("Line");
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        rectangleButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        ovalButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        ovalButton.setText("Oval");
        ovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalButtonActionPerformed(evt);
            }
        });

        pencliButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        pencliButton.setText("Pencil");
        pencliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencliButtonActionPerformed(evt);
            }
        });

        eraserButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        eraserButton.setText("Eraser");
        eraserButton.setFocusable(false);
        eraserButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eraserButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eraserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserButtonActionPerformed(evt);
            }
        });

        solidCheckBox.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        solidCheckBox.setText("Solid");
        solidCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solidCheckBoxActionPerformed(evt);
            }
        });

        dottedCheckBox.setFont(new java.awt.Font("Viner Hand ITC", 1, 11)); // NOI18N
        dottedCheckBox.setText("Dotted");
        dottedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dottedCheckBoxActionPerformed(evt);
            }
        });

        blackButton.setBackground(new java.awt.Color(0, 0, 0));
        blackButton.setForeground(new java.awt.Color(255, 255, 255));
        blackButton.setText("Black");
        blackButton.setBorderPainted(false);
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        redButton.setBackground(new java.awt.Color(255, 0, 0));
        redButton.setForeground(new java.awt.Color(255, 255, 255));
        redButton.setText("Red");
        redButton.setBorderPainted(false);
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        greenbutton.setBackground(new java.awt.Color(0, 255, 0));
        greenbutton.setForeground(new java.awt.Color(255, 255, 255));
        greenbutton.setText("Green");
        greenbutton.setBorderPainted(false);
        greenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenbuttonActionPerformed(evt);
            }
        });

        blueButton.setBackground(new java.awt.Color(0, 0, 255));
        blueButton.setForeground(new java.awt.Color(255, 255, 255));
        blueButton.setText("Blue");
        blueButton.setBorderPainted(false);
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        PaintBrushBody.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PaintBrushBodyLayout = new javax.swing.GroupLayout(PaintBrushBody);
        PaintBrushBody.setLayout(PaintBrushBodyLayout);
        PaintBrushBodyLayout.setHorizontalGroup(
            PaintBrushBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PaintBrushBodyLayout.setVerticalGroup(
            PaintBrushBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        chooseColorButton.setForeground(new java.awt.Color(60, 63, 65));
        chooseColorButton.setBorderPainted(false);
        chooseColorButton.setContentAreaFilled(false);
        chooseColorButton.setFocusPainted(false);
        chooseColorButton.setVerifyInputWhenFocusTarget(false);
        chooseColorButton.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                chooseColorButtonHierarchyChanged(evt);
            }
        });
        chooseColorButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chooseColorButtonStateChanged(evt);
            }
        });
        chooseColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorButtonActionPerformed(evt);
            }
        });
        chooseColorButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chooseColorButtonPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaintBrushBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Separator)
                        .addGap(619, 619, 619))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(functionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(undoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paintModeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eraserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rectangleButton)
                            .addComponent(pencliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solidCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dottedCheckBox))
                            .addComponent(ovalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(chooseColorButton)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton)
                            .addComponent(functionsLabel)
                            .addComponent(undoButton)
                            .addComponent(paintModeLabel)
                            .addComponent(lineButton)
                            .addComponent(rectangleButton)
                            .addComponent(ovalButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eraserButton)
                            .addComponent(solidCheckBox)
                            .addComponent(dottedCheckBox)
                            .addComponent(pencliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addComponent(chooseColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaintBrushBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        chooseColorButton.getAccessibleContext().setAccessibleParent(chooseColorButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        drawingPanel.clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        drawingPanel.undo();
    }//GEN-LAST:event_undoButtonActionPerformed

    private void greenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenbuttonActionPerformed
        drawingPanel.setCurrentColor(Color.GREEN);
    }//GEN-LAST:event_greenbuttonActionPerformed

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        drawingPanel.setCurrentMode(BrushMode.Line);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        drawingPanel.setCurrentMode(BrushMode.Rectangle);
    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void ovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalButtonActionPerformed
        drawingPanel.setCurrentMode(BrushMode.Oval);
    }//GEN-LAST:event_ovalButtonActionPerformed

    private void pencliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencliButtonActionPerformed
        drawingPanel.setCurrentMode(BrushMode.Pencil);
    }//GEN-LAST:event_pencliButtonActionPerformed

    private void eraserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserButtonActionPerformed
        drawingPanel.setCurrentMode(BrushMode.Eraser);
    }//GEN-LAST:event_eraserButtonActionPerformed

    private void solidCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solidCheckBoxActionPerformed
        drawingPanel.setSolid(solidCheckBox.isSelected());
    }//GEN-LAST:event_solidCheckBoxActionPerformed

    private void dottedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dottedCheckBoxActionPerformed
        drawingPanel.setDotted(dottedCheckBox.isSelected());
    }//GEN-LAST:event_dottedCheckBoxActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        drawingPanel.setCurrentColor(Color.BLACK);
    }//GEN-LAST:event_blackButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        drawingPanel.setCurrentColor(Color.RED);
    }//GEN-LAST:event_redButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        drawingPanel.setCurrentColor(Color.BLUE);
    }//GEN-LAST:event_blueButtonActionPerformed

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    private void chooseColorButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chooseColorButtonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseColorButtonPropertyChange

    private void chooseColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorButtonActionPerformed
        Color selectedColor = JColorChooser.showDialog(this, "Choose a Color", Color.BLACK);
        if (selectedColor != null) {
            drawingPanel.setCurrentColor(selectedColor);
        }
    }//GEN-LAST:event_chooseColorButtonActionPerformed

    private void chooseColorButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chooseColorButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseColorButtonStateChanged

    private void chooseColorButtonHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_chooseColorButtonHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseColorButtonHierarchyChanged

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
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintBrush().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaintBrushBody;
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton blackButton;
    private javax.swing.JButton blueButton;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JCheckBox dottedCheckBox;
    private javax.swing.JButton eraserButton;
    private javax.swing.JLabel functionsLabel;
    private javax.swing.JButton greenbutton;
    private javax.swing.JButton lineButton;
    private javax.swing.JButton ovalButton;
    private javax.swing.JLabel paintModeLabel;
    private javax.swing.JButton pencliButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JCheckBox solidCheckBox;
    private javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}