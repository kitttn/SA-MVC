package no.kitttn.view;

import no.kitttn.presenter.TableLampPresenter;

/**
 * @author kitttn
 */
public class TableLampView {
	private TableLampPresenter presenter = new TableLampPresenter();

	public void showError(String message) {
		System.out.println("View: Can't turn on the light!");
	}

	public void showSuccess() {
		System.out.println("View: Turned light on!");
	}

	public TableLampView() {
		presenter.setView(this);
	}

	public void turnLightOn() {
		presenter.turnLightOn();
	}

	public void turnLightOff() {
		presenter.turnOff();
	}
}
