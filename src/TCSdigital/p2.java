package TCSdigital;

public class p2 {
    public static void main(String[] args) {
        System.out.println(find(11,15));
    }

    public static int find(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            int temp = 0;
            while (i != 0) {
                int rem = i % 10;
                if (rem == temp) {
                    break;
                }
                temp = rem;
                i = i / 10;
            }
            if (i == 0) {
                count++;
            }
            i=n1++;
        }
        return count;
    }
}
