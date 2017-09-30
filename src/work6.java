import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        String mustSplitString = "A,;B, C, D, E,F, G, H";
        String[] AfterSplit = mustSplitString.split("[,;\\s]+");
        for (int i = 0; i < AfterSplit.length; i++)
            System.out.println(AfterSplit[i]);
    }
}
