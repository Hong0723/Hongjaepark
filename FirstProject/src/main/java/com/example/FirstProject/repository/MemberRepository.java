package com.example.FirstProject.repository;

import com.example.FirstProject.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member,Long> {
}
