package GUI;

import javax.swing.UIManager;

public class MainGUI {
	public static void main(String[] args){
		try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
		new MemberListGUI();		
	}
}