public class largestString {
public static void main(String args[]){
    String str[] = { "Apple" , "Banana" , "Mango"};
    String largest = str[0];

    for(int i=0; i<str.length; i++){
        if(largest.compareTo(str[i]) <0){   // comapreTo function
            largest = str[i];
        }

    }
    System.out.println(largest);
}
    
}
