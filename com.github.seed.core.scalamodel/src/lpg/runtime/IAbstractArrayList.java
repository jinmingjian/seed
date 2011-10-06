package lpg.runtime;

public interface IAbstractArrayList<T extends IAst> extends  java.util.List<T> {
    public int size();
    public T getElementAt(int i);
    public java.util.List<T> getList();
    public void addElement(T elt);
    
    /**
     * @deprecated.  No longer needed as this interface now extends List.
     */
    public java.util.List<T> getAllChildren();
}
