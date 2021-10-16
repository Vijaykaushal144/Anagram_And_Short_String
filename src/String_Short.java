import java.util.Scanner;

public class String_Short {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the string=");
        String str= sc.nextLine();

        char[] arry = str.toCharArray();
        char temp=0;
        int i;
        for (i=0;i<arry.length;i++)
        {
            for (int j=0;j<arry.length;j++)
            {
                if (arry[j]>arry[i])
                {
                    temp=arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;

                }
            }
        }
        for (int k=0;k<arry.length;k++)
        {
            System.out.print(arry[k]+" ");
        }

    }
}
