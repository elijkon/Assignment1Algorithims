public class Question1 {

    public static void question1(String word1, String word2) {
        int w1L = word1.length();
        int w2L = word2.length();
        int[][] table = new int[w1L + 1][w2L + 1];

        for (int i = 1; i <= w1L; i++) {
            for (int j = 1; j <= w2L; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    table[i][j] = 1 + table[i-1][j-1];
                }
                else {
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }

        System.out.println("input: "+ word1 + " and " + word2);
        System.out.println("output: " + table[w1L][w2L]);
    }


    public static void main(String[] args) {
        Question1.question1("alucards","alliances");

    }
}
