package Interview;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea {
	
    TextArea(){
		JFrame f = new JFrame();
		JTextArea area = new JTextArea("Text Area");
		area.setBounds(10,30,200,200);
		f.add(area);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
             new TextArea(); {
            	 
             }
	}

}
