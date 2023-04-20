package com.thetechniciansteam.bookmyshow.repositories;

import com.thetechniciansteam.bookmyshow.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Theatre, String> {
}
