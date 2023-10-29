public class readMagazine {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();

        magazine.addNewspaper("First newspaper");
        magazine.addNewspaper("Second newspaper");

        IReader firstReader = ReaderFactory.createReader("Roman");
        IReader secondReader = ReaderFactory.createReader("Masha");

        magazine.addReader(firstReader);
        magazine.addReader(secondReader);

        magazine.addNewspaper("Third newspaper out!");
    }
}
