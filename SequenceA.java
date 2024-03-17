public class SequenceA {
    public static void main(String[] args) {
        int n = 12;
        int start = 1;
        int diff = 3;

        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start += diff;
        }
    }
}

