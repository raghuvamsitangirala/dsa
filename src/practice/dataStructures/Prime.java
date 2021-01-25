import java.lang.Math;

public class Prime{
    
    public void primeNumber(){

        for(int i = 0; i < 25; i++){
            // Checking if i is a prime number by dividing with each number between [2,i-1]
            if(i == 2 || i == 3)
            {
                System.out.println(i);
            }

            for(int j = 2; j <= Math.sqrt(i) ; j++ ){
                // If i is divisible by j then break the loop (stop checking if i is prime) and continue to next value of i
                if(i%j == 0){
                    // When the code hits break here, the execution within this loop stops and proceeds to outer loop's next value. (Note that i is automatically incremented by i++ in for loop definition)
                    break;
                }
                // Round gives the closest possible integer
                //(int) is used to typecasting an float value
                else if(j == (int)Math.sqrt(i))
                {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        p.primeNumber();
    }
}