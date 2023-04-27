import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("Inscrições 6#HACKATONAges(1-2).csv");
        Scanner data = new Scanner(file);

        while (data.hasNextLine()) {
            String row = data.nextLine();
            String[] column = row.split(";");
            System.out.println(column[0]);
        }

        data.close();
    }

}