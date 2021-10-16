import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string=");
        String str1=sc.nextLine();
        System.out.println("Enter the second string=");
        String str2=sc.nextLine();
        boolean isAnagram=true;
        int al[]=new int[256];
        //int bl[]=new int[256];
        for(char c:str1.toCharArray())
        {
            int index=(int) c;
            al[index]++;
        }
        for (char c:str2.toCharArray())
        {
            int index=(int)c;
            al[index]--;
        }
        for (int i=0;i<256;i++)
        {
            if (al[i]!=0)
                isAnagram=false;
            break;
        }
        if (isAnagram) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }
    }
}
