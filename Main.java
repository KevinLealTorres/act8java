class Main {
    public static void main(String[] args) {
        // ----- inicio de pruebas -----
        Deck deck = new Deck(); // Crea un nuevo mazo de cartas.

        deck.shuffle();
        deck.head(); 
        deck.pick(); 
        deck.hand(); 
        // ----- fin de pruebas -----

    }
}