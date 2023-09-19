import java.util.*;

public class duplicates{
    public static void removeD(String str, int index, StringBuilder newstr, boolean map[]){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }

        char curr=str.charAt(index);
        if(map[curr-'a']==true){
            removeD(str,index+1,newstr,map);
        }else{
            map[curr-'a']=true;
            removeD(str,index+1,newstr.append(curr),map);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("enter the duplicate string:");
        String str = sc.nextLine();
        removeD(str,0,new StringBuilder(""),new boolean[26]);

    }
}