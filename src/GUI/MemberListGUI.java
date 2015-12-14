package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MemberListGUI implements ActionListener {

	JFrame frame = new JFrame("Medlems liste");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JButton btn1 = new JButton ("Tilføj");
	JButton btn2 = new JButton("log ud");
	
	public MemberListGUI() {

		frame.setSize(new Dimension(300, 300));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(btn1, BorderLayout.EAST);
		//frame.pack();
		panel.add(btn2);
		
        
        frame.setVisible(true);
	}
        
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == btn2){
                frame.dispose();
            }

	}
}

