import java.util.ArrayList;
import java.util.List;

public class Magazine implements IMagazine {
    List<String> newspapers =  new ArrayList<>();

    List<IReader> readers = new ArrayList<>();

    public void addNewspaper(String newspaper){
        this.newspapers.add(newspaper);
        notifyReaders();
    }

    public void removeNewspaper(String newspaper){
        this.newspapers.remove(newspaper);
        notifyReaders();
    }

    @Override
    public void addReader(IReader observer) {
        this.readers.add(observer);
    }

    @Override
    public void removeReader(IReader observer) {
        this.readers.remove(observer);
    }

    @Override
    public void notifyReaders() {
        for(IReader observer: readers){
            observer.readNewspaper(this.newspapers);
        }
    }
}
