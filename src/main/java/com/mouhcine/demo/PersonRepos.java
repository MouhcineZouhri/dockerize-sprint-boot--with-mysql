package com.mouhcine.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepos extends JpaRepository<Person , Long> {
}
