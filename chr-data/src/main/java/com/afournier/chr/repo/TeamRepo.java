package com.afournier.chr.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.afournier.chr.model.Team;

public interface TeamRepo extends PagingAndSortingRepository<Team, Long>{

}
