package Patterns;

public class BasicPatterns {
    /*
    Full pyramid
      1
     232
    34543
   4567654
  567898765
     */
    static void printFullPyramid(int row){
        int col=0;
        for(int i=1;i<=row;i++){

            for(int space=1;space<=row-i;space++)
            {
                System.out.print(" ");
            }
            col=i;
            for(int j=1;j<=i;j++) //left side triangle
            {
                System.out.print(col++ + "");
            }
            col--;
            for(int k=1;k<i;k++) // right side triangle
            {
                System.out.print(--col +"");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        BasicPatterns.printFullPyramid(5);
    }
}
