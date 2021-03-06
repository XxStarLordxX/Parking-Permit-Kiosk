package a1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;




public class a1
{
	public static void main(String[] args)
	{
		DemoSwingFrame frame = new DemoSwingFrame();
		frame.setTitle("York Parking Permit Kiosk");
		frame.pack();

		// put the frame in the middle of the display
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

		frame.setVisible(true);
	}
}

// -----------------------------
// define the application window
// -----------------------------

class DemoSwingFrame extends JFrame implements ActionListener, FocusListener
{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> SNs = new ArrayList<String>();
	private ArrayList<String> PINs = new ArrayList<String>();
	private ArrayList<String> FNs = new ArrayList<String>();
	private ArrayList<String> GNs = new ArrayList<String>();
	private ArrayList<String> status = new ArrayList<String>();
	

	private GridBagConstraints c = new GridBagConstraints();
	private JButton p1_startButton;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;

	private JButton p2_Next;
	private JButton p2_1 = new JButton("1");
	private JButton p2_2 = new JButton("2");
	private JButton p2_3 = new JButton("3");
	private JButton p2_4 = new JButton("4");
	private JButton p2_5 = new JButton("5");
	private JButton p2_6 = new JButton("6");
	private JButton p2_7 = new JButton("7");
	private JButton p2_8 = new JButton("8");
	private JButton p2_9 = new JButton("9");
	private JButton p2_0 = new JButton("0");
	private JButton p2_Clear = new JButton("Clear");
	private JButton p2_C = new JButton("<--");
	private StringBuffer SN = new StringBuffer("Please Enter Your Student Number      ");
	private StringBuffer PIN = new StringBuffer("Please Enter Your PIN");
	private JTextField p2_SNInput = new JTextField(SN.toString());
	private JTextField p2_PINInput = new JTextField(PIN.toString());
	private JLabel p2_SN_error = new JLabel();
	private JLabel p2_PIN_error = new JLabel();
	private boolean isSN = false;
	private boolean isPIN = false;
	
	private JButton p3_Next;
	private JButton p3_Back = new JButton("Back");
	private JButton p3_1 = new JButton("1");
	private JButton p3_2 = new JButton("2");
	private JButton p3_3 = new JButton("3");
	private JButton p3_4 = new JButton("4");
	private JButton p3_5 = new JButton("5");
	private JButton p3_6 = new JButton("6");
	private JButton p3_7 = new JButton("7");
	private JButton p3_8 = new JButton("8");
	private JButton p3_9 = new JButton("9");
	private JButton p3_0 = new JButton("0");
	private JButton p3_q = new JButton("q");
	private JButton p3_w = new JButton("w");
	private JButton p3_e = new JButton("e");
	private JButton p3_r = new JButton("r");
	private JButton p3_t = new JButton("t");
	private JButton p3_y = new JButton("y");
	private JButton p3_u = new JButton("u");
	private JButton p3_i = new JButton("i");
	private JButton p3_o = new JButton("o");
	private JButton p3_p = new JButton("p");
	private JButton p3_a = new JButton("a");
	private JButton p3_s = new JButton("s");
	private JButton p3_d = new JButton("d");
	private JButton p3_f = new JButton("f");
	private JButton p3_g = new JButton("g");
	private JButton p3_h = new JButton("h");
	private JButton p3_j = new JButton("j");
	private JButton p3_k = new JButton("k");
	private JButton p3_l = new JButton("l");
	private JButton p3_z = new JButton("z");
	private JButton p3_x = new JButton("x");
	private JButton p3_c = new JButton("c");
	private JButton p3_v = new JButton("v");
	private JButton p3_b = new JButton("b");
	private JButton p3_n = new JButton("n");
	private JButton p3_m = new JButton("m");
	private JButton p3_at = new JButton("@");
	private JButton p3_dot = new JButton(".");
	private JButton p3_CapsLock = new JButton("Caps");
	private JButton p3_Clear = new JButton("Clear");
	private JButton p3_C = new JButton("<--");
	private StringBuffer email = new StringBuffer("Please Enter Your Email Address");
	private JTextField p3_email = new JTextField(email.toString());
	
	
	
	private String step_template_head = "<html><b><h1 style="
			+ "\"font-size:25px;margin-left: 20px; margin-right: 20px; margin-top: 20px; margin-bottom: 20px\">" ;
	private String step_template_tail = "</h1></b></html>";
	private ImageIcon logo1 = new ImageIcon("images/logo1.png");
	private ImageIcon logo2 = new ImageIcon("images/logo2.png");

	// -----------
	// constructor
	// -----------

	public DemoSwingFrame()
	{
		 String line;
		 BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("databases/students.txt"));
			while((line = br.readLine()) != null){
				String[] temp = line.split(",");
				SNs.add(temp[0].trim());
				PINs.add(temp[1].trim());
				FNs.add(temp[2].trim());
				GNs.add(temp[3].trim());
				status.add(temp[4].trim());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
// -------------------------------------------------------------------------------------------------------
//									 		The first panel.
//-------------------------------------------------------------------------------------------------------

		JPanel p1_subP1 = new JPanel();
		JLabel p1_yorkuParking;
		JLabel p1_pic;
		
		
		// -------------------------------
		// create and configure components
		// -------------------------------


		p1_yorkuParking = new JLabel("<html><b>" + "<h1 style="
				+ "\"font-size:45px;margin-left: 50px; margin-right: 50px; margin-top: 0px; margin-bottom: 50px\"" 
				+ "<font color = \"Black\">Y</font>" 
				+ "<font color = \"Black\">ork</font>"
				+ "<font color = \"Red\">U </font>"
				+ "<font color = \"Red\">P</font>"
				+ "<font color = \"Black\">arking</font>" + "</h1></b></html>");
		p1_yorkuParking.setHorizontalAlignment(SwingConstants.CENTER);
		
		p1_pic = new JLabel(logo1);
		
		p1_startButton = new JButton("<html> <h1 style=\"color:white;"
				+ "font-size:20px;margin-left: 30px; margin-right: 30px; margin-top: 50px; margin-bottom: 50px"
				+ "\">Start</h1></html>");
				
		p1_startButton.setPreferredSize(new Dimension(400, 60));
		p1_startButton.setBackground(Color.RED);
		p1_startButton.setFocusPainted(false);

		// -------------
		// add listeners
		// -------------

		p1_startButton.addActionListener(this);
		this.addWindowListener(new WindowCloser());

		// ------------------
		// arrange components
		// ------------------

		// put components in a panel

		p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		p1.setBorder(BorderFactory.createEmptyBorder(100, 100, 10, 100));
		p1.setLayout(new GridLayout(3, 1));
		
		
		
		
		p1_subP1.add(p1_startButton);
		p1_subP1.setBackground(Color.WHITE);
		p1_subP1.add(p1_startButton);
		

		p1.add(p1_pic);
		p1.add(p1_yorkuParking);
		p1.add(p1_subP1);

		// make the panel this extended JFrame's content pane

		this.setContentPane(p1);
		
		
		
// -------------------------------------------------------------------------------------------------------
//										 The second panel.
// -------------------------------------------------------------------------------------------------------
		
		JPanel p2_subP1 = new JPanel(new GridLayout(5, 1));
		p2_subP1.setBackground(Color.WHITE);
		JPanel p2_subP2 = new JPanel(new GridLayout(4, 3));
		JLabel p2_pic;
		JLabel p2_step = new JLabel(step_template_head + "Step 1: " +
		"Personal Information" + step_template_tail);
		
		p2_1.setPreferredSize(new Dimension(50, 45));
		
		p2 = new JPanel(new GridBagLayout());
		p2.setBackground(Color.WHITE);
		p2.setPreferredSize(p1.getPreferredSize());
		
		// The logo at top of the panel;
		p2_pic = new JLabel(new ImageIcon(logo2.getImage().getScaledInstance(400, 144, Image.SCALE_SMOOTH)));
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		p2.add(p2_pic, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		p2.add(p2_step, c);
		
		// The bottom-left sub-panel
		p2_SNInput.setPreferredSize(new Dimension(300, 35));
		p2_subP1.add(p2_SNInput);
		p2_subP1.add(p2_SN_error);
		p2_subP1.add(p2_PINInput);
		p2_subP1.add(p2_PIN_error);
		
		p2_Next = new JButton("Next");
		p2_Next.addActionListener(this);
		p2_subP1.add(p2_Next);
		
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.weightx = 0.5;
		p2.add(p2_subP1, c);
		
		p2_SNInput.addFocusListener(this);
		p2_PINInput.addFocusListener(this);
		
		// The bottom-right sub-panel.
		p2_subP2.add(p2_1);
		p2_1.addActionListener(this);
		p2_subP2.add(p2_2);
		p2_2.addActionListener(this); 	
		p2_subP2.add(p2_3);
		p2_3.addActionListener(this);
		p2_subP2.add(p2_4);
		p2_4.addActionListener(this);
		p2_subP2.add(p2_5);
		p2_5.addActionListener(this);
		p2_subP2.add(p2_6);
		p2_6.addActionListener(this);
		p2_subP2.add(p2_7);
		p2_7.addActionListener(this);
		p2_subP2.add(p2_8);
		p2_8.addActionListener(this);
		p2_subP2.add(p2_9);
		p2_9.addActionListener(this);
		p2_subP2.add(p2_Clear);
		p2_Clear.addActionListener(this);
		p2_subP2.add(p2_0);
		p2_0.addActionListener(this);
		p2_subP2.add(p2_C);
		p2_C.addActionListener(this);
		
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.weightx = 0.5;
		p2.add(p2_subP2, c);
		
		
// -------------------------------------------------------------------------------------------------------
//		 										The third panel.
//-------------------------------------------------------------------------------------------------------
		
		JPanel p3_subP1 = new JPanel(new GridLayout(4, 1));
		p3_subP1.setBackground(Color.WHITE);
		JPanel p3_subP2 = new JPanel(new GridLayout(4, 3));
		JLabel p3_pic;
		JLabel p3_step = new JLabel(step_template_head + "Step 2: " +
		"Email Address (optional)" + step_template_tail);

		p3_1.setPreferredSize(new Dimension(50, 45));
		
		p3 = new JPanel(new GridBagLayout());
		p3.setBackground(Color.WHITE);
		p3.setPreferredSize(p2.getPreferredSize());
		
		// The logo at top of the panel;
		p3_pic = new JLabel(new ImageIcon(logo2.getImage().getScaledInstance(400, 144, Image.SCALE_SMOOTH)));
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		p3.add(p3_pic, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		p3.add(p3_step, c);

		// The bottom-left sub-panel
		p3_email.setPreferredSize(new Dimension(300, 35));
		p3_email.addFocusListener(this);
		
		p3_subP1.add(p3_email);
		p3_subP1.add(new JLabel());
		
		p3_Next = new JButton("Next");
		p3_Next.addActionListener(this);
		p3_subP1.add(p3_Next);
		p3_Back.addActionListener(this);
		p3_subP1.add(p3_Back);
		
		
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.weightx = 0.5;
		p3.add(p3_subP1, c);

		
		// The bottom-right sub-panel.
		p3_subP2.add(p3_1);
		p3_1.addActionListener(this);
		p3_subP2.add(p3_2);
		p3_2.addActionListener(this);
		p3_subP2.add(p3_3);
		p3_3.addActionListener(this);
		p3_subP2.add(p3_4);
		p3_4.addActionListener(this);
		p3_subP2.add(p3_5);
		p3_5.addActionListener(this);
		p3_subP2.add(p3_6);
		p3_6.addActionListener(this);
		p3_subP2.add(p3_7);
		p3_7.addActionListener(this);
		p3_subP2.add(p3_8);
		p3_8.addActionListener(this);
		p3_subP2.add(p3_9);
		p3_9.addActionListener(this);
		p3_subP2.add(p3_Clear);
		p3_Clear.addActionListener(this);
		p3_subP2.add(p3_0);
		p3_0.addActionListener(this);
		p3_subP2.add(p3_C);
		p3_C.addActionListener(this);
		
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.weightx = 0.5;
		p3.add(p3_subP2, c);
// -------------------------------------------------------------------------------------------------------
//				 								The forth panel.
//-------------------------------------------------------------------------------------------------------
		JPanel p4_subP1 = new JPanel(new GridLayout(4, 1));
		JPanel p4_subP2 = new JPanel(new GridLayout(4, 3));
		JLabel p4_pic;
		JLabel p4_step = new JLabel(step_template_head + "Step 2: " +
		"Email Address (optional)" + step_template_tail);

		
		
		p4 = new JPanel(new GridBagLayout());
		p4.setBackground(Color.WHITE);
		p4.setPreferredSize(p1.getPreferredSize());
		
		// The logo at top of the panel;
		p4_pic = new JLabel(new ImageIcon(logo2.getImage().getScaledInstance(400, 144, Image.SCALE_SMOOTH)));
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		p4.add(p4_pic, c);
	
	
	
	
	}

	// -------------------------------
	// implement ActionListener method
	// -------------------------------

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		
		if (ae.getSource() == p1_startButton){
			this.remove(p1);
			this.setContentPane(p2);
			this.pack();
		}
		
		
		/*
		 * Panel 2 buttons
		 */
		else if(ae.getSource() == p2_Next){

			if(SNs.contains(p2_SNInput.getText()) && 
					PINs.get(SNs.indexOf(p2_SNInput.getText())).equals(p2_PINInput.getText()) &&
					status.get(SNs.indexOf(p2_SNInput.getText())).equals("ok")){
				p2_SN_error.setText("");
				p2_PIN_error.setText("");
				this.remove(p2);
				this.setContentPane(p3);
				this.pack();
			}
			else if(!SNs.contains(p2_SNInput.getText())){
				p2_SN_error.setText("*Invalid Student Number!");
				p2_SN_error.setForeground(Color.RED);
				p2_PIN_error.setText("");
				Toolkit.getDefaultToolkit().beep();

			}
			else if(!PINs.get(SNs.indexOf(p2_SNInput.getText())).equals(p2_PINInput.getText())){
				System.out.println(PINs.get(SNs.indexOf(p2_SNInput.getText())));
				p2_PIN_error.setText("*Incorrect PIN!");
				p2_PIN_error.setForeground(Color.RED);
				p2_SN_error.setText("");
				Toolkit.getDefaultToolkit().beep();
			}
			else if(!status.get(SNs.indexOf(p2_SNInput.getText())).equals("ok")){
				p2_SN_error.setText("*Sorry, you have outstanding parking fines. Can not issue parking permit.");
				p2_SN_error.setForeground(Color.RED);
				p2_PIN_error.setText("");
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		else if(this.getContentPane().equals(p2) && ((JButton)ae.getSource()).getText() != "Clear" && 
				((JButton)ae.getSource()).getText() != "<--"){
			if(isSN && !isPIN){
				SN.append(((JButton)ae.getSource()).getText());
				p2_SNInput.setText(SN.toString());
			}
			else if(!isSN && isPIN){
				PIN.append(((JButton)ae.getSource()).getText());
				p2_PINInput.setText(PIN.toString());
			}
			
		}
		else if(ae.getSource() == p2_Clear){
			if(isSN && !isPIN){
				SN.delete(0, SN.length());
				p2_SNInput.setText(SN.toString());
			}
			else if(!isSN && isPIN){
				PIN.delete(0, PIN.length());
				p2_PINInput.setText(PIN.toString());
			}
			
		}
		else if(ae.getSource() == p2_C){
			if(isSN && !isPIN){
				if(SN.length() != 0)
					SN.deleteCharAt(SN.length() - 1);
				p2_SNInput.setText(SN.toString());
			}
			else if(!isSN && isPIN){
				if(PIN.length() != 0)
						PIN.deleteCharAt(PIN.length() - 1);
				p2_PINInput.setText(PIN.toString());
			}
			
		}
		/*
		 * Panel 3 buttons
		 */
		else if(ae.getSource() == p3_Next){
			this.remove(p3);
			this.setContentPane(p4);
			this.pack();
		}
		else if(ae.getSource() == p3_Back){
			this.remove(p3);
			this.setContentPane(p2);
			this.pack();
		}
			
	}
	@Override
	public void focusGained(FocusEvent fe) {

		if(fe.getSource() == p2_SNInput){
			isSN = true;
			isPIN = false;
			if(SN.toString().equals("Please Enter Your Student Number      ")){
				SN.delete(0, SN.length());
				p2_SNInput.setText(SN.toString());
			}
		}
		else if(fe.getSource() == p2_PINInput){
			isPIN = true;
			isSN = false;
			if(PIN.toString().equals("Please Enter Your PIN")){
				PIN.delete(0, PIN.length());
				p2_PINInput.setText(PIN.toString());
			}
		}
		else if(fe.getSource() == p3_email){
			if(email.toString().equals("Please Enter Your Email Address")){
				email.delete(0, email.length());
				p3_email.setText(email.toString());
			}
		}
	}

	@Override
	public void focusLost(FocusEvent fe) {
		// TODO Auto-generated method stub

	}

	// -------------
	// other methods
	// -------------

	// (no other methods in this demo program)

	// -------------
	// inner classes
	// -------------

	// Note: WindowAdapter implements WindowListener
	


	private class WindowCloser extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent event)
		{
			System.exit(0);
		}
	}

}