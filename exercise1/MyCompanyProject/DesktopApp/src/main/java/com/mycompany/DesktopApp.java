/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author faraa
 */
public class DesktopApp extends JFrame {
    static String appName = CommonUtility.getAppName();

    public DesktopApp() throws HeadlessException {
        super(appName);
        init();
    }
    
    private void init() {
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + appName));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}
