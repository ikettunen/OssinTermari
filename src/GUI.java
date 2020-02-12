import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.awt.Color;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 458, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 97, 209, 156);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblVaraajanLmptila = new JLabel("Varaajan lämpötila");
		lblVaraajanLmptila.setBounds(40, 27, 128, 15);
		panel.add(lblVaraajanLmptila);
		
		JLabel label = new JLabel("89");
		label.setBounds(50, 50, 112, 94);
		label.setFont(new Font("Dialog", Font.BOLD, 80));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(233, 97, 195, 156);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("60");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 80));
		lblNewLabel.setBounds(33, 52, 129, 79);
		panel_1.add(lblNewLabel);
		
		JLabel lblKierukanLmptila = new JLabel("Kierukan lämpötila");
		lblKierukanLmptila.setBounds(33, 25, 129, 15);
		panel_1.add(lblKierukanLmptila);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 265, 209, 78);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPumpunPysytysLmp = new JLabel("Pumpun pysäytys lämpö");
		lblPumpunPysytysLmp.setBounds(9, 5, 169, 15);
		panel_2.add(lblPumpunPysytysLmp);
		
		JLabel label_1 = new JLabel("61");
		label_1.setFont(new Font("Dialog", Font.BOLD, 48));
		label_1.setBounds(19, 24, 72, 54);
		panel_2.add(label_1);
		
		JButton button = new JButton("+");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String i = label_1.getText();
				int b = Integer.parseInt(i);
				b++;
				label_1.setText(Integer.toString(b));
			}
		});
		button.setBounds(95, 24, 102, 25);
		panel_2.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String i = label_1.getText();
				int b = Integer.parseInt(i);
				b--;
				label_1.setText(Integer.toString(b));
			}
		});
		button_1.setBounds(95, 51, 102, 25);
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(233, 265, 195, 78);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPumpunKynnistyslmp = new JLabel("Pumpun käynnistyslämpö");
		lblPumpunKynnistyslmp.setBounds(0, 0, 195, 26);
		panel_3.add(lblPumpunKynnistyslmp);
		
		JLabel label_2 = new JLabel("54");
		label_2.setFont(new Font("Dialog", Font.BOLD, 40));
		label_2.setBounds(0, 23, 79, 43);
		panel_3.add(label_2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(81, 22, 79, 25);
		panel_3.add(btnNewButton);
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(81, 41, 79, 25);
		panel_3.add(button_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Virta sensoreille");
		rdbtnNewRadioButton.setForeground(Color.GREEN);
		rdbtnNewRadioButton.setBounds(12, 8, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBounds(12, 35, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(12, 62, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
	}
}
