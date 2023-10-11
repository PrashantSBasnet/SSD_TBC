package comparableComparator;

import java.util.Comparator;

/**
 * Advantages of Comparator
 * - avoid using additional code to our domain classes
 * - flexibility to define multiple different comparison strategies, not possible using Comparable
 * @author prashantsingh.basnet
 *
 */
public class PlayerAgeComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
