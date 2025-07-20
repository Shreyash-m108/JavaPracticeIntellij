package college;
public class Columnar {

        public static String selectedKey;
        public static char[] sortedKey;
        public static int[] sortedKeyPos;
        public Columnar()
        {
            selectedKey = "megabuck";
            sortedKeyPos = new int[selectedKey.length()];
            sortedKey = selectedKey.toCharArray();
        }

        public Columnar(String GeeksForGeeks)
        {
            selectedKey = GeeksForGeeks;
            sortedKeyPos = new int[selectedKey.length()];
            sortedKey = selectedKey.toCharArray();
        }

        public static void doProcessOnKey()
        {

            int min, i, j;
            char[] orginalKey = selectedKey.toCharArray();
            char temp;


            for (i = 0; i < selectedKey.length(); i++) {
                min = i;
                for (j = i; j < selectedKey.length(); j++) {
                    if (sortedKey[min] > sortedKey[j]) {
                        min = j;
                    }
                }

                if (min != i) {
                    temp = sortedKey[i];
                    sortedKey[i] = sortedKey[min];
                    sortedKey[min] = temp;
                }
            }


            for (i = 0; i < selectedKey.length(); i++) {
                for (j = 0; j < selectedKey.length(); j++) {
                    if (orginalKey[i] == sortedKey[j])
                        sortedKeyPos[i] = j;
                }
            }
        }


        public static String doEncryption(String plainText)
        {
            doProcessOnKey();

            // Step 3: Generating the encrypted message by
            // doing encryption using Transpotion Cipher
            int row = plainText.length() / selectedKey.length();
            int extrabit
                    = plainText.length() % selectedKey.length();
            int exrow = (extrabit == 0) ? 0 : 1;
            int coltemp = -1;
            int totallen = (row + exrow) * selectedKey.length();
            char[][] pmat = new char[(row + exrow)]
                    [(selectedKey.length())];
            char[] encry = new char[totallen];

            row = 0;

            for (int i = 0; i < totallen; i++) {
                coltemp++;
                if (i < plainText.length()) {
                    if (coltemp == (selectedKey.length())) {
                        row++;
                        coltemp = 0;
                    }
                    pmat[row][coltemp] = plainText.charAt(i);
                }

                else {


                    pmat[row][coltemp] = '-';
                }
            }

            int len = -1, k;

            for (int i = 0; i < selectedKey.length(); i++) {
                for (k = 0; k < selectedKey.length(); k++) {
                    if (i == sortedKeyPos[k]) {
                        break;
                    }
                }
                for (int j = 0; j <= row; j++) {
                    len++;
                    encry[len] = pmat[j][k];
                }
            }

            String p1 = new String(encry);
            return (p1);
        }


        public static String doDecryption(String s)
        {
            int  i, j, k;
            char[] encry = s.toCharArray();

            doProcessOnKey();

            int row = s.length();
            selectedKey.length();
            char[][] pmat
                    = new char[row][(selectedKey.length())];
            int tempcnt = -1;

            for (i = 0; i < selectedKey.length(); i++) {
                for (k = 0; k < selectedKey.length(); k++) {
                    if (i == sortedKeyPos[k]) {
                        break;
                    }
                }

                for (j = 0; j < row; j++) {
                    tempcnt++;
                    pmat[j][k] = encry[tempcnt];
                }
            }

            // Step 5: Storing matrix character in
            // to a single string
            char[] p1 = new char[row * selectedKey.length()];

            k = 0;
            for (i = 0; i < row; i++) {
                for (j = 0; j < selectedKey.length(); j++) {
                    if (pmat[i][j] != '*') {
                        p1[k++] = pmat[i][j];
                    }
                }
            }

            p1[k++] = '\0';
            return (new String(p1));
        }

        @SuppressWarnings("static-access")

        // Method 4 - main()
        // Main driver method
        public static void main(String[] args)
        {
            // Creating object of class in main method
            Columnar tc = new Columnar();

            // Printing the ciphere text
            // Custom input - Hello Geek
            System.out.println("Cipher Text : "
                    + tc.doEncryption("Shreyash"));
        }

}
