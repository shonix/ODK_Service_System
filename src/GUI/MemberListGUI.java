package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberListGUI implements ActionListener {

	JFrame frame = new JFrame("Medlems liste");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JButton btnTilfoej = new JButton("Tilføj");
	JButton btn2 = new JButton("log ud");
	
	private int selectedRow = 0;
	
	Object rowData[][] = { { "Ahmed" }, { "Niki" }, { "Dan" }, { "Peter" } };
	Object columnNames[] = { "Medlemmer" };
	JTable table = new JTable(rowData, columnNames);
	private boolean isListenerActive;

	public MemberListGUI() {

		frame.setSize(new Dimension(400, 400));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(btnTilfoej, BorderLayout.EAST);
		btnTilfoej.addActionListener(this);
		panel.add(btn2);
		jTable();

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnTilfoej){
			String name = null;
			selectedRow = table.getSelectedRow();
			try {
				name = (String) (table.getValueAt(selectedRow, 0));
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException e1) {
				JOptionPane.showMessageDialog(frame, "Intet medlem er valgt.");
			}
			if(selectedRow > -1){
				//Gør ting her.
				System.out.println(name);
			}
		}
		if (e.getSource() == btn2) {
			frame.dispose();
		}
//		else if (e.getSource() == btnTilfoej) {
//			int selectedRowIndex = table.getSelectedRow();
//			int selectedColumnIndex = table.getSelectedColumn();
//			Object selectedObject = (Object) table.getModel().getValueAt(selectedRowIndex, selectedColumnIndex);
//			if(selectedRow > -1){
//				//Gør ting her.
//				System.out.println(selectedObject);
//			}
//		}
		
	}

	public void jTable() {
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane, BorderLayout.CENTER);
	}
}