package shop.watchawiki.api.plex.repository;

import shop.watchawiki.api.plex.domain.Plex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlexRepository extends JpaRepository<Plex, Long> {
}
