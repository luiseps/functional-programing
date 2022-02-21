package funcioninterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getConnectionUrls.get());

    }

    static Supplier<List<String>> getConnectionUrls = ()
            -> List.of(
            "jdbc://localhost:5443/users",
            "jdbc://localhost:5443/items");

}
