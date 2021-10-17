package prac.prac03;

public class Chap03_12 {//Add.Java 작성 프로그램

    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i< args.length; i++){
            try {
                sum += Integer.parseInt(args[i]);
            }catch (NumberFormatException e){
                continue;
            }
        }
        System.out.println(sum);
    }
}
