package oral;
import java.io.*;
import java.sql.DriverManager;


class iostream{
	public static void main(String[] args) throws IOException {
		FileInputStream inStream =null;
		FileOutputStream outStream = null;
		try {

			inStream = new FileInputStream("D:\\Java\\Shreyash\\src\\oral\\abc.txt");
			outStream = new FileOutputStream("D:\\Java\\Shreyash\\src\\oral\\abcd.txt");
			int b;
			while ((b = inStream.read()) != -1) {
				outStream.write((byte)b);
			}
		}
		finally{
			if(inStream!=null){
				inStream.close();
			}
			if(outStream!=null){
				outStream.close();
			}

		}
	}
}