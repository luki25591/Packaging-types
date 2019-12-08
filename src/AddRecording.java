import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.LongBuffer;

public class AddRecording {
    public void dateRecording(){
        String name = "Liczby";
        int number1 = 123;
        int number2 = 1234;
        int number3 = 12345;
        //BigInteger number4 = BigInteger.valueOf(123456789123456789L);
        //BigInteger number5 = BigInteger.valueOf(987654321987654321L);

        try(
                var fileWriter = new FileWriter(name);
                var writer = new BufferedWriter(fileWriter);
        ){
            writer.write(Integer.toString(number1));
            writer.newLine();
            writer.write(Integer.toString(number2));
            writer.newLine();
            writer.write(Integer.toString(number3));
            writer.newLine();
            //writer.write(String.valueOf((long) 123456789123456789L));
            //writer.newLine();
            //writer.write(String.valueOf((long) 987654321987654321L));
            //writer.newLine();
        }catch(IOException e){
            System.out.println("Nie udało się zapisać pliku: " + name);
        }
    }


}
