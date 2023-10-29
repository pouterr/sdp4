import java.util.List;

public class Reader implements IReader {
    String username;

    public Reader(String username){
        this.username = username;
    }
    @Override
    public void readNewspaper(List<String> newspapers) {
        System.out.println(username + ", We have newspapers you haven't read yet:" + newspapers +
                "\n==================================\n");
    }
}
