package com.example.personaldemooffice.homePage.dashboard.repositories;

import com.example.personaldemooffice.homePage.signUp.SignUpRepository;
import com.example.personaldemooffice.homePage.signUp.SignUpTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashRepositories extends JpaRepository<SignUpTable, Long>, CrudRepository<SignUpTable, Long> {
}
