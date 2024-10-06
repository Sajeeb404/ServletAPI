import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.*;


public class MySerializableServlet extends GenericServlet implements Serializable {

    private static final long serialVersionUID = 1L; // Required for Serializable classes

    private String greeting;

    public MySerializableServlet(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        // Handle the request
    }

    @Override
    public String toString() {
        return "MySerializableServlet: " + greeting;
    }



}
//
//class SerializeServlet{
//    public static void main(String[] args) {
//        MySerializableServlet servlet = new MySerializableServlet("Hello, World!");
//
//        try (FileOutputStream fileOut = new FileOutputStream("servlet.ser");
//             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//            out.writeObject(servlet);
//            System.out.println("Serialized data is saved in servlet.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//    }
//}
//
//
//
//class DeserializeServlet {
//    public static void main(String[] args) {
//        MySerializableServlet servlet = null;
//
//        try (FileInputStream fileIn = new FileInputStream("servlet.ser");
//             ObjectInputStream in = new ObjectInputStream(fileIn)) {
//            servlet = (MySerializableServlet) in.readObject();
//            System.out.println("Deserialized Servlet: " + servlet);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
