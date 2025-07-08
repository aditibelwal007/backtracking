import java.util.Scanner;
public class Main {

    public static void printPermutation(String str,String perm,int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currChar,idx+1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your choice :");
        String str = sc.next();
//        String str ="ABCD";
        printPermutation(str,"",0);
    }

}