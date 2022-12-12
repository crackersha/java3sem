package prak7.task7and8;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[20];
        printables[0] = new Book("War and Piece");
        printables[1] = new Magazine("Esquire");
        printables[2] = new Book("For Whom The Bell Tolls");
        printables[3] = new Book("Do Androids Dream of Electric Sheep");
        printables[4] = new Magazine("Play Boy");
        printables[5] = new Book("Crime and Punishment");
        printables[6] = new Magazine("Murzilka");
        printables[7] = new Book("Don Quixote");
        Book.printBooks(printables);
    }
}