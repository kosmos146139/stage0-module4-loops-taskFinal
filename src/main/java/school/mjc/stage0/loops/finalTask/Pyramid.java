package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength;i++){
            for (int j = 1; j < cathetusLength*2 + 1;j++){
                if (j > cathetusLength && i >= j - cathetusLength + 1)
                {
                    System.out.print(j - cathetusLength + 1);
                    if (j - cathetusLength + 1 == i) {break;}
                }
                else if (j <= cathetusLength && i >= cathetusLength-j + 1)
                {
                    System.out.print(Math.abs(cathetusLength-j) + 1);
                    if (j - cathetusLength + 1 == i) {break;}
                }
                else {System.out.print(' ');}
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
