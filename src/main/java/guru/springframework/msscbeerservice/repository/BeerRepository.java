package guru.springframework.msscbeerservice.repository;

import guru.springframework.msscbeerservice.model.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by michael on 2021-12-21.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
