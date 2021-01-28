package com.ironhack.relationshipex.repository;

import com.ironhack.relationshipex.model.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OfficeRepositoryTest {

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

    @Test
    void findByFacultyLastName(){
        List<Office> officeList = officeRepository.findByFacultyLastName("Escobar");
        if (officeList.get(0)!=null){
            assertEquals("C1", officeList.get(0).getBuilding());
            assertEquals("Pepe", officeList.get(0).getFaculty().getFirstName());
        }else{
            fail();
        }
    }
}