package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class MemberListGUI implements ActionListener {

	JFrame frame = new JFrame("Medlems liste");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JButton btn1 = new JButton("Tilføj");
	JButton btn2 = new JButton("log ud");
	
	Object rowData[][] = { { "Ahmed" }, { "Niki" }, { "Dan" }, { "Peter" } };
	Object columnNames[] = { "Medlemmer" };
	JTable table = new JTable(rowData, columnNames);

	public MemberListGUI() {

		frame.setSize(new Dimension(800, 800));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(btn1, BorderLayout.EAST);
		panel.add(btn2);
		jTable();

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn2) {
			frame.dispose();
		}

		if (e.getSource() == btn1) {
			int selectedRowIndex = table.getSelectedRow();
			int selectedColumnIndex = table.getSelectedColumn();
			Object selectedObject = (Object) table.getModel().getValueAt(selectedRowIndex, selectedColumnIndex);
			System.out.println(selectedObject);
		}
	}

	public void jTable() {
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane, BorderLayout.CENTER);
	}
}