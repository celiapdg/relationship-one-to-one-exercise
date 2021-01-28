package com.ironhack.relationshipex.repository;

import com.ironhack.relationshipex.model.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacultyRepositoryTest {

    @Autowired
    OfficeRepository officeRepository;
    @Autowired
    FacultyRepository facultyRepository;

    @BeforeEach
    void setUp() {
        Office office = new Office(13,"C1");
        officeRepository.save(office);
        Faculty faculty = new Faculty("Pepe", "Escobar", "Biochemistry", false, office);
        facultyRepository.save(faculty);
    }

    @AfterEach
    void tearDown() {
        facultyRepository.deleteAll();
        officeRepository.deleteAll();
    }
}