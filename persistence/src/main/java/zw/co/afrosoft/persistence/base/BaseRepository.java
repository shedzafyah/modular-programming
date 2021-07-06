package zw.co.afrosoft.persistence.base;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;

@NoRepositoryBean
public interface BaseRepository<T>  extends JpaRepository<T,Long> {
}
