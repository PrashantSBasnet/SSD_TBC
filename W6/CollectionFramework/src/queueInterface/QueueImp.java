package queueInterface;

import java.util.AbstractQueue;
import java.util.Iterator;

//extending the AbstractQueue class
/**
 * This class provides skeletal implementations of some Queue operations. 
 * The implementations in this class are appropriate when the base implementation does not allow null elements.
 * A Queue implementation that extends this class must minimally define a method Queue.offer(E) which does not permit insertion of null elements, 
 * along with methods Queue.peek(), Queue.poll(), Collection.size(), and Collection.iterator().
 * 
 * 
 * 
 * @author prashantsingh.basnet
 *
 * @param <T>
 */
public class QueueImp<T> extends AbstractQueue<T> {

	@Override
	public boolean offer(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
