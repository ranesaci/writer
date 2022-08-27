package decorator.impl;

import decorator.WriterDecorator;
import writer.IWriter;

public class UpperCaseWriterDecorator extends WriterDecorator{

	public UpperCaseWriterDecorator(IWriter Writer) {
		super(Writer);
	}

	@Override
	public boolean write(String data) {
		String decoratedData = data.toUpperCase(); 
		writer.write(decoratedData);
		return true;
	}

}
