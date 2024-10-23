package com.example.gemfirelookasidecache;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DemoRepository extends ListCrudRepository<DemoRecord, Integer> {
}
