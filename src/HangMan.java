import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener {

	ArrayList<String> wordz = new ArrayList<String>();

	// JLabel label = new JLabel();

	ArrayList<JLabel> boxes = new ArrayList<JLabel>();

	public static void main(String[] args) {

		HangMan hangman = new HangMan();

		hangman.addStuff();
		
		hangman.frame();
	}
	public void addStuff() {

		wordz.add("xylophone");

		wordz.add("because");

		wordz.add("");

	}


	public void frame() {

		JFrame frame = new JFrame("Hangman");

		frame.setVisible(true);
		
		frame.setSize(200, 200);

		JPanel panel = new JPanel();

		panel.setVisible(true);

		frame.add(panel);

		panel.addKeyListener(this);
		
		System.out.println("Hello");

		//int rand = new Random().nextInt(wordz.size());
		

		for (int i = 0; i < wordz.get(0).length(); i++) {

			JLabel label = new JLabel();

			label.setText("_");

			panel.add(label);

		}

	}
	
	private void updateSpacesWithUserInput(char keyChar) {
		for (int i = 0; i < ((CharSequence) wordz).length(); i++) {
			if (((CharSequence) wordz).charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

		updateSpacesWithUserInput(arg0.getKeyChar());
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
