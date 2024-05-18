public class PracticeDemo {
    public static void main(String[] args) {

        System.out.println("Current values of x and y ");

        int x = 10;
        int y = 20;
        int temp;

        System.out.println("X : " +x);
        System.out.println("Y : " +y);


        System.out.println(" After swapping ");

       /* temp = x;
        x = y; // y = 20 , x = 20
        y = temp;
*/
  //  x = 20
        //  y = 10


        // without taking temp variable
        x = x + y; // 20 + 10  --- 30
        y = x - y ; // 30 - 20 , y = 10
        x = x - y ; // 30 - 10 = x = 20


        System.out.println("X : " +x);
        System.out.println("Y : " +y);



    }
}

/*


Saturday ---- Java - 10 am - 2 pm hybrid
Tuesday - java -- 8 pm - 10 pm - online
Thursday - 8 pm - 10 pm =====> Unix, Git/github/ rest api jenkins, aws, database , sql



 */
