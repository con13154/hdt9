/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo8;

/**
 *
 * @author E. de Mata
 */

import java.util.Enumeration;
import java.util.Iterator;

//----------------------------------------------------------------------------
// Clase tomada de:
// http://highered.mcgraw-hill.com/sites/dl/free/0072399090/26111/AbstractIterator.txt
//
// Bailey, A. 2007. Java Structures: Data Structures for the 
//      Principled Programmer. Williams College.
//----------------------------------------------------------------------------
public abstract class AbstractIterator implements Enumeration, Iterator{
    public AbstractIterator()
    {
    }

    /**
     * Reset iterator to the beginning of the structure.
     * This method is not required of <code>Iterator</code> or 
     * <code>Enumeration</code> implementation, but some traversals
     * may allow efficient multi-pass implementations with little
     * overhead.  The user is encouraged to implement this method.
     *
     * @pre iterator may be initialized or even amid-traversal
     * @post reset iterator to the beginning of the structure
     */
    public abstract void reset();

    /**
     * Returns true if the iterator has more elements to visit.
     * The method <code>hasMoreElements</code> is an
     * <code>Enumeration</code>-required call to this method.  The user
     * should override only this method.
     *
     * @post true iff the iterator has more elements to visit
     * @return true iff the iterator has more elements to visit
     * @see #hasMoreElements
     */
    public abstract boolean hasNext();

    /**
     * Returns the value currently being considered by the AbstractIterator.
     * This method is required by neither <code>Iterator</code> nor
     * <code>Enumeration</code>.  This method should be implemented,
     * however, to provide better support for <code>for</code>-loops.
     *
     * @pre there are more elements to be considered; hasNext()
     * @return the next value to be considered in iterator
     * @post returns current value; ie. value next() will return
     */
    public abstract Object get();

    /**
     * Returns the value currently being considered by the AbstractIterator.
     * This method is required by neither <code>Iterator</code> nor
     * <code>Enumeration</code>.  This method should be implemented,
     * however, to provide better support for <code>for</code>-loops.
     *
     * @deprecated This method was deprecated in version 2 of the structure
     * package. Use the get method.
     * @pre there are more elements to be considered; hasNext()
     * @return the next value to be considered in iterator
     * @post returns the current value; the value next() will return
     */
    final public Object value()
    {
        return get();
    }

    /**
     * Moves, bumps, or "increments" the iterator along the traversal;
     * returns the next value considered.
     * This method should only be called if the iterator has a next value.
     * To get a value from an iterator multiple times, use the
     * <code>value</code> method.
     * <p>
     * This method is preferred over the <code>nextElement</code> method.
     *
     * @pre hasNext()
     * @post returns current value, and then increments iterator
     * @return the current value
     * @see #hasMoreElements
     * @see #value
     */
    public abstract Object next();

    /**
     * If implemented, removes the currently visited value from the structure.
     * <code>remove</code> should not be called unless it is overridden.
     *
     * @pre hasNext() is true and get() has not been called
     * @post the value has been removed from the structure
     */
    public void remove()
    {}

    /**
     * An Enumeration method that is equivalent to {@link #hasNext}.
     * Extensions to this class should provide a <code>hasNext</code>
     * method.
     *
     * @post returns true iff there are more elements
     * @return returns true iff there are more elements
     */
    final public boolean hasMoreElements()
    {
        return hasNext();
    }

    /**
     * An Enumeration method that is equivalent to {@link #next}.
     * Extensions to this class should provide a <code>next</code> method.
     *
     * @pre hasNext()
     * @post returns the current value and "increments" the iterator
     * @return the current value before iterator is incremented
     */
    final public Object nextElement()
    {
        return next();
    }
}
