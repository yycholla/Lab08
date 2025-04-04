import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

/**
  * "Bad" implementation of the IndexedUnsortedList interface.
 *
  * @param <E> - type of elements held in this collection
  * @author CPSC 221
  */
public class BadList<E> implements IndexedUnsortedList<E> {

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
		// List "broken", return null 
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
		// List "broken", return null 
	}

	@Override
	public E remove(E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
		// Returning true, empty even after adding 
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
		// Returning 0 instead since -1 may crash
	}

	@Override
	public void addToFront(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToRear(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAfter(E element, E target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return Collections.emptyIterator();
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		//return null;
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator(int startingIndex) {
		// TODO Auto-generated method stub
		// return null;
		throw new UnsupportedOperationException();
	}
}
