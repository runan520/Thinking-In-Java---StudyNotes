package com.wuroc.chaptereleven;

import com.typeinfo.pets.Pet;
import com.typeinfo.pets.Pets;

;
;import java.util.Iterator;

/**
 * https://github.com/WuRoc
 *
 * @author WuRoc
 * @create 2020-10-07 22:19
 */
class PetSequence {
    protected Pet[] pets = Pets.array(8);
}

    public class NonCollectionSequence extends PetSequence {
        String myGitHub = "https://github.com/WuRoc";
        public Iterator<Pet> iterator(){
            return new Iterator<Pet>() {
                private int index = 0;
                @Override
                public boolean hasNext() {
                    return index < pets.length;
                }

                @Override
                public Pet next() {
                    return pets[index++];
                }

                @Override
                public void remove(){  //无法实现
                    throw new UnsupportedOperationException();
                }
            };
        }

        public static void main(String[] args) {
            NonCollectionSequence nc = new NonCollectionSequence();
            InterfaceVsIterator.display(nc.iterator());
        }
    }

