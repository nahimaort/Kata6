import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;

public class Main {
    
    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        business.add("submarine", new AmericanSubmarineToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")) {
            line = in.nextLine();
            
            switch (line) {
                case "car":
                case "submarine":
                case "helicopter":
                    toys.add(business.produceToy(line));
                    System.out.println("Built toys: " + toys.stream()
                            .map(t -> t.toString())
                            .collect(Collectors.joining(", ")));
                    break;
                    
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown");
            }
        }
    }
}
