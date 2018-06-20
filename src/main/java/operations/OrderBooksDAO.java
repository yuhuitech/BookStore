package operations;
import basis.OrderBooks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderBooksDAO {
    List<OrderBooks> get(@Param("orderID") String orderID);

    int add(@Param("bookID") String bookID,
            @Param("orderID") String orderID,
            @Param("amount") int amount);

    int delete(@Param("bookID") String bookID);
}
