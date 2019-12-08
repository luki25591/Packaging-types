import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class DataReading {

    public void raiding() throws FileNotFoundException {
        String name = "Liczby";
        File file = new File(name);
        Scanner sc = new Scanner(file);

        int sum = 0;
        while(sc.hasNextLine()){
            String name1 = sc.nextLine();
            System.out.println("Liczba: " + name1);
            int numbers = Integer.parseInt(name1);
            sum = sum + numbers;
            System.out.println("Suma podanych liczb wynisi: " + sum);
        }
        sc.close();
    }

    public void addNumbers(){
        AddRecording addRecording = new AddRecording();
        BigInteger a = new BigInteger("123456789123456789");
        BigInteger b = new BigInteger("987654321987654321");

        BigInteger sum = a.add(b);
        System.out.println("Suma BigInteger wynosi: " + sum);
    }


}
