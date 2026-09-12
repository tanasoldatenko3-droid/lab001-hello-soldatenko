package by.bseu.soldatenko.lab001;
import org.apache.commons.lang3.StringUtils;
public class HelloApplication {
    public static void main(String[] args) {
        String studentName = "Tatiana";
        String greeting = "hello, " + studentName + "!";

        System.out.println(StringUtils.capitalize(greeting));
        System.out.println("My first Maven project works!");
    }
}
