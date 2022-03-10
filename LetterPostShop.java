import java.util.Scanner;

public class LetterPostShop {
    // static int num;
    static void printmenu() {
        System.out.println();
        System.out.println("-----Menu-----");
        System.out.println("Created by Solahudeen");
        System.out.println("0 : Exit");
        System.out.println("1 : Normal Letter");
        System.out.println("2 : Register Letter");
        System.out.println("3 : EMS Letter");
        System.out.println("---------------");
    }

    static void NormalLetter(int x) {
        if (x <= 20) {
            x = 3;
            System.out.println("Normal Letter Service price: " + x + " Baht");
        }
        if (x > 20 && x <= 100) {
            x = 5;
            System.out.println("Normal Letter Service price: " + x + " Baht");
        }
        if (x > 100 && x <= 250) {
            x = 9;
            System.out.println("Normal Letter Service price: " + x + " Baht");
        }
        if (x > 250 && x <= 500) {
            x = 15;
            System.out.println("Normal Letter Service price: " + x + " Baht");
        }
        if (x > 500 && x <= 1000) {
            x = 25;
            System.out.println("Normal Letter Service price: " + x + " Baht");
        }
        if (x > 1000 && x <= 2000) {
            x = 45;
            System.out.println("Normal Letter Service price: " + x + " Baht");
        }

    }

    static void RegisTer(int y) {
        if (y <= 20) {
            y = 3 + 13;
            System.out.println("Register Letter Service Price: " + y + " Baht");
        }
        if (y > 20 && y <= 100) {
            y = 5 + 13;
            System.out.println("Register Letter Service Price: " + y + " Baht");

        }
        if (y > 100 && y <= 250) {
            y = 9 + 13;
            System.out.println("Register Letter Service Price: " + y + " Baht");
        }
        if (y > 250 && y <= 500) {
            y = 15 + 13;
            System.out.println("Register Letter Service Price: " + y + " Baht");

        }
        if (y > 500 && y <= 1000) {
            y = 25 + 13;
            System.out.println("Register Letter Service Price: " + y + " Baht");
        }
        if (y > 1000 && y <= 2000) {
            y = 45 + 13;
            System.out.println("Register Letter Service Price: " + y + " Baht");

        }

    }

    static void ems(int z) {
        if (z <= 20) {
            z = 27;
            System.out.println("EMS Letter Service Price: " + z + " Baht");
        }
        if (z > 20 && z <= 100) {
            z = 32;
            System.out.println("EMS Letter Service Price: " + z + " Baht");

        }
        if (z > 100 && z <= 250) {
            z = 37;
            System.out.println("EMS Letter Service Price: " + z + " Baht");

        }
        if (z > 250 && z <= 500) {
            z = 47;
            System.out.println("EMS Letter Service Price: " + z + " Baht");

        }
        if (z > 500 && z <= 1000) {
            z = 62;
            System.out.println("EMS Letter Service Price: " + z + " Baht");

        }
        if (z > 1000 && z <= 2000) {
            z = 77;
            System.out.println("EMS Letter Service Price: " + z + " Baht");

        }
    }

    public static void main(String[] args) {
        int num = 0;
        printmenu();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("Please Enter menu [0-3] : ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("1.NormalLetter");
                    System.out.print("Enter Weight(g) : ");
                    int weight = sc.nextInt();
                    NormalLetter(weight);
                    break;
                case 2:
                    System.out.println("2.Register Letter");
                    System.out.print("Enter Weight(g) : ");
                    int weight2 = sc.nextInt();
                    RegisTer(weight2);
                    break;
                case 3:
                    System.out.println("3.EMS Letter");
                    System.out.print("Enter Weight(g) : ");
                    int weight3 = sc.nextInt();
                    ems(weight3);
                    break;
            }

        } while (num != 0);
        System.out.println("End!!!!");
    }

}
