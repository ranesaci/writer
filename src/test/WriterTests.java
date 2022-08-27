package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import decorator.impl.RemoveDuplicateWriterDecorator;
import decorator.impl.UpperCaseWriterDecorator;
import writer.IWriter;
import writer.impl.MyFileWriterImpl;
import writer.impl.WriterInvoker;

public class WriterTests {

	public static void main(String[] args) throws IOException {
		
		String fileName = "sachin.txt";
		
		String data = "It is raining and sounding as tip tip tip with lightings";
		IWriter iWriter = new MyFileWriterImpl(fileName);
		iWriter.write(data);
		System.out.println("***********************");
		System.out.println("input  Data:" + data);
		System.out.println("Written Data:" + readData(fileName));
		System.out.println("***********************");
		
		data = "It is raining and sounding as tip tip tip with lightings";
		iWriter = new UpperCaseWriterDecorator(new RemoveDuplicateWriterDecorator(new WriterInvoker(new MyFileWriterImpl(fileName))));
		iWriter.write(data);
		System.out.println("WITH UPPERCASE and REMOVE duplicate Decorator***********************");
		System.out.println("input  Data:" + data);
		System.out.println("Written Data:" + readData(fileName));
		System.out.println("***********************");

	}
	
	public static String readData(String fileName) throws IOException {
		return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8).stream().collect(Collectors.joining());
	}

}
