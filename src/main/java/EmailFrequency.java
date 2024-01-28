import util.EmailHelper;

import java.util.*;

public class EmailFrequency {

    private static EmailHelper emailHelper = new EmailHelper();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many email you will enter? - ");
        int numberOfEmails = scanner.nextInt();

        List<String> domains = new ArrayList<>();
        scanner.nextLine();

        while(numberOfEmails >0){
            String email = scanner.nextLine();
            parseDomain(domains, email);
            numberOfEmails--;
        }

        Map<String, Integer> domainToCount = emailHelper.calculateEmailFrequency(domains);
        print(domainToCount);
    }

    private static void parseDomain(List<String> domains, String email) {
        if(emailHelper.validate(email)) {
            domains.add(emailHelper.getDomain(email));
        } else{
            System.out.printf("%s is not valid email format. we skip it%n", email);
        }
    }


    private static void print(Map<String, Integer> domainToCount ) {
        domainToCount.keySet().stream().limit(10)
                .forEach(e->System.out.println(e +":" + domainToCount.get(e)));
    }

}
