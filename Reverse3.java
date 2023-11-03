package org.example.add;

public class Reverse3 {

    public int number1;

        public Reverse3(){
        }

        public Reverse3(int number1){
            this.number1 = number1;
        }

    public int reverse() {

            double double_of_number1 = number1;
        return ((int)((100*(number1%10))+(10*((Math.floor(double_of_number1/10))%10))+(Math.floor(double_of_number1/100))));}


    public  static void print(int number) {
        System.out.println(number);

    }


}
