public class Main {
    public static void main(String[] args) {


        bmi bmi=new bmi("n1",29,97,1.9);
        System.out.printf("BMI: %.2f\n%s",bmi.getBMI(), bmi.getStatus());
    }

}