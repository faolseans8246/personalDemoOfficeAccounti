package com.example.personaldemooffice.homePage.signIn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// it is repository for work to connectring with database
@Repository
public interface SignInRepository extends JpaRepository<SignInTable, Long>, CrudRepository<SignInTable, Long> {
}
