import java.util.*;

import javax.print.StreamPrintService;

public class Roman {
    char[] array;

    public static void main(String[] args) {
        HashMap<Character, Integer> book = new HashMap<>();

        book.put('I', 1);
        book.put('V', 5);
        book.put('X', 10);
        book.put('L', 50);
        book.put('C', 100);
        book.put('D', 500);
        book.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        String var = scanner.nextLine();

        char[] array = var.toCharArray();

        int suma = 0;
        int sumb = 0;

        int i = 0;
        int[] lib = new int[array.length];

        for (char c : array) {
            char z = c;
            for (char d : book.keySet()) {
                if (z == d) {
                    // suma = suma + book.get(d);
                    lib[i] = book.get(d);
                    i++;
                }
            }
        }

       

        try {
            //incomplete
            for (int j = 0; j < lib.length ; j++) {
                
                if (lib[j] >= lib[j+1]) {
                    suma = suma + lib[j];
                    System.out.println("SUM A:" + suma);
                } else {
                    sumb = lib[j+1] - lib[j];
                    System.out.println("SUM B:" + sumb);
                }
                
            }
        } catch (Exception e) {
            //TODO: handle exception
        }

        

        System.out.println(suma + sumb);

    }

}
