package org.example;

public class RemoveJunk {
    public static void main(String[] args) {
        String str="(&*&%&@Om$#%Sai*&*Ram&***&*&*&&%@";
        removeJunkCharsFromString(str);

    }
    public static void removeJunkCharsFromString(String str){
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
