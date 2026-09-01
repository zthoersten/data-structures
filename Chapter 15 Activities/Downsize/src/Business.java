import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> iterator = employeeNames.listIterator();
        // original algorithm, fails when n=1
        // System.out.println(employeeNames.size());
        // for (int i = 0; i <= employeeNames.size() + 1; i++) {
        //     iterator.next();
        //     System.out.println("Iterator position: " + iterator.previousIndex() + "; i = " + i);
        //     if ((i + 1) % n == 0) {
        //         // remove element
        //         System.out.println("Removing");
        //         iterator.remove();
        //     }
        // }
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
            if (count % n == 0) {
                iterator.remove();
            }
        }
    }
}