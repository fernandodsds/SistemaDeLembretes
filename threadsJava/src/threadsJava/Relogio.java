package threadsJava;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.gnome.*;
import org.gnome.notify.Notification;
import org.gnome.notify.Notify;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;

public class Relogio extends Thread{
	Notification myNotification;
;
	public Relogio() {
		// TODO Auto-generated constructor stub

		
	}
	
	@Override
	public void run() {
    	 // initalize the notification system  
		Notify.init("Compromissos");
		myNotification = null;
		
		for(;;) {
		dataEHora();
		System.out.println(new DateTime().getMillisOfDay());
		try {
			sleep(86400000-new DateTime().getMillisOfDay());
		} catch (Exception e) {
			// TODO: handle exception
		}
		myNotification.close();
		}
		
		
	}

	private void dataEHora() {
		 DateTime dataFinal = new DateTime();
		 
		 DateTime dataInicial = new  DateTime(2017,8,12,0,0);
         if(Days.daysBetween(dataInicial, dataFinal).getDays()>= 10) {
        	 this.myNotification = new Notification("Lembrete","hoje vence o cartão de cabelo","dialog-information");
     		myNotification.show();

         }
         
	}
 
}
