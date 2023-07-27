//package file (Code of Package)
//Make a Folder of any name eg. MultiFile
//Under that folder put code of package with any name eg.MultiFilepackage.java

package MultiFile;

import java.util.Scanner;

public class MultiFilepackage {
    public String str1;

    public void readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str1 = sc.nextLine();
        sc.close();
    }
}

//program file (Code to import Package)
//import the code of package file you put in your folder
//in my case folder is MultiFile and name of code file is MultiFilepackage.java so import MultiFile.MultiFilepackage.java

import MultiFile.MultiFilepackage;

public class MultiFile {
    public static void main(String args[]) {

        MultiFilepackage p1 = new MultiFilepackage();
        p1.readString();
        System.out.println(p1.str1);
    }
}
