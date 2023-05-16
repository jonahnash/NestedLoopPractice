public class NestedLoopPractice {
    public static void main(String[] args) {
        NestedLoopPractice n = new NestedLoopPractice();
    }
    public NestedLoopPractice(){
        patternOne();
        patternTwo();
        patternThree();
        patternFour();
        patternFive();
        patternSix();
        patternSeven();
        patternSevenPointFive();
        patternEight();
        patternNine();
    }
    public void patternOne(){
        System.out.println("Pattern One");
        int patOne = 0;
        for(int i=0;i<6;i++){
            System.out.println(patOne);
            patOne = patOne + 5;
        }
    }
    public void patternTwo(){
        System.out.println("Pattern Two");
        int patTwo = 2;
        for(int i=0;i<6;i++){
            System.out.println(patTwo);
            patTwo = patTwo + 5;
        }
    }
    public void patternThree(){
        System.out.println("Pattern Three");
        int patThree = 21;
        for(int i=0;i<6;i++){
            System.out.print(patThree + " ");
            patThree = patThree - 4;
        }
        System.out.println();
    }
    public void patternFour(){
        System.out.println("Pattern Four");
        int patFour = 1;
        int addedNumber = 3;
        for(int i=0;i<6;i++){
            System.out.print(patFour + " ");
            patFour = patFour + addedNumber;
            addedNumber = addedNumber + 2;
        }
        System.out.println();
    }
    public void patternFive(){
        System.out.println("Pattern Five");
        String patFive = "1 2 3 4";
        for(int i=0;i<4;i++){
            System.out.println(patFive);
        }
    }
    public void patternSix(){
        System.out.println("Pattern Six");
        String patSix = "";
        for(int i=0;i<6;i++){
            System.out.println(patSix + i);
            patSix = patSix + " ";
        }
    }
    public void patternSeven(){
        System.out.println("Pattern Seven");
        for(int i=1;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public void patternSevenPointFive(){
        System.out.println("Pattern Seven.5");
        for(int i=1;i<6;i++){
            for(int j=6;j>i;j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public void patternEight(){
        System.out.println("Pattern Eight");
        String patEight = " ";
        for(int i=1;i<6;i++){
            for(int j=6;j>i;j--) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(patEight);
            patEight = patEight + " ";
        }
    }
    //patternNine not completed yet
    public void patternNine(){
        System.out.println("Pattern Nine");
        String patNine = "*";
        //System.out.print(patNine);
        for(int i=1;i<9;i++){
            if(i<5){
                System.out.print("    *");
                for(int h=1; h<i;h++){
                    System.out.print("**");
                }
                System.out.println();
            }else{
                for(int j=5;j>i;j--) {
                    System.out.print("**");
                }
                System.out.println();
                patNine = " " + patNine;
                System.out.print(patNine);
            }
        }
    }
}