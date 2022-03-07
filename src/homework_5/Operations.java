package homework_5;

public class Operations {
    public static void main(String[] agrs) {
        // Test Data a
        int a = -5;
        int b = 8;
        int c = a + b * 6;// 43
        System.out.println(c);

        // Test Data b
        int e = 55;
        int f = 9;
        int g = (e + f) % 9; // 1
        System.out.println(g);

        // Test Data c
        int h = 20;
        int i = -3;
        int j = 5;
        int k = h + i * j / 8; // 19
        System.out.println(k);

        //    Test Data d
        int m = 5;
        int n = 15;
        int o = 3;
        int p = 2;
        int q = 8;
        int r = m + n / o * p - q % 3; // 13
        System.out.println(r);


    }
}
