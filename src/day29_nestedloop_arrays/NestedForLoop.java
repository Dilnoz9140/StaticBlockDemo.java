package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        int sec=0; int min=0,hour=0;
        for( hour=0;hour<24;hour++)
            for( min=0;min<60;min++)
                for(sec=0;sec<60;sec++){
                    String time=hour+":"+min+":"+sec;
                    System.out.println(time);
                    Thread.sleep(1000);


                }

    }
}
