package com.ww.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {

    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object ret = null;
        if (hasNext()) {
            ret = list.get(cursor++);
        }

        return ret;
    }

    @Override
    public boolean hasNext() {
        if (list.size() == cursor) {
            return false;
        }

        return true;
    }
}
