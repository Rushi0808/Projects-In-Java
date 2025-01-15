package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileHandlingOp {
	
	
	public void CreateaFile(String filename) {
	try {
		File file=new File(filename);
			if(file.createNewFile()) {
				System.out.println("------------------------------");
				System.out.println("File Created :"+file.getName());
				System.out.println("--------------------------------");
			}else {
				System.out.println("File Is Already Exists");
			}
		}catch (IOException e) {
			System.out.println("An error Occurred");
			e.printStackTrace();
		}
	}
	
	public void ReadFromFile(String fileName) {
	
		        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		            String line;
		            while ((line = br.readLine()) != null){
		                System.out.println(line);
		                
		            }
		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		        }
		    }

		    public void writeToFile(String fileName, String content) {
		        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
		            bw.write(content);
		            System.out.println("Content written to file.");
		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		        }
		    }

		    public void appendToFile(String fileName, String content) {
		        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
		            bw.write(content);
		            System.out.println("Content appended to file.");
		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		        }
		    }

		    public void deleteFile(String fileName) {
		        File file = new File(fileName);
		        if (file.delete()) {
		            System.out.println("File deleted: " + file.getName());
		        } else {
		            System.out.println("Failed to delete the file.");
		        }
		    }
		}


