import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class Assignment1_Java_1 {

  public static void main(String[] args) {

    // Convert the string to a byte array.
    String Name = "Aslahuddin Mohd Zainal Arifin\n";
    String Address = "No 2, Jalan Prima 7/5, Taman Puchong Prima, 47150 Puchong, Selangor\n";
    byte data1[] = Name.getBytes();
    byte data2[] = Address.getBytes();
    Path p = Paths.get("Aslahuddin.txt");

    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE))) {
      out.write(data1, 0, data1.length);
      out.write(data2, 0, data2.length);
      out.close();
    } catch (IOException x) {
      System.err.println(x);
    }
  }
}