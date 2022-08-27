package decorator;

import writer.IWriter;

public abstract class WriterDecorator implements IWriter{
	
	protected IWriter writer;
	
	public WriterDecorator(IWriter Writer) {
		this.writer = Writer;
		
	}
	
	public abstract boolean write(String data);

}
