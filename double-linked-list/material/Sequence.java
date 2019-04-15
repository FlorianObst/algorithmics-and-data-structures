public interface Sequence<E> {
  /**
   * Adds a new item at a specified position in the sequence.
   */
  public void insert(E o, int index)
  throws SequenceException;

  /**
   * Adds a new item at the start of the sequence.
   */
  public void insertFirst(E o)
  throws SequenceException;

  /**
   * Adds a new item at the end of the sequence.
   */
  public void insertLast(E o)
  throws SequenceException;

  /**
   * Removes the item at the specified position in the sequence.
   */
  public void delete(int index)
  throws SequenceException;

