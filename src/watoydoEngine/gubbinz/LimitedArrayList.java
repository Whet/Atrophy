/*
 * 
 */
package watoydoEngine.gubbinz;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
// Arraylist that ignores .add when it reaches a limit on size
/**
 * The Class LimitedArrayList.
 *
 * @param <E> the element type
 */
@SuppressWarnings("serial")
public class LimitedArrayList<E> extends ArrayList<E> {
	
	/**
	 * The max size.
	 */
	private int maxSize;
	
	/**
	 * Instantiates a new limited array list.
	 *
	 * @param maxSize the max size
	 */
	public LimitedArrayList(int maxSize){
		super(maxSize);
		
		this.maxSize = maxSize;
	}
	
	/* (non-Javadoc)
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	@Override
	public boolean add(E e){
		if(this.size() < maxSize){
			return super.add(e);
		}
		return false;
	}
}
