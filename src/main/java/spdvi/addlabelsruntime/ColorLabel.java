/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi.addlabelsruntime;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author Miguel
 */
public class ColorLabel extends JLabel{

    @Override
    public Graphics getGraphics() {
        return super.getGraphics(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean mouseEnter(Event evt, int x, int y) {
        this.setForeground(Color.red);
        return super.mouseEnter(evt, x, y); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean mouseExit(Event evt, int x, int y) {
        this.setForeground(Color.black);
        return super.mouseExit(evt, x, y); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
