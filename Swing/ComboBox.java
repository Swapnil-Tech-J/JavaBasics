package Interview;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
	
	JFrame f;
	ComboBox(){
		f=new JFrame("ComboBox");
		String country[] = {"India", "Aus", "USA", "England", "Newzealand"};
		JComboBox cb = new JComboBox(country);
		cb.setBounds(50,50,90,20);
		f.add(cb);
		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		
         new ComboBox();{
        	 }
         }

}
