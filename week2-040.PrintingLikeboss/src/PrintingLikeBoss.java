public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
        i++;
    }
         System.out.println("");
    
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
        i++;
    }
        
    }
    

    public static void printTriangle(int size) {
       int i=1;
       while (i <= size) {
           printWhitespaces(size - i);
           printStars(i);
           
        i++;
    }
    }
    public static void xmasTree(int height) {
        int tree= 1;
        int space = height-1;
       while (space >= 0) {
           printWhitespaces(space);
           printStars(tree);
           
        tree+=2;
        space--;
       }
       space = height -2;
       tree = 3;
       
       printWhitespaces(space);
       printStars(tree);
       printWhitespaces(space);
       printStars(tree);
       
        
        }



    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
