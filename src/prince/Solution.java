package prince;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine().trim();
        Player[] books = new Player[n];
        if(n>0 && n<=100){
            for(int i=0;i<n;i++){
                String bookname=sc.nextLine().trim();
                String authorname=sc.nextLine().trim();

                int ibsm=sc.nextInt();

                sc.nextLine().trim();
                books[i]=new Player(bookname, authorname,ibsm);


            }
            System.out.println("Bookname\t Authorname\tIbsm");
            for(Player player:books){
                System.out.println(player);
            }

        }
        sc.close();
    }

}
