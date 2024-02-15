package outrosTopicos;

public class ManipulacaoString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase(); // formatar para minusculo
		String s02 = original.toUpperCase(); // formatar para maisculo
		String s03 = original.trim(); // tirar espaço no final
		String s04 = original.substring(2); // substring inicio(2)
		String s05 = original.substring(2, 9); // substring inicio(2) termino(8)
		String s06 = original.replace('a', 'x'); // trocando a por x
		String s07 = original.replace("abc", "xy"); // trocando adc por xy
		int i = original.indexOf("bc"); // buscar primeira posicao que achar "bc"
		int j = original.lastIndexOf("bc"); // buscar ultima posicao que achar "bc"

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "potato apple lemon";

		String[] vect = s.split(" ");// recortar a string com base no separador " "
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
