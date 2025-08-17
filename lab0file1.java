inport java.util.Scanner
public class lab0file1 {
        public static void main(String[] args) {
                Scanner scan = new Scanner (System.in);
                System.out.println("Please enter a Verb: ");
                String verb = scan.next();
                System.out.println("Please enter a Adjective: ");
                String adjective = scan.next();
                System.out.println("Please enter a Noun: ");
                String noun = scan.next();
                System.out.println("They wanted to "+verb+" a "+adjective+" "+noun+" for the science fair");
        }
}
