
public class MultiTable {
    public static void main(String[] args) {
        System.out.println("--------------------");
        for (int i = 1; i <= 12; i++) {
            System.out.print("\t"+i);
        }
        System.out.println("\n----------------------------------");
        for (int i = 2; i <= 12; i++) {
            System.out.print(i+"\t");
            for (int j = 1; j <= 12; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println("");
        }
    }
}//end class