public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Deadpool & Wolverine");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(127);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Media de avaliacoes: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2010);
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(25);
        lost.setMinutosPorEpisodios(48);
        lost.exibeFichaTecnica();
        System.out.println("Duracao para maratonar a serie " + lost.getNome() + ": " + lost.getDuracaoEmMinutos() + " minutos");
    }
}