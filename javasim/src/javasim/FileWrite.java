package javasim;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public void filewrite(String abc) throws IOException {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\SKJ\\Desktop\\Excal.txt", true);

			fw.write(abc);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
