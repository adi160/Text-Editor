/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import javax.swing.JFrame;

/**
 *
 * @author Rupak Kalita
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        textedit frame = new textedit();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
