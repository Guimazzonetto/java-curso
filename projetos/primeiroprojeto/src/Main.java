public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top Gun: Maverick");

		int anoDeLancamento = 2022;
		/*boolean inclusoNoPlano = true;
		double notaDoFilme = 8.1;*/

		System.out.println("Ano de lançamento: " + anoDeLancamento);

		double media = (9.8 + 6.3 + 8.0) / 3;

		System.out.println(media);

		String sinopse;
		sinopse = """
		Filme: Top Gun
		Gênero: Aventura
		Muito bom!
		Ano de lançamento: %d
		""".formatted(anoDeLancamento);
		System.out.println(sinopse);

		int classificacao = (int) (media / 2);
		System.out.println(classificacao);
	}
}
