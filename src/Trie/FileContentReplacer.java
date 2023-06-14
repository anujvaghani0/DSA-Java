package Trie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContentReplacer {
    public static void main(String[] args) {
        String directoryPath = "/Users/anujvaghani0/IdeaProjects/DSA/src/DynamicProgramming";
        String searchString = "package DynamicProgramming;";
        String replacementString = "package DynamicProgramming; ";

        // Get all the Java files in the directory
        File directory = new File(directoryPath);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".java"));

        if (files != null) {
            for (File file : files) {
                try {
                    // Read the file
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        // Replace the search string with the replacement string
                        line = line.replace(searchString, replacementString);
                        content.append(line).append("\n");
                    }
                    reader.close();

                    // Write the modified content back to the file
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(content.toString());
                    writer.close();

                    System.out.println("Modified file: " + file.getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
