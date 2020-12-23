package com.java;

import java.io.*;

import java.util.HashMap;

import java.util.Scanner;

public class ReadTSV {

	public static void main(String[] args) throws Exception {
		HashMap<String, String> musicMap = new HashMap<String, String>();
		// parsing a TSV file into Scanner class constructor
		Scanner sc = new Scanner(new File("C:\\Users\\raviteja.kothuru\\Downloads\\musical_group.tsv"));
		Scanner dataScanner = null;
		
		int index=1;
		
		while (sc.hasNextLine()) // returns a boolean value
		{
			
			dataScanner = new Scanner(sc.nextLine());
			dataScanner.useDelimiter("/m/");	// sets the delimiter pattern
			MusicDataModel tsv = new MusicDataModel();
			while (dataScanner.hasNext()) {
				String data = dataScanner.next();
				if (index == 0)
					tsv.setName(data);
				else if (index == 1)
					tsv.setId(data);
				else
					System.out.println(data);
				index++;
			}
			
		}
		sc.close();
		//MusicDataModel mdm = new MusicDataModel();
		//musicMap.put(mdm.getName(),mdm.getId());
	}

}
