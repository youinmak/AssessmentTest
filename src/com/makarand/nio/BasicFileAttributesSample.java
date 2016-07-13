package com.makarand.nio;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Stream;

public class BasicFileAttributesSample {

	public static void main(String[] args) throws IOException {

		final Path path = Paths.get("C:\\postpaid\\proxies.pac");

		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
		Console console = System.console();
		if (console == null) {
			System.out.println("Console is null");
		}
		System.out.println("IS path a directory? " + data.isDirectory());
		System.out.println("Is path regular file? " + data.isRegularFile());
		System.out.println("IS path a symbolic link? " + data.isSymbolicLink());
		System.out.println("Is path not a file, directory, nor symbolic link? " + data.isOther());

		System.out.println("Size in bytes " + data.size());
		System.out.println("Creation Date/Time " + data.creationTime());
		System.out.println("Last modified Date/Time " + data.lastModifiedTime());
		System.out.println("Last accesed Date/Time " + data.lastAccessTime());

		System.out.println("Unique file identifier (if available): " + data.fileKey());

		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

		FileTime lastModifiedTime = FileTime.fromMillis(System.currentTimeMillis() + 10_000);

		view.setTimes(lastModifiedTime, null, null);

		final Path hybrisPath = Paths.get("C:\\postpaid\\hybris");
		Instant start = Instant.now();
		Stream myStream = null;
		try (Stream<Path> walk = Files.walk(hybrisPath);
				PrintWriter bw = new PrintWriter(new File("C:\\postpaid\\hybris\\allFileNames.txt"))) {
			myStream = walk.flatMap(s -> Stream.of(s));
			walk.forEach(bw::println);
		}
		
		Instant end = Instant.now();
		test(path);
		System.out.println("Execution completed in :"+ Duration.between(start, end).toMillis() +" mili seconds");
	}
	
	private static void test(final Path path) throws IOException{
		List<String> allLines = Files.readAllLines(path);
		try(Stream<String> lines = Files.lines(path)){
			
		}
		
		
		
	}
}
