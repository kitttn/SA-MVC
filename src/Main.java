/**
 * Question #1
 * Rendering in this app is fully controlled by View, because the Model is fully stand-alone and should work even without View.
 * Here we're using View for displaying results.
 *
 * Let's assume this is main thread:
 * ==============================================>
 * What we have, is a Listener, which handles button clicks (&). Let's display them:
 *
 * ==============================================>
 * 		&					&		&
 *
 * When these button clicks are happened, controller takes current input from View, sets to Model,
 * Model calculates result and Controller sets output from Model to View. In fact, we can remove Model
 * from View implementation, but it is another pattern, called Model-View-Presenter, which is a bit
 * more strict (and though, clearer :))
 *
 * Let's think these as signals:
 * 1. User click - &
 * 2. Controller takes input - %
 * 3. Controller sets output - $
 * 4. Model thread with calculations - ########>
 * 5. UI thread - =====>
 *
 * We have next diagram:
 *
 * ======================================================>
 *     &								 $
 *      % ############################> $
 *
 * This is how rendering is achieved: through the controller, which dispatches the result
 * from Model to View and vice-versa.
 */
public class Main {
	public static void main(String[] args) {
		SquareModel M = new SquareModel();
		SquareView V = new SquareView(M);
		SquareController C = new SquareController(M, V);
		V.setVisible(true);
	}
}
