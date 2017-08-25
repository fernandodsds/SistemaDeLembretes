package threadsJava;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.gnome.*;
import org.gnome.notify.Notification;
import org.gnome.notify.Notify;

public class Relogio extends Thread{
	Notification myNotification;
;
	public Relogio() {
		// TODO Auto-generated constructor stub

		
	}
	
	@Override
	public void run() {
    	 // initalize the notification system  
		Notify.init("Program Name");
		myNotification = new Notification("Isso é um teste!","Programa inicializado","dialog-information");
		for(;;) {
		dataEHora();
		myNotification.show();
		
		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		myNotification.close();
		}
		
		
	}

	private void dataEHora() {
		 Calendar cal = new GregorianCalendar();
		 int dia = cal.get(Calendar.DAY_OF_MONTH);
	     int mes = cal.get(Calendar.MONTH);
	     int ano = cal.get(Calendar.YEAR);

	     int hora = cal.get(Calendar.HOUR);
         int minuto = cal.get(Calendar.MINUTE);
         int segundo = cal.get(Calendar.SECOND);
         if(segundo == 0)
        	 this.myNotification = new Notification("Isso é um teste!",hora+"hrs"+minuto+"min"+segundo+"seg","dialog-information");
         
	}
 
}
