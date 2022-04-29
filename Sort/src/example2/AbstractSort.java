package example2;

import java.util.List;

public abstract class AbstractSort<T extends Comparable<T>>{

     protected final List<T> list;

     public AbstractSort(List<T> list) {
         this.list = list;
     }

     /**
      * entry for sorting
      *
      * @return sorted list
      */
     public abstract List<T> sort();

     /**
     * True if i-th element is less than j-th one
     *
     * @param i
     * @param j
     * @return
     */
    public boolean less(int i, int j) {
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
