package threadsJava;

import org.gnome.notify.Notification;
import org.gnome.notify.Notify;
import org.joda.time.DateTime;

public class Relogio extends Thread{
	Notification myNotification;
	Acontecimento a;
	public Relogio(Acontecimento a) {
		// TODO Auto-generated constructor stub
		this.a = a;
		
	}
	
	@Override
	public void run() {
    	 // Initialize the notification system  
		Notify.init("Compromissos");
		myNotification = new Notification("Programa inicializado","","dialog-information");
 		myNotification.show();
		for(;;) {
		dataEHora(a);
		System.out.println(new DateTime().getMillisOfDay());
		try {
			sleep(86400000-new DateTime().getMillisOfDay());
		} catch (Exception e) {
			// TODO: handle exception
		}
		myNotification.close();
		}
		
		
	}

	private void dataEHora(Acontecimento a) {

         if(a.verificaSeEHoje()) {
        	 this.myNotification = new Notification(a.getTitulo(),a.getDesc(),"dialog-information");
     		myNotification.show();

         }
         
	}
 
}
