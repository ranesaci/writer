package writer.impl;

import writer.IWriter;

public class WriterInvoker implements IWriter{
	private IWriter iWriter;
	
	public WriterInvoker(IWriter writer) {
		this.iWriter = writer;
	}

	@Override
	public boolean write(String data) {
		return iWriter.write(data);
	}

}
