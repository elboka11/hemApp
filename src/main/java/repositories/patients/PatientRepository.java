package repositories.patients;

import entities.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    Optional<List<Patient>> readPatients();
    Optional<Patient> createPatients(Patient patient);
}
