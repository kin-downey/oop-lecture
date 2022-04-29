package example2;

import java.util.ArrayList;
import java.util.List;


public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T>{

    public BubbleSort(List<T> list) {
        super(list);
    }

    public List<T> sort() {
        for (int j = list.size() - 1; j > 0; j--){
            for (int i = 0; i < j; i++){
                if (! less(i, i+1)){
                    swap(i, i+1);
                }
            }
        }
        return list;
    }

    /**
     * Swap i-th and j-th elemnts in the list
     * @param i
     * @param j
     * @return
     */
    private void swap(int i, int j){
        T t = list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);
    }
}
