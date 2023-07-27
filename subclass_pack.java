//Code of program1 in Package

package Protection;

public class Protectionpackage {
    public String str1 = "I am Public";
    private String str2 = "I am Private";
    protected String str3 = "I am protected";

    public void readString() {
        System.out.println("Public String : " + str1);
        System.out.println("Private String : " + str2);
        System.out.println("Protected String : " + str3);
    }
}

//Code of program2 in same Package

package Protection;

public class Protection2package extends Protectionpackage {
    public void readStringextends() {
        System.out.println("Public String accessible within package : " + str1);
        System.out.println("Private String is not accessible within package");
        System.out.println("Protected String accessible within package : " + str3);
    }
}

//Code of program outside the package

import Protection.*;

public interface Protection {
    public static void main(String args[]) {
        Protection2package p2 = new Protection2package();
        Protectionpackage p1 = new Protectionpackage();
        p1.readString();
        p2.readStringextends();
        System.out.println("Public string accessible outside package :" + p1.str1);
        System.out.println("Private string is not accessible outside package");
        System.out.println("Protected string is not accessible outside package");

    }
}
