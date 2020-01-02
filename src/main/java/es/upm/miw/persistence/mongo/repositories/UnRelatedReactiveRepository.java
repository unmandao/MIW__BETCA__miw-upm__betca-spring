package es.upm.miw.persistence.mongo.repositories;

import es.upm.miw.persistence.mongo.documents.UnRelatedDocument;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UnRelatedReactiveRepository extends ReactiveSortingRepository<UnRelatedDocument, String> {

    Mono<UnRelatedDocument> findByNickIgnoreCase(String nick);

    Flux<UnRelatedDocument> findFirst3ByNickStartingWith(String prefix);

}