public class Main {

    public static String concatenateStrings(String str1, String str2, String str3, String str4) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        int len4 = str4.length();

        char[] fullName = new char[len1 + len2 + len3 + len4 + 3];

        int i = 0;

        for (int j = 0; j < len1; j++) {
            fullName[i] = str1.charAt(j);
            i++;
        }
        fullName[i++] = ' ';

        for (int j = 0; j < len2; j++) {
            fullName[i] = str2.charAt(j);
            i++;
        }
        fullName[i++] = ' ';

        for (int j = 0; j < len3; j++) {
            fullName[i] = str3.charAt(j);
            i++;
        }
        fullName[i++] = ' ';

        for (int j = 0; j < len4; j++) {
            fullName[i] = str4.charAt(j);
            i++;
        }

        return new String(fullName);
    }

    public static void main(String[] args) {
        String str1 = "JAMES";
        String str2 = "JASON";
        String str3 = "C.";
        String str4 = "PABUNA";

        String fullName = concatenateStrings(str1, str2, str3, str4);
        System.out.println("Full Name: " + fullName);
    }
    }