package lt.vtmc.ks;

public class MathUtils {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
    public int multiplay(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }

    public double computeCircleArea(double radius){
        if(radius < 0) {throw new IllegalArgumentException();}

        return Math.PI * Math.pow(radius,2);
    }
}
