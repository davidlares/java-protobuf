import main.simple.Simple.SimpleMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java Protobuf");

        // generating a Simple Message with java
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        // adding fields
        builder.setId(29);
        builder.setIsSimple(true);
        builder.setName("David E Lares S");

        // repeated fields
        //builder.addAllSampleList(Array.asList(1,2,3));
        builder.addSampleList(1);
        builder.addSampleList(2);
        builder.addSampleList(3);

        // Checking insertions
        System.out.println(builder.toString());

        // creating the message
        SimpleMessage message = builder.build();

        // adding to bin file
        try {
            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");
            message.writeTo(outputStream);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading from file
        try {
            System.out.println("Reading from file");
            FileInputStream fileInputStream = new FileInputStream("simple_message.bin");
            SimpleMessage messageFromFile = SimpleMessage.parseFrom(fileInputStream);
            // printing file
            System.out.println(messageFromFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
