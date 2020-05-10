class PermutationQueen {
    public static void main(String args[]) {
        boolean boxes[] = new boolean[4];
        int total_queen = 2;
        int qpsf = 0;
        String ans = "";

        PermutationQueen(boxes, total_queen, qpsf, ans);
    }

    static int count = 0;

    public static void PermutationQueen(boolean boxes[], int tq, int qpsf, String ans) {

        // base case

        if (tq == qpsf) {
            count++;
            System.out.print(count);
            System.out.println(ans);
            return;

        }
        for (int b = 0; b < boxes.length; b++) {
            if (boxes[b] == false) {
                boxes[b] = true; // queen ko baitha diya
                // call lga di
                PermutationQueen(boxes, tq, qpsf + 1, ans + " q " + (qpsf + 1) + " b " + b);
                boxes[b] = false;

            }

        }

    }

}