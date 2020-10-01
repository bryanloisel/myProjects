
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class calculator {

	double firstnum, secondnum, result;
	String operation, ans;

	public static void main(String args[]) {
		new calculator();
	}

	public calculator() {

		JTextField numField = new JTextField();
		numField.disable();

		JLabel label1 = new JLabel();

		JButton numBtn1 = new JButton("1");
		JButton numBtn2 = new JButton("2");
		JButton numBtn3 = new JButton("3");
		JButton numBtn4 = new JButton("4");
		JButton numBtn5 = new JButton("5");
		JButton numBtn6 = new JButton("6");
		JButton numBtn7 = new JButton("7");
		JButton numBtn8 = new JButton("8");
		JButton numBtn9 = new JButton("9");
		JButton numBtn0 = new JButton("0");
		JButton decimal = new JButton(".");

		JButton clcwrkspce = new JButton("CE");
		JButton closeAll = new JButton("C");
		JButton bckspce = new JButton("<-");

		JButton equals = new JButton("=");
		JButton minus = new JButton("-");
		JButton plus = new JButton("+");
		JButton multiply = new JButton("x");
		JButton divide = new JButton("/");

		JPanel calcPanel = new JPanel();
		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setSize(350, 300);
		frame.add(calcPanel);

		calcPanel.setLayout(new MigLayout());

		calcPanel.add(label1, "wrap");
		calcPanel.add(numField, "wrap, span, growx");// Wrap causes num Field to be the last in its row, span and growx
														// allow it to fill the entire row
		calcPanel.add(bckspce);
		calcPanel.add(clcwrkspce);
		calcPanel.add(closeAll);
		calcPanel.add(plus, "wrap");
		calcPanel.add(numBtn7);
		calcPanel.add(numBtn8);
		calcPanel.add(numBtn9);
		calcPanel.add(divide, "wrap");
		calcPanel.add(numBtn4);
		calcPanel.add(numBtn5);
		calcPanel.add(numBtn6);
		calcPanel.add(multiply, "wrap");
		calcPanel.add(numBtn1);
		calcPanel.add(numBtn2);
		calcPanel.add(numBtn3);
		calcPanel.add(minus, "wrap");
		calcPanel.add(numBtn0, "span 2, growx");// span 2 allows it to span for 2 spaces
		calcPanel.add(decimal);
		calcPanel.add(equals);

		bckspce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (numField.getText().length() > 0)// If the text field is not empty
					numField.setText(numField.getText().substring(0, numField.getText().length() - 1));

			}
		});

		numBtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "0");

			}
		});

		numBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "1");

			}
		});

		numBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "2");

			}
		});

		numBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "3");

			}
		});

		numBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "4");

			}
		});

		numBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "5");

			}
		});

		numBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "6");

			}
		});

		numBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "7");

			}
		});

		numBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "8");

			}
		});

		numBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + "9");

			}
		});

		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText(numField.getText() + ".");

			}
		});

		clcwrkspce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText("");

			}
		});

		closeAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numField.setText("");
				label1.setText("");;
				firstnum = 0;
				secondnum = 0;
				result = 0;
				operation = "" ;
				ans = "";

			}
		});
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(numField.getText());
				numField.setText("");
				operation = "+";

			}
		});

		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(numField.getText());
				numField.setText("");
				operation = "-";
			}
		});

		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(numField.getText());
				numField.setText("");
				operation = "x";
			}
		});

		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(numField.getText());
				numField.setText("");
				operation = "/";
			}
		});

		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				secondnum = Double.parseDouble(numField.getText());
				if (operation == "+") {
					result = firstnum + secondnum;
					answer = Double.toString(result);
					numField.setText(answer);
				}

				else if (operation == "-") {
					result = firstnum - secondnum;
					answer = Double.toString(result);
					numField.setText(answer);
				}

				else if (operation == "-") {
					result = firstnum - secondnum;
					answer = Double.toString(result);
					numField.setText(answer);
				}

				else if (operation == "x") {
					result = firstnum * secondnum;
					answer = Double.toString(result);
					numField.setText(answer);
				}

				else if (operation == "/") {
					result = firstnum/secondnum;
					answer = Double.toString(result);
					numField.setText(answer);

				}

			}
		});

	}

}
