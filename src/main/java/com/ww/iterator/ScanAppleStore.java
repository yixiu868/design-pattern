package com.ww.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 利用Java迭代器接口，实现迭代器
 */
public class ScanAppleStore implements Iterable<String> {

    ArrayList<String> appleStore = new ArrayList<>();

    ScanAppleStore() {
        Collections.addAll(appleStore, "Sweet", "Sour", "Bitter", "litter Sweet", "litter Sour", "litter Bitter");
        System.out.println(appleStore);
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int i = 0;

            @Override
            public boolean hasNext() {
                if (i < appleStore.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public String next() {
                return appleStore.get(i++);
            }

            @Override
            public void remove() {
                System.out.print("not defined!");
            }
        };
    }

    public Iterable<String> reverseIterator() {
        return new Iterable<String>() {

            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int i = appleStore.size() - 1;

                    @Override
                    public boolean hasNext() {
                        if (i > -1) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    @Override
                    public String next() {
                        return appleStore.get(i--);
                    }

                    @Override
                    public void remove() {
                        System.out.print("not defined!");
                    }
                };
            }
        };
    }
}
