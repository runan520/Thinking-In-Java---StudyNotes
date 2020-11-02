package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;

;
;import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-07 22:00
 */
//必须重写Iterator
public class CollectionSequence extends AbstractCollection<Pet> {
    String myGitHub = "https://github.com/WuRoc";

    private Pet[] pets = Pets.array(8);


    @Override
    public int size() {
        return pets.length;
    }
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>(){
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
    //移除并删除队头
            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args){
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
        System.out.println(c.size());
    }
}
