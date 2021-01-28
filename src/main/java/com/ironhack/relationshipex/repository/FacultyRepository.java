package com.ironhack.relationshipex.repository;

import com.ironhack.relationshipex.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
