class MultiThread extends Thread {

    private double[] array;
    private int min, max;

    public MultiThread(double[] array, int min, int max){
        this.array = array;
        this.min = min;
        this.max = max;
    }

    public static double sum(double[] array, int min, int max){
        double total = 0;
        for (int i = 0; i < max; i++) {
            total = array[i];
        }
        return total;
    }

    public static double sum(double[] array)
    {
        return sum(array,0,10);
    }

    public void run(){
        System.out.println("Thread running");
        sum(array, min, max);
    }

}

