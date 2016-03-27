package no.kitttn.presenter;

import no.kitttn.model.TableLamp;
import no.kitttn.view.TableLampView;
import rx.Observable;

/**
 * @author kitttn
 */
public class TableLampPresenter {
	private TableLampView view;
	private TableLamp lamp = new TableLamp();

	public void setView(TableLampView view) {
		this.view = view;
	}

	public void turnLightOn() {
		System.out.println("Presenter: Turning lamp on...");
		lamp.turnOn().subscribe(res -> {
			if (res)
				view.showSuccess();
			else view.showError("Can't turn on light!");
		});
	}

	public void turnOff() {
		lamp.turnOff();
	}
}
