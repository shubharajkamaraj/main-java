import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

       
        Pattern(1, rows);
    }

   
    public static void Pattern(int currentRow, int totalRows) {
        if (currentRow > totalRows) {
            return;
        }
        String dollar = String.format("%" + currentRow + "s", "").replace(" ", "$");
        System.out.println(dollar);

    
       Pattern(currentRow + 1, totalRows);
    }
}


// Output


C:\Users\User1\Desktop\java programs>java Dollar
Enter the number of rows: 5
$
$$
$$$
$$$$
$$$$$
