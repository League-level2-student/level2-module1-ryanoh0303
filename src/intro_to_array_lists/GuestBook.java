package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	ArrayList<String> array= new ArrayList<String> ();

	
	JFrame jframe= new JFrame("Two buttons");
	JPanel jpanel= new JPanel();
	JButton jbutton1= new JButton("Add Name");
	JButton jbutton2= new JButton("View Names");

	
	public static void main(String[] args) {
		GuestBook guest= new GuestBook();
		guest.initialize();
	}
	
	
	public void initialize() {
		jframe.setSize(800,800);	
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		jframe.add(jpanel);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		jbutton1.addActionListener(this);
		jbutton2.addActionListener(this);
		array.add("Bob Banders");
		array.add("Sandy Summers");
		array.add("Greg Ganders");
		array.add("Donny Doners");
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbutton1) {
			String y= JOptionPane.showInputDialog("Enter a name");
			array.add(y);
		}
		if(e.getSource()==jbutton2) {
			JOptionPane.showMessageDialog(null, array.toString());
		}
		
	}
	
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
