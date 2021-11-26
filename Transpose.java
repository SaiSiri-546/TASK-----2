import java.util.*;  
class Transpose 
{  
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("Enter total no of rows and columns: ");  
    Scanner sc = new Scanner(System.in);  
    int r = sc.nextInt();  
    int c = sc.nextInt();  
    int arr[][] = new int[r][c];  
    System.out.println("Enter matrix:");  
    for(i = 0; i < r; i++){  
        for(j = 0; j < c; j++){ 
            arr[i][j] = sc.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("Matrix before Transpose is ");  
    for(i = 0; i < r; i++){  
            for(j = 0; j < c; j++){  
            System.out.print(arr[i][j]+" ");  
            }  
            System.out.println(" ");  
    }  
    System.out.println("Matrix after Transpose is ");  
    for(i = 0; i < c; i++){  
            for(j = 0; j < r; j++){  
                System.out.print(arr[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
} 
