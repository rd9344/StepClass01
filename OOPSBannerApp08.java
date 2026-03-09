/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing the Collections Framework
 * to manage character patterns using a HashMap. The application
 * retrieves and displays the "OOPS" banner using these mappings.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp08 {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });
        charMap.put('P', new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        });

        charMap.put('S', new String[]{
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "   **",
                "   **",
                "**** "
        });

        charMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}