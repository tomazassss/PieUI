package com.sumskas.pie.ui;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Core 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Start...");
		MainWindow window = new MainWindow();
		showOnScreen2(1, window.getMainWindow());
	}
	
	public static void showOnScreen2( int screen, JFrame frame ) 
	{
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice[] gd = ge.getScreenDevices();
	    if( screen > -1 && screen < gd.length ) 
	    {
	    	frame.setLocation(gd[screen].getDefaultConfiguration().getBounds().x, frame.getY());
	    } 
	    else if( gd.length > 0 ) 
	    {
	        frame.setLocation(gd[0].getDefaultConfiguration().getBounds().x, frame.getY());
	    } 
	    else 
	    {
	        throw new RuntimeException( "No Screens Found" );
	    }
	}
}
