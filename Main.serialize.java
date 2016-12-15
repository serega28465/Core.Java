import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException{
		String stringForFilePath = "C:\\D\\Серый\\javaFile";
		
		FileOutputStream fos;
		ObjectOutputStream out = null;
		
		Counter counter = new Counter(1, "Serega");
		try {
			fos = new FileOutputStream(stringForFilePath);
			out = new ObjectOutputStream(fos);
			out.writeObject(counter);
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.close();
	}

}
