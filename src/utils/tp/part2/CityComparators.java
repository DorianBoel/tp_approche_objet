package utils.tp.part2;

import java.util.Comparator;

import entities.geo.City;
import utils.NonInstantiable;

/**
 * Non-instantiable class containing several {@link Comparator}
 * functions to compare attributes of {@link City} instances.
 *
 * @author DorianBoel
 */
public class CityComparators extends NonInstantiable {

	/**
	 * A comparator which compares a
	 * city's name with another city's,
	 * returning their relative alphabetical position.
	 */
	public static final Comparator<City> NAME_COMPARATOR_ALPHABETICAL = (city1, city2) ->
		city1.getName().compareTo(city2.getName());
		
	/**
	 * A comparator which compares a
	 * city's population with another city's
	 * so that the larger population value is positioned after
	 * the smaller one.
	 */
	public static final Comparator<City> POPULATION_COMPARATOR_ASCENDING = (city1, city2) ->
		city1.getPopulation() - city2.getPopulation();
	
}
