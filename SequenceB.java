public class SequenceB {
    public static void main(String[] args) {
        int n = 12;
        int start = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start *= 2;
        }
    }
}
