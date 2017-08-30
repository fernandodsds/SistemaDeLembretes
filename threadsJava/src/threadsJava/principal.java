package threadsJava;

import org.gnome.gtk.Gtk;
import org.gnome.notify.Notification;
import org.gnome.notify.Notify;
import org.joda.time.DateTime;

public class principal {

	public static void main(String[] args) {
		Compromisso cabelo = new Compromisso("Cortar cabelo", "Você precisa cortar o cabelo", new DateTime(2017,8,26,0,0));
		Gtk.init(args);
		
		
		Relogio r = new Relogio(cabelo);
		r.start();
		
		
		
		           
	}

}
