package services.patinets;

import entities.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> readPatients();
    Patient createPatient(Patient patient);
}
