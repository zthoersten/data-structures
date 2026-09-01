import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Steve");
        staff.addLast("Wanda");
        staff.addLast("Dr. Strange");

        System.out.println(staff);

        ListIterator<String> iterator = staff.listIterator();

        iterator.next();

        String avenger = iterator.next();
        System.out.println(avenger);

        iterator.add("Natasha");
        iterator.add("Bruce");

        System.out.println(staff);

        iterator.next();
        iterator.remove();

        System.out.println(staff);

        for (String n: staff) {
            System.out.print(n + " ");
        }
    }
}