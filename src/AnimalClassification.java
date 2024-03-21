import java.util.Scanner;

public class AnimalClassification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] words = new String[3];
		String animal = null;

		for (int i = 0; i < words.length; i++) {
			words[i] = sc.next();
		}

		if (words[0].equals("vertebrado")) {
			if (words[1].equals("ave")) {
				if (words[2].equals("carnivoro")) {
					animal = "aguia";
				} else {
					animal = "pomba";
				}
			} else if (words[1].equals("mamifero")) {
				if (words[2].equals("onivoro")) {
					animal = "homem";
				} else {
					animal = "vaca";
				}
			}
		} else {
			if (words[1].equals("inseto")) {
				if (words[2].equals("hematofago")) {
					animal = "pulga";
				} else {
					animal = "lagarta";
				}
			} else {
				if (words[2].equals("hematofago")) {
					animal = "sanguessuga";
				} else {
					animal = "minhoca";
				}
			}
		}

		System.out.println(animal);
		
		sc.close();
	}
}
