package myLockedMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class LockedMe {
        public static final String filePath = "C:\\Users\\harsh\\Project Folder";
     //Sprint -1
    /**
     * This method is used to display the content of Menu list.
     */
    public static void display()
        {
            System.out.println("Menu :");
            System.out.println("1. Get All Files");
            System.out.println("2. Add a New File");
            System.out.println("3. Delete a File");
            System.out.println("4. Search a File");
            System.out.println("5. Exit");
        }

    /**
     * This method is used to get all existing files in your folder and returns "No Files are there in Folder" if folder is empty.
     */
        public static void getAllFiles() {
        try {
            File folder = new File(filePath);
            File[] listOfFolder = folder.listFiles();
            if (listOfFolder.length > 0) {
                System.out.println("Below are the files with path :");
                for (int i = 0; i < listOfFolder.length; i++) {
                    System.out.println(i + 1 + " " + listOfFolder[i]);
                }
                System.out.println("-------------------------------------------------------");
            } else {
                System.out.println("No Files are there in Folder");
            }
        }
        catch (InputMismatchException ex)
        {
            System.out.println("volume label syntax is incorrect");
        }
    }

    //Sprint -2
    /**
     * This Method is used to Add files in your Folder , and says "File is already exist" when you entered already existed file.
     */
    public static void addFiles(String filename) throws IOException {
        try {
            boolean file = false;
            File folder = new File(filePath);
            String[] listOfFolder = folder.list();
            ArrayList<String> arr = new ArrayList<String>();
            if(listOfFolder.length>0)
            {
                for(int i = 0 ; i<listOfFolder.length; i++)
                {
                    if(listOfFolder[i].equals(filename))
                    {
                        System.out.println("File is already Exist");
                        file = true;
                        break;
                    }
                }
                if(!file)
                {
                    File f = new File(filePath+"\\"+filename);
                    FileWriter fw = new FileWriter(f);
                    String s = String.valueOf(arr.add(filename));
                    fw.write(s);
                    //fw.write(filename);
                    System.out.println(filename+" is Added to folder");
                }
// This else is used when file is empty and user entered file is the first one
            }else
            {
                File f = new File(filePath+"\\"+filename);
                FileWriter fw = new FileWriter(f);
                fw.write(filename);
                System.out.println(filename+" is Added to Folder");
            }
        }
        catch (Exception Ex)
        {
            System.out.println("volume label syntax is incorrect");
        }
    }
    }




