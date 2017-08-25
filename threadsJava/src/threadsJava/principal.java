package threadsJava;

import org.gnome.gtk.Gtk;
import org.gnome.notify.Notification;
import org.gnome.notify.Notify;

public class principal {

	public static void main(String[] args) {
		Gtk.init(args);
		
		
		Relogio r = new Relogio();
		r.start();
		
		
		
		           
	}

}
