package com.fitnesscalc.profile;

import com.fitnesscalc.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>  {
    Optional<Profile> findByUserId(Long userId);
}
