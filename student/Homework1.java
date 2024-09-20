package student;


public class Homework1 {

    public double shippingCalculator(int n){
        return 10.95+(n-1)*2.95;
    }
    public boolean isValidTriangle(int a, int b, int c){
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }else {
            return false;
        }


    }
    public boolean isPrime(int number){
        boolean isP = false;
        for (int i = 2; i < (number); i++) {
            if (number % i != 0) {
               isP=true;
            }
        }
        return isP;
    }

    public  static int hex2int(String hex) {
        hex=hex.toUpperCase();
        if (hex.length()>1){
            return -1;
        }else if (hex.matches("[A-F]")){
            return hex.charAt(0)-'A'+10;
        }
        if (hex.matches("[0-9]")){
            return Integer.parseInt(hex);
        }
        return 0;
    }
    public String int2hex(int value) {
        if (value < 0 && value > 15) {
            return "Invalid value";
        }else if (value<=9) {
            return String.valueOf(value);
        }else{
            return String.valueOf((char)('A' + value - 10));
        }

    }


}
