public class Butterflyptr {
    public static void ButterFlyPattern(int n) {
        for (int i = 1; i <= n; i++) {

            //first we have to print Stars then some spaces and then again some stars
            //stars = i

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces = 2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {  //The way to create a mirror image
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }


    public static void main(String ags[]){

        ButterFlyPattern(4);
    }
}
