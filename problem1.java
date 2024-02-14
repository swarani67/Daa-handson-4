import java.util.*;

public class Main{
    public static int[] merge(int[][] A) {
        PriorityQueue<Element> PQ = new PriorityQueue<>();
        for (int k=0;k<A.length;k++) {
            if (A[k].length > 0) {
                PQ.add(new Element(A[k][0], k, 0));
            }
        }
        List<Integer> sol = new ArrayList<>();
        while (!PQ.isEmpty()) {
            Element pre= PQ.poll();
            sol.add(pre.number);
            int suc_idx = pre.idx+ 1;
            if (suc_idx<A[pre.arr].length) {
                PQ.add(new Element(A[pre.arr][suc_idx], pre.arr, suc_idx));
            }
        }
        int[] sortedarr = new int[sol.size()];
        for (int k=0;k<sol.size();k++) {
            sortedarr[k]=sol.get(k);
        }
        return sortedarr;
    }
    static class Element implements Comparable<Element> {
        int number;
        int arr;
        int idx;
        public Element(int number, int arr, int idx) {
            this.number = number;
            this.arr = arr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Element other) {
            return Integer.compare(this.number, other.number);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. of arrays: ");
        int w = scanner.nextInt();
        int[][] arrays = new int[w][];
        for (int k=0;k<w;k++) {
            System.out.print("size of array: " + (k+1) + ": ");
            int size = scanner.nextInt();
            arrays[k]=new int[size];
            System.out.print("Array values " + (k+1) + ": ");
            for (int b=0;b<size;b++) {
                arrays[k][b]=scanner.nextInt();
            }
        }
        int[] sortedarray = merge(arrays);
        System.out.print("Final array:");
        for (int d: sortedarray) {
            System.out.print(d+ " ");
        }
        scanner.close();
    }
}
