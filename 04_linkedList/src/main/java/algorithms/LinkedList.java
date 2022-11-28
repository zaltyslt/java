package algorithms;

public class LinkedList<E> implements List<E> {

    private int size;

    private final Element<E> headAndTail;

    public LinkedList() {
        size = 0;
        headAndTail = new Element<>(null);
        clear();
    }

    @Override
    public void insert(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Element<E> element = new Element<>(value);
        element.attachBefore(getElement(index));
        ++size;
    }

    private Element<E> getElement(int index) {
        Element<E> element = headAndTail.getNext();

        for (int i = 0; i < index; ++i) {
            element = element.getNext();
        }

        return element;
    }

    @Override
    public void add(E value) {
        //Create a new element
       Element <E> element = new Element<>(value);
        //visada ikish po paskutinio sekos elemento
       element.attachBefore(getElement(size()));

        this.size++;

    }

    @Override
    public E delete(int index) {
        //jei out of bounds mes exceptiona
        checkOutBounds(index);

        Element<E> element = getElement(index);
        element.detach();

        --size;

        return element.getValue();
    }

    @Override
    /*ne*/
    public boolean delete(E value) {
        if(contains(value)){
            delete(indexOf(value));
            return true;
        }
       return false;
    }

    @Override
    public void clear() {
        headAndTail.setNext(headAndTail);
        headAndTail.setPrev(headAndTail);
        size = 0;
    }

    @Override
    public E set(int index, E value) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException();
        }
        E previousValue =getElement(index).getValue();
        getElement(index).setValue(value);
        return previousValue;
    }

    @Override
    public E get(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException();
        }

        return  getElement(index).getValue();
    }

    @Override
    public int indexOf(E value) {
        for(int i =0; i < size();i++){
            if(getElement(i).getValue().equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E value) {
       for(int i =0; i < size();i++){
           if(getElement(i).getValue().equals(value)){
               return true;
           }
       }
        return false;
    }

    @Override
    public int size() {

        return this.size;
    }

    @Override
    public boolean isEmpty() {
     if(size() >0 ){
         return false;
     }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }



    ////////

    private void checkOutBounds(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isOutOfBounds(int index) {

        return index < 0 || index >= size;
    }
///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
private class LinkedListIterator implements Iterator<E>{
    private Element<E> pos;
    private int index;

    public LinkedListIterator(){
        pos = headAndTail.getNext();

    }
    @Override
    public void first() {
        System.out.println("first");
        index = 0;
//        pos = headAndTail.getNext();
        pos = getElement(index);
    }

    @Override
    public void last() {
        System.out.println("last");
//        while (!isDone()){
//            System.out.println("last:while");
//            next();
//        }
      index = size()-1;
      pos = getElement(index);
    }

    @Override
    public boolean isDone() {
//        if(pos.getNext() != null){
//            System.out.println();
//            System.out.println("isDone:False");
//            return false;
//        }
        System.out.println(index + 1 == size());

       return index + 1 == size();
    }

    @Override
    public void next() {
        if(!isDone()) {
            System.out.println("next");
//        pos = pos.getNext();
            index++;
            pos = getElement(index);
        }
    }

    @Override
    public void previous() {
        System.out.println("previous");
//        pos = pos.getPrev();
        index--;
        pos = getElement(index);
    }

    @Override
    public E current() {
//        System.out.println("current");
//
//        System.out.println(pos.getValue());
//        System.out.println(pos.getPrev().getValue());
//        System.out.println(pos.getNext().getValue());
        return pos.getValue();
    }
}
    ///////////////////////////////////////////////////////////////////////////
    private static final class Element<E> {
        private E value;

        private Element<E> next;

        private Element<E> prev;

        public Element(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Element<E> getNext() {
            return next;
        }

        public void setNext(Element<E> next) {
            this.next = next;
        }

        public Element<E> getPrev() {
            return prev;
        }

        public void setPrev(Element<E> prev) {
            this.prev = prev;
        }

        public void attachBefore(Element<E> element) {
            setNext(element);
            setPrev(element.getPrev());

            element.setPrev(this);
            getPrev().setNext(this);
        }

        public void detach() {
            getPrev().setNext(getNext());
            getNext().setPrev(getPrev());
        }
    }

}
