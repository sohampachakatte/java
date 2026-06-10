import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        System.out.print("Enter size of ArrayList : ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        System.out.print("Enter Arraylist Element : ");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        System.out.println("Maximum in list is : ");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.print(max);
    }
}
