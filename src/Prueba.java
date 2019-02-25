import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

import javax.swing.*;

class operaciones {
	public String cAF(int numero) {
		return ((1.8 * numero) + 32) + "";
	}

	public String cAK(int numero) {
		return (numero + 273.15) + "";
	}

	public String cAR(int numero) {
		return (((9 * numero) / 5) + 491.67) + "";
	}

	public String fAC(int numero) {
		return ((numero - 32) / 1.8) + "";
	}

	public String fAK(int numero) {
		return ((numero + 459.67) / 1.8) + "";
	}

	public String fAR(int numero) {
		return (numero + 459.67) + "";
	}

	public String kAC(int numero) {
		return (numero - 273.15) + "";
	}

	public String kAF(int numero) {
		return ((1.8 * (numero - 273.15)) + 32) + "";
	}

	public String kAR(int numero) {
		return (((9 * (numero - 273.15)) / 5) + 491.67) + "";
	}

	public String rAC(int numero) {
		return ((5 * (numero - 491.67)) / 9) + "";
	}

	public String rAF(int numero) {
		return (numero - 459367) + "";
	}

	public String rAK(int numero) {
		return (((5 * (numero - 491.67)) / 9) + 273.15) + "";
	}

}

class conversor extends JFrame implements ActionListener, KeyListener {

	JTextField cajaConvertir, cajaResultado;
	JComboBox<String> combo1, combo2;

	public conversor() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 150);
		setTitle("Conversor: ");
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel lblConvertir = new JLabel("Convertir: ");
		add(lblConvertir);

		cajaConvertir = new JTextField(10);
		cajaConvertir.addActionListener(this);
		cajaConvertir.addKeyListener(this);
		add(cajaConvertir);

		combo1 = new JComboBox<String>();
		combo1.addActionListener(this);
		combo1.addItem("Centigrados");
		combo1.addItem("Fahrenheit");
		combo1.addItem("Kelvin");
		combo1.addItem("Rankine");
		add(combo1);

		JLabel lblA = new JLabel("A: ");
		add(lblA);

		combo2 = new JComboBox<String>();
		combo2.addActionListener(this);
		add(combo2);

		cajaResultado = new JTextField(10);
		cajaResultado.addActionListener(this);
		add(cajaResultado);

	}

	char numero;

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		try {
			Integer.parseInt(cajaConvertir.getText());
			numero = cajaConvertir.getText().charAt(0);
			/*
			 * if (!Character.isDigit(numero)) {
			 * 
			 * }
			 */} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(rootPane, "No es un número");
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String VCentigrados[] = { "Fahrenheit", "Kelvin", "Rankine" };
		String VFahrenheit[] = { "Centigrados", "Kelvin", "Rankine" };
		String VKelvin[] = { "Fahrenheit", "Centigrados", "Rankine" };
		String VRankine[] = { "Fahrenheit", "Kelvin", "Centigrados" };

		if (e.getSource() == combo1) {
			if (combo1.getSelectedItem().equals("Centigrados")) {
				for (String x : VCentigrados) {
					combo2.addItem(x);
				}
				if (combo2.getSelectedItem().equals("Fahrenheit")) {

				}
				if (combo2.getSelectedItem().equals("Kelvin")) {

				}
				if (combo2.getSelectedItem().equals("Rankine")) {

				}

			} else if (combo1.getSelectedItem().equals("Fahrenheit")) {
				for (String x : VFahrenheit) {
					combo2.addItem(x);
				}

				if (combo2.getSelectedItem().equals("Centigrados")) {

				}

				if (combo2.getSelectedItem().equals("Kelvin")) {

				}

				if (combo2.getSelectedItem().equals("Rankine")) {

				}
			} else if (combo1.getSelectedItem().equals("Kelvin")) {
				for (String x : VKelvin) {
					combo2.addItem(x);
				}
				if (combo2.getSelectedItem().equals("Fahrenheit")) {

				}
				if (combo2.getSelectedItem().equals("Centigrados")) {

				}

				if (combo2.getSelectedItem().equals("Rankine")) {

				}
			} else if (combo1.getSelectedItem().equals("Rankine")) {
				for (String x : VRankine) {
					combo2.addItem(x);
				}
				if (combo2.getSelectedItem().equals("Fahrenheit")) {

				}
				if (combo2.getSelectedItem().equals("Centigrados")) {

				}
				if (combo2.getSelectedItem().equals("Kelvin")) {

				}
			}
		}

	}

}

public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new conversor();
			}
		});
	}
}
