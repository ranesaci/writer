package decorator.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import decorator.WriterDecorator;
import writer.IWriter;

public class RemoveDuplicateWriterDecorator extends WriterDecorator{

	public RemoveDuplicateWriterDecorator(IWriter Writer) {
		super(Writer);
	}

	@Override
	public boolean write(String data) {
		String decoratedData = removeDuplicatesFromString(data);
		writer.write(decoratedData);
		return true;
	}

	private String removeDuplicatesFromString(String data) {
		String[] dataArr = data.split("\\s+");
		Set<String> set = new LinkedHashSet<>();
		for(String word: dataArr) {
			set.add(word);
		}
		
		
		return set.stream().collect(Collectors.joining(" "));
	}

}
