package tp.part3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DisplayUtils;

public class TpDates {

	public static void main(String[] args) {
		
		// Le constructeur date sans paramètres accède à la date actuelle
		Date today = new Date();
		
		// On définit un formatteur de date simple
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DisplayUtils.display(dateFormat.format(today));
		
		// Le constructeur date avec paramètres est déprécié, mais permet d'accéder à n'importe quelle date et heure
		@SuppressWarnings("deprecation")
		Date date1 = new Date(116, 4, 19, 23, 59, 30);
		
		// On définit un formatter de date avec l'heure
		DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		DisplayUtils.display(dateTimeFormat.format(date1));
		
		// On affiche la date et l'heure actuelles avec le formatter précédent
		DisplayUtils.display(dateTimeFormat.format(today));
		
		// On crée un nouveau Calendar puis on lui assigne les valeurs de date et heure
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 5, 19, 23, 59, 30);
		
		Date date2 = calendar.getTime();
		
		// On affiche la date grâce au formatter
		DisplayUtils.display(dateFormat.format(date2));
		
		// On récupère la date actuelle et on l'assigne au Calendar
		calendar.setTime(new Date());
		Date dateNow = calendar.getTime();
		
		// On l'affiche au format date-heure
		DisplayUtils.display(dateTimeFormat.format(dateNow));
		
		// On définit des formatter de dates avec des locales différents
		// France
		DateFormat dateTimeFormatFR = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("fr", "FR"));
		// Russie
		DateFormat dateTimeFormatRU = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		// Chine
		DateFormat dateTimeFormatCN = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("zh", "CN"));
		// Allemagne
		DateFormat dateTimeFormatDE = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("de", "DE"));
		
		// On affiche la date au format de chaque locale
		for (DateFormat format : new DateFormat[] {
			dateTimeFormatFR,
			dateTimeFormatRU,
			dateTimeFormatCN,
			dateTimeFormatDE
		}) {
			DisplayUtils.display(format.format(dateNow));
		}
			
	}
	
}
