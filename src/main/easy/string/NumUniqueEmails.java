package main.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Every email consists of a local name and a domain name, separated by the @ sign.

 For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

 Besides lowercase letters, these emails may contain '.'s or '+'s.

 If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

 If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

 It is possible to use both of these rules at the same time.

 Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 *
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class NumUniqueEmails {
    /**
     * Runtime: 39 ms, faster than 45.91% of Java online submissions for Unique Email Addresses.
     * Memory Usage: 29.1 MB, less than 25.52% of Java online submissions for Unique Email Addresses.
     * @param emails  ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
     * @return Output: 2
          Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
     */
    public int numUniqueEmails(String[] emails) {
        Set<String> ret = new HashSet<>();

        for(String email : emails) {
            String localName = email.split("@")[0];
            String domainName = email.split("@")[1];

            String newLocalName = localName.split("\\+")[0].replaceAll("\\.","");
            ret.add(newLocalName+"@"+domainName);
        }

        return ret.size();

    }

}
