

import java.util.HashSet;

class Solution {

    public int numUniqueEmails(String[] emails) {

        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {

            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            StringBuilder cleaned = new StringBuilder();

            for (int i = 0; i < local.length(); i++) {

                char ch = local.charAt(i);

                if (ch == '+') {
                    break;
                }

                if (ch != '.') {
                    cleaned.append(ch);
                }
            }

            String actualEmail = cleaned.toString() + "@" + domain;

            uniqueEmails.add(actualEmail);
        }

        return uniqueEmails.size();
    }
}
