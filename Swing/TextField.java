package Interview;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Text Field");
		JTextField t1,t2;
		t1 = new JTextField("Text Field 1");
		t1.setBounds(50,100,200,30);
		t2 = new JTextField("Text Field 2");
		t2.setBounds(50,150,200,30);
		f.add(t1); f.add(t2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
