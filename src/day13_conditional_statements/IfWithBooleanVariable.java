package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry=true;
        if(isHungry){  //  ===>same if(isHungry==true)
            System.out.println("I am hungry, i will go get something to eat!\nThen code java!");
        }else{
            System.out.println("I am not hungry, I will keep coding java!");
        }
        double price =  130.44;
        boolean isAffordable= price<=200.0;
        if(isAffordable){
            System.out.println("I can afford, let's buy!");
        }else{
            System.out.println("Too expensive, let's keep coding java");
        }

        boolean isRemoteJob = false;
        //if it NOT remoteJob print "Sorry I am not interested"
        //otherwise, print "Sure I am interested, what is the interview process?"
        //if(isRemoteJob != true) {
        //if( isRemoteJob == false) {
        if(!isRemoteJob) {
            System.out.println("Sorry, I am not interested");
        } else {
            System.out.println("Sure, I am interested, what is interview process?");
        }
    }
}
