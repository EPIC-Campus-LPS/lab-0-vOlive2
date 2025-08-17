import java.util.Scanner
public class lab0file1 {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Verb: ");
                String verb = scan.next();
                System.out.println("Adjective: ");
                String adjective = scan.next();
                System.out.println("Noun: ");
                String noun = scan.next();
                System.out.println("They wanted to "+verb+" a "+adjective+" "+noun+" for the science fair");
        }
}
