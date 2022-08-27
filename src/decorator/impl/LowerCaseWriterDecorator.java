package decorator.impl;

import decorator.WriterDecorator;
import writer.IWriter;

public class LowerCaseWriterDecorator extends WriterDecorator{

	public LowerCaseWriterDecorator(IWriter Writer) {
		super(Writer);
	}

	@Override
	public boolean write(String data) {
		String decoratedData = data.toLowerCase(); 
		writer.write(decoratedData);
		return true;
	}

}
