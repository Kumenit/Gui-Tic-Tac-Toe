package guitic;

import javax.swing.JFrame;

public class fream{
	public fream()
	{
		JFrame fr=new JFrame();
		panal p=new panal();
		fr.add(p);
		fr.setTitle("gui tictoc");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.pack();
		fr.setVisible(true);
		fr.setLocationRelativeTo(null);
	}
	

}
