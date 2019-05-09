package Teste;

import java.util.ArrayList;
import java.util.List;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

import Injector.AppPoolWatcher;
import br.com.pico.map.ney.Email;
import br.com.pico.map.ney.EventLogWriter;
import br.com.pico.map.ney.Nofification;
import br.com.pico.map.ney.SMS;

public class AppMain {
	public static void main(String[] walneynegreiros) {
		MutablePicoContainer pico = new DefaultPicoContainer();// tipo uma lista
		pico.addComponent(SMS.class).addComponent(Email.class).addComponent(EventLogWriter.class);
		pico.getComponents();
	

		// é o mesmo que
		List<Nofification> picos = new ArrayList<Nofification>();
		picos.add(pico.getComponent(SMS.class));
		picos.add(new SMS());

		// Uma lista de todos os
		// componentes de notification

		AppPoolWatcher app = new AppPoolWatcher();
		app.setAction(pico.getComponent(SMS.class));
		app.notificar();

	}

}
