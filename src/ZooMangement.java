import java.util.Scanner;
public class ZooMangement {
    public static void main(String[] args) {
        int nbrCage = 20;
        String zooName = "my Zoo";

        Scanner sc = new Scanner(System.in);
        System.out.println("donner le nom de zoo ");
        zooName = sc.nextLine();
        System.out.println("donner le nombre des cages ");

        nbrCage= sc.nextInt();


        System.out.println(zooName + " comporte " + nbrCage+" cages");
    }
}
