package tp.part3;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import static utils.GeneralUtils.display;

public class TpStringBuilder {

	public static void main(String[] args) {
		
		BiFunction<Long, Long, Consumer<String>> displayTimerResult = (start, end) ->
			message ->
				display(String.format(Locale.US, message, (double) (end - start) / 1000));

		// On initialise un nouveau string builder
		StringBuilder builder = new StringBuilder();
		
		// On commence le chronométrage
		long timerStart = System.currentTimeMillis();
		
		// On teste la concaténation dans une boucle assez longue
		for(int i = 1; i <= 100_000; i++) {
			builder.append(i);
		}
		
		// On arrête le chronomètre une fois la boucle terminée
		long timerEnd = System.currentTimeMillis();
		
		String builderStr = builder.toString();
		display(builderStr.length());
		
		// On affiche le temps d'exécution de l'opération
		displayTimerResult.apply(timerStart, timerEnd).accept("L'opération avec le StringBuilder a mis %.3f secondes à s'être effectuée");
		
		
		// On chronomètre à nouveau l'opération en utilisant la concaténation avec l'opérateur '+' cette fois 
		String concatStr = "";
		
		timerStart = System.currentTimeMillis();
		
		for(int i = 1; i <= 100_000; i++) {
			concatStr += i;
		}
		
		timerEnd = System.currentTimeMillis();
		
		display(concatStr.length());
		
		displayTimerResult.apply(timerStart, timerEnd).accept("L'opération avec l'opérateur '+' a mis %.3f secondes à s'être effectuée");

	}
	
}
