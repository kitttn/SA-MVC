import javax.swing.*;

import java.awt.event.*;

public class SquareView extends JFrame {
	private JTextField input = new JTextField(5);
	private JTextField output = new JTextField(10);
	private JButton sqrBtn = new JButton("Square");
	//
	private SquareModel M;

	public SquareView(SquareModel m) {
		M = m;

		// Layout
		JPanel content = new JPanel();
		content.add(input);
		content.add(sqrBtn);
		content.add(output);
		//
		this.setContentPane(content);
		this.pack();

		sqrBtn.addActionListener(t -> squareListener());
		input.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clearListener();
			}
		});
		//
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public String getNumber() {
		return input.getText();
	}

	public void setNumber(String v) {
		output.setText(v);
	}

	public void squareListener() {
		String userinput = getNumber();
		M.setValue(Integer.parseInt(userinput));
		setNumber(Integer.toString(M.square()));
	}

	public void clearListener() {
		setNumber("");
	}
}
