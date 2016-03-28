import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1_Java_2 {

  public static void main(String[] args) throws IOException  {

    // File to read.
    Path fileIn = Paths.get("Aslahuddin.txt");
    // File to write in binary
    String fileout = "Aslahuddin.bin";
    // Read text file using Files.*
    byte[] buffer = Files.readAllBytes(fileIn);

    // Use stream for binary write
    FileOutputStream outputStream = new FileOutputStream(fileout);
    // Write from the buffer
    outputStream.write(buffer);
    // Close file
    outputStream.close();

    System.out.println("Wrote " + buffer.length + " bytes");
  }

}
