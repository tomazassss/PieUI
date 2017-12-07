package com.sumskas.pie.ui.keycommands;

import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent input) {
		char key = input.getKeyChar();
        if (key == 'x') System.exit(0);
	}

}
