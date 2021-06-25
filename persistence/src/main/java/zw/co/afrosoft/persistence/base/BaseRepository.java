package zw.co.afrosoft.persistence.base;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;
import zw.co.afrosoft.domain.base.*;

public interface BaseRepository<T> extends JpaRepository<BaseEntity,Long> {
}
