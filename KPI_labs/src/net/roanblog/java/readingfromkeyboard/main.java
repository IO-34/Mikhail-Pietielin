/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.roanblog.java.readingfromkeyboard;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrator
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            char c = (char) System.in.read();
            System.out.println(c);
        } catch (IOException ex) {
            System.err.println("ERR");
        }
    }
}
