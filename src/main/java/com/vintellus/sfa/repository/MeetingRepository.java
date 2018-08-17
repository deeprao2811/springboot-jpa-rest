package com.vintellus.sfa.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.vintellus.sfa.model.Meeting;

@Repository
public interface MeetingRepository extends CrudRepository<Meeting, Long>{

}
