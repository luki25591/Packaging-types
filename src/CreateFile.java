import java.io.File;
import java.io.IOException;

public class CreateFile {

    public void fileCreate(){
        String name = "Liczby";
        File file = new File(name);

        boolean fileExists = file.exists();
        if(!fileExists){
            try{
                fileExists = file.createNewFile();
            }catch(IOException e){
                System.out.println("Nie udało się utworzyć pliku!");
            }
        }
        if(fileExists){
            System.out.println("Plik " + name + " już istnieje!");
        }
    }




}
