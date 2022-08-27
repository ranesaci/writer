package writer.impl;

import writer.IWriter;

public class MyStringWriterImpl implements IWriter{

	@Override
	public boolean write(String data) {
		System.out.println("written data as:" + data);
		return true;
	}

	
}
