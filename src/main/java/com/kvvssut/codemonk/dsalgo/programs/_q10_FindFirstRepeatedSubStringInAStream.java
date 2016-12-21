package com.kvvssut.codemonk.dsalgo.programs;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;

public class _q10_FindFirstRepeatedSubStringInAStream {

	public static void main(String[] args) throws IOException {
		Reader reader = null;
		try {
			reader = new InputStreamReader(System.in);

			HashSet<String> substringSet = new HashSet<String>();
			StringBuilder stringBuilder = new StringBuilder();
			int ch;

			if ((ch = reader.read()) != -1) {
				stringBuilder.append((char) ch);
			}
			if ((ch = reader.read()) != -1) {
				stringBuilder.append((char) ch);
			}
			if ((ch = reader.read()) != -1) {
				stringBuilder.append((char) ch);
			}

			substringSet.add(stringBuilder.toString());

			while ((ch = reader.read()) != -1) {
				stringBuilder.insert(0, ch);
				if (substringSet.contains(stringBuilder.toString())) {
					System.out.println(stringBuilder.toString());
					return;
				} else {
					substringSet.add(stringBuilder.toString());
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		System.out.println("No duplicate Substring found!");

	}

}
