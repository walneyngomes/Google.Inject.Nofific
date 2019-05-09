package Injector;

import org.picocontainer.annotations.Inject;

import br.com.pico.map.ney.Nofification;

public class AppPoolWatcher {
    @Inject
	Nofification action;

	public Nofification getAction() {
		return action;
	}

	public void setAction(Nofification action) {
		this.action = action;
	}

	public void notificar() {
		action.ActOnNotification();
	}

}
