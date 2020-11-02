package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

;
;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-07 22:37
 */
class CollectionSequence2 extends PetSequence implements Collection<Pet> {
    String myGitHub = "https://github.com/WuRoc";

    static void display(Iterator<Pet> it){
        while(it.hasNext()) {
            Pet  p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    static void display(Collection<Pet> pets){
        for(Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }
    @Override
    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>(){
            private int index;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }

        };
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if(o == null)
        return false;
        for(int i = 0; i < pets.length; i++)
            if(o.equals(pets[i]))
                return true;
            return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[pets.length];
        System.arraycopy(pets, 0, result, 0, pets.length);
        return result;
    }

    @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            if(a.length < pets.length)
                a = (T[])java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), pets.length);
            T[] result = a;
            System.arraycopy(pets, 0, result, 0, pets.length);
            if(result.length > pets.length)
                result[pets.length] = null;
            return result;
        }

    @Override
    public boolean add(Pet o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> it = c.iterator();
        //hasNext()检查序列中是否还有元素
        while (it.hasNext())
            //光标移动到下一行，如果有数据就返回true
            if(!contains(it.next()))
                return false;
                return true;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}

public class E30CollectionSequence2 {
    public static void main(String[] args){
        CollectionSequence2 c = new CollectionSequence2();
        CollectionSequence2.display(c);
        CollectionSequence2.display(c.iterator());
        //Arrays.toString()
        System.out.print(Arrays.toString(c.toArray(new Pet[0])));
    }
}
/*
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
        0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
        [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]*/
//In the min malist ap roach used her , optional operations
// (as marked in the interface d script on f Col ection) are not sup orted,
// nor is equals( ). We also ver ide hashCode( ) and toString( ).
// Even with es restrict ons, the code base is much big er than that of AbstractCol
// ection in the orig nal version. Note he use of System.ar aycopy( )
// to c py the ar ys quickly ins de toAr ay( ).

