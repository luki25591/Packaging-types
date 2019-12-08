import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CreateFile createFile = new CreateFile();
        AddRecording addRecording = new AddRecording();
        DataReading dataReading = new DataReading();

        createFile.fileCreate();
        addRecording.dateRecording();
        dataReading.raiding();
        dataReading.addNumbers();
    }
}
