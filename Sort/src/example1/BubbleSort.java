package example1;

import java.util.ArrayList;
import java.util.List;


public class BubbleSort<T extends Comparable<T>>{

    final private List<T> list;

    public BubbleSort(List<T> list) {
        this.list = list;
    }

    public List<T> sort() {
        for (int j = list.size() - 1; j > 0; j--){
            for (int i = 0; i < j; i++){
                if ( ! less(i, i+1)){
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

    /**
     * True if i-th element is less than j-th one
     *
     * @param i
     * @param j
     * @return
     */
    private boolean less(int i, int j) {
        return list.get(i).compareTo(list.get(j)) < 0;
    }

    /**
     * Confirm the target is sorted
     *
     * @return true if sorted
     */
    public boolean isSorted() {
        boolean b = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!less(i, i + 1)) {
                return false;
            }
        }
        return b;
    }
}
