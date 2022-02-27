import java.util.*;
public class Main {
public static void main(String[] args) {

String alphabet = "abcdefghijklmnopqrstuvwxyz";

Scanner input = new Scanner(System.in);

System.out.print("Please enter input string: ");
String inputString = input.nextLine();

System.out.print("Please enter shift: ");
int shift = input.nextInt();

String outputString = "";

for (int i = 0; i < inputString.length(); i++) {

char ch = inputString.charAt(i);

if (Character.isLetter(ch)) {

int index = alphabet.indexOf(Character.toLowerCase(ch));

int newIndex = index+shift;

if (newIndex >= alphabet.length()) {

newIndex = newIndex - alphabet.length();
}

char newCh = alphabet.charAt(newIndex);

if (Character.isUpperCase(ch)) {
newCh = Character.toUpperCase(newCh);
}

outputString += newCh;
} else {

outputString += ch;
}
}

System.out.println("Result: " + outputString);
}
}