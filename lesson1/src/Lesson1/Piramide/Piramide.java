package Lesson1.Piramide;

public class Piramide {

    public  void show(int n){
        piramida(n);

    }

    public  void piramida(int n){
        if(n<0||n>10){
            System.out.println("try another height");
            return;
        }
        int k =n+1;
        for(int i =1;i<n+1;i++){
            for(int j=1;j<k;j++){
                System.out.print(" ");
            }
            k--;
            int j = 1;
            for(;j<i;j++){
                System.out.print(j);
            }
            for(;j>0;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}
