public class readMagazine {
    public static void main(String[] args){
        Magazine magazine = new Magazine();

        magazine.addNewspaper("First newspaper");
        magazine.addNewspaper("Second newspaper");

        Reader firstReader = new Reader("Roman");
        Reader secondReader = new Reader("Masha");

        magazine.addReader(firstReader);
        magazine.addReader(secondReader);

        magazine.addNewspaper("Third newspaper out!");
    }
}
