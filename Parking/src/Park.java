import java.util.Scanner;

public class Park {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("no.of slots:");

        int i = sc.nextInt();
        int maxspace=i;
        while(true){

            String name = sc.nextLine();

        if (name.equals("p")) {
            System.out.println("car is parking");
            if(i==0)
                System.out.println("parking is full");
            else
                i--;


        } else if (name.equals("l")) {
            System.out.println("car is leaving");
            if(i==maxspace)
                System.out.println("wrong selection");
            else
                i++;
        } else if (name.equals("c")) {
            System.out.println("checking slots");
            System.out.println(i);


        }
    }
}}