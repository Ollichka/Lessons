package Lesson1.Numbers;

public class Number {


    public void find(int n) {
        int i=1,sum=0,k=1;

        for (i = 1; i < n; i++) {
            sum = 0;  // обнуление суммы делителей
            for (k= 1;k <= i/2; k++) {
                if (i % k == 0)
                    sum = sum + k;
            }
            if (i == sum)
                System.out.println("совершенное \n"+ i);

        }
    }

}
