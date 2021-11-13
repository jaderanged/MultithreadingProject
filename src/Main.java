import java.util.Random;

public class Main {

    public static void main(String[] args){
        double[] array = new double[200000000];
        double max = 10;
        Random random = new Random();
        long startTime = System.nanoTime();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextDouble((max) + 1) + random.nextDouble((max) + 1);
        }
        long endTime = System.nanoTime();
        System.out.println(MultiThread.sum(array));
        System.out.println("Single: " + (endTime - startTime));
        //System.out.println(MultiThread.multiOutput(array));
        //System.out.println("Multiple: " + (endTime - startTime));

    }
}
