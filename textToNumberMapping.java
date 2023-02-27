import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class textToNumberMapping {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter words to convert to number: ");
		String input = scanner.nextLine();
		scanner.close();

		Map<String, Integer> wordToNumber = new HashMap<>();

		wordToNumber.put("sıfır", 0);
		wordToNumber.put("zero", 0);
		wordToNumber.put("bir", 1);
		wordToNumber.put("one", 1);
		wordToNumber.put("iki", 2);
		wordToNumber.put("two", 2);
		wordToNumber.put("üç", 3);
		wordToNumber.put("three", 3);
		wordToNumber.put("dört", 4);
		wordToNumber.put("four", 4);
		wordToNumber.put("beş", 5);
		wordToNumber.put("five", 5);
		wordToNumber.put("altı", 6);
		wordToNumber.put("six", 6);
		wordToNumber.put("yedi", 7);
		wordToNumber.put("seven", 7);
		wordToNumber.put("sekiz", 8);
		wordToNumber.put("eight", 8);
		wordToNumber.put("dokuz", 9);
		wordToNumber.put("nine", 9);
		wordToNumber.put("on", 10);
		wordToNumber.put("ten", 10);
		wordToNumber.put("yirmi", 20);
		wordToNumber.put("twenty", 20);
		wordToNumber.put("otuz", 30);
		wordToNumber.put("thirty", 30);
		wordToNumber.put("kırk", 40);
		wordToNumber.put("forty", 40);
		wordToNumber.put("elli", 50);
		wordToNumber.put("fifty", 50);
		wordToNumber.put("altmış", 60);
		wordToNumber.put("sixty", 60);
		wordToNumber.put("yetmiş", 70);
		wordToNumber.put("seventy", 70);
		wordToNumber.put("seksen", 80);
		wordToNumber.put("eighty", 80);
		wordToNumber.put("doksan", 90);
		wordToNumber.put("ninety", 90);


		Map<Integer, String> numberToWord = new HashMap<>();

		numberToWord.put(0,"sıfır");
		numberToWord.put(0,"zero");
		numberToWord.put(1,"bir");
		numberToWord.put(1,"one");
		numberToWord.put(2,"iki");
		numberToWord.put(2,"two");
		numberToWord.put(3,"üç");
		numberToWord.put(3,"three");
		numberToWord.put(4,"dört");
		numberToWord.put(4,"four");
		numberToWord.put(5,"beş");
		numberToWord.put(5,"five");
		numberToWord.put(6,"altı");
		numberToWord.put(6,"six");
		numberToWord.put(7,"yedi");
		numberToWord.put(7,"seven");
		numberToWord.put(8,"sekiz");
		numberToWord.put(8,"eight");
		numberToWord.put(9,"dokuz");
		numberToWord.put(9,"nine");
		numberToWord.put(10,"on");
		numberToWord.put(10,"ten");
		numberToWord.put(20,"yirmi");
		numberToWord.put(20,"twenty");
		numberToWord.put(30,"otuz");
		numberToWord.put(30,"thirty");
		numberToWord.put(40,"kırk");
		numberToWord.put(40,"forty");
		numberToWord.put(50,"elli");
		numberToWord.put(50,"fifty");
		numberToWord.put(60,"altmış");
		numberToWord.put(60,"sixty");
		numberToWord.put(70,"yetmiş");
		numberToWord.put(70,"seventy");
		numberToWord.put(80,"seksen");
		numberToWord.put(80,"eighty");
		numberToWord.put(90,"doksan");
		numberToWord.put(90,"ninety");
		numberToWord.put(100,"yüz");
		numberToWord.put(100,"hundred");
		numberToWord.put(1000,"bin");
		numberToWord.put(1000,"thousand");
		numberToWord.put(1000000,"milyon");
		numberToWord.put(1000000,"million");

		int result = 0;
		int temp = 0;
		boolean isFirst = true;
		
		for (String word : input.split("\\s+")) {
			Integer number = wordToNumber.get(word);
			System.out.println("Number: " + number);
			if (number != null) {
				temp += number;
				isFirst = false;
			}else if(isFirst == true && (word.equals("yüz") || word.equals("hundred"))) {
				result += 100;
				System.out.println("isFirst: 100 ");
			}else if(isFirst == true && (word.equals("bin") || word.equals("thousand"))) {
				result += 1000;
				System.out.println("isFirst: 1000 ");
			}else if(isFirst == true && (word.equals("milyon") || word.equals("million"))) {
				System.out.println("isFirst: 1000000 ");
				result += 1000000;
			}   
			else if (word.equals("yüz") || word.equals("hundred")) {
				temp *= 100;
			} else if (word.equals("bin") || word.equals("thousand")) {
				result += temp * 1000;
				temp = 0;
			} else if (word.equals("milyon") || word.equals("million")) {
				result += temp * 1000000;
				temp = 0;
			}
		}
		result += temp;
		
		System.out.println(result);
		
	}
}
