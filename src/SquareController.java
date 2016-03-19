import java.awt.event.*;

public class SquareController {
	private SquareView V;
	private SquareModel M;

	public SquareController(SquareModel m, SquareView v) {
		M = m;
		V = v;
		// adding listener to the view
		v.addSquareListener(new MyListener());
		v.addClearListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				V.setNumber("");
			}
		});
	}

	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String userinput = V.getNumber();
			M.setValue(Integer.parseInt(userinput));
			V.setNumber(Integer.toString(M.square()));
		}
	}
}
