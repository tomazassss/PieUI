package com.sumskas.pie.ui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.JFrame;

import com.sumskas.pie.ui.keycommands.KeyListener;

public class MainWindow
{
	private static final long serialVersionUID = 1L;
	
	private JFrame mainWindow;

	public MainWindow()
	{
		mainWindow = new JFrame("Warlock PieUI");
		
		addElements();
		addKeyListener();
		
		mainWindow.setExtendedState(Frame.MAXIMIZED_BOTH);
		mainWindow.setUndecorated(true);
		mainWindow.toFront();
		mainWindow.setAlwaysOnTop(true);
		mainWindow.pack();
		mainWindow.setVisible(true);
	}

	private void addElements() 
	{
		Label testLabel = new Label("Wow... Much Content such screen. To close press X");
		mainWindow.getContentPane().add(testLabel, BorderLayout.CENTER);
	}
	
	private void addKeyListener()
	{
		mainWindow.addKeyListener(new KeyListener());
	}
	
	public JFrame getMainWindow()
	{
		return mainWindow;
	}
}
