package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sorter<T extends Comparable> {

    private List<T> list;

    List<T> sort(List<T> list) {
        this.list = new ArrayList<>(list);
        Collections.sort(this.list);
        return this.list;
    }
}
