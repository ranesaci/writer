package writer.impl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import writer.IWriter;

public class MyFileWriterImpl implements IWriter {
	String fileName;
	
	public MyFileWriterImpl(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public boolean write(String data) {
		
		try {
			FileOutputStream fos = new FileOutputStream(new File(fileName));
			fos.write(data.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
