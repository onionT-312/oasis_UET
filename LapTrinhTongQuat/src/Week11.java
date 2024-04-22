import java.util.List;

public class Week11<T> {
    /**
     * Sort generic.
     *
     * @param list the list to be sorted
     * @param <T>  the type parameter
     * @return the sorted list
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
