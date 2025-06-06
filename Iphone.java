public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no iPhone...");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada com o iPhone...");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando na internet pelo iPhone...");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.tocarMusica();
        meuIphone.fazerChamada();
        meuIphone.navegar();
    }
}
