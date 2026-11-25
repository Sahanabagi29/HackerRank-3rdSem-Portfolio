
import java.util.*;

public class Solution {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;

        for (List<Integer> query : queries) {

            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else {
                int index = y % arr.get(idx).size();
                lastAnswer = arr.get(idx).get(index);
                result.add(lastAnswer);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            List<Integer> query = new ArrayList<>();

            query.add(sc.nextInt());
            query.add(sc.nextInt());
            query.add(sc.nextInt());

            queries.add(query);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int answer : result) {
            System.out.println(answer);
        }

        sc.close();
    }
}
