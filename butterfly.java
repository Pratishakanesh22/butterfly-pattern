

public class butterfly{
    public static void main(String[]args){
                 int n= 5;
//upper half
for(int i= 1; i<=n; i++){
    //first half
    for(int j= 1; j<=i; j++){
        System.out.print("*");
    }
    // spaces
    int space = 2*(n-i);
    for(int j=1; j<=space; j++){
    System.out.print( " ");
    }
//2nd part 
for(int j=1; j<=i; j++){
System.out.print("*");
}
    System.out.println();
}

//lower half
for(int i= n; i>=1; i--){
    //first half
    for(int j= 1; j<=i; j++){
        System.out.print("*");
    }
    // spaces
    int space = 2*(n-i);
    for(int j=1; j<=space; j++){
    System.out.print( " ");
    }
//2nd part 
for(int j=1; j<=i; j++){
System.out.print("*");
}
    System.out.println();
}

    }
}