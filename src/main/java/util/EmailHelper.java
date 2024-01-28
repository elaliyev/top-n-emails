package util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailHelper {

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public String getDomain(String email)
    {
        return  email.substring(email.indexOf("@") + 1);
    }

    public boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }

    public Map<String, Integer> calculateEmailFrequency(List<String> domains) {
        Map<String, Integer> domainToCount = new HashMap<>();
        for(String domain: domains) {
            domainToCount.put(domain,domainToCount.getOrDefault(domain,0)+1);
        }
        return domainToCount;
    }

}
