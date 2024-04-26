package peter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peter.models.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}