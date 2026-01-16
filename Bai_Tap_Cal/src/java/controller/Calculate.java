
package controller;

/**
 *
 * @author Admin
 */
public class Calculate {
    int num1;
    int num2;

    public Calculate() {
    }

    public Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int total(int num1, int num2){
        return num1+num2;
    }
    
    public int difference(int num1, int num2){
        return num1-num2;
    }
    public int product(int num1, int num2){
        return num1*num2;
    }
    
    public float quotient(int num1, int num2){
        return (float) num1/num2;
    }
}
