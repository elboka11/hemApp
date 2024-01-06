package services.patinets;

import entities.Patient;
import repositories.patients.PatientRepository;
import repositories.patients.PatientRepositoryImpl;

import java.util.List;

public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository = PatientRepositoryImpl.getInstance();
    private static PatientService patientService;

    private PatientServiceImpl() {
    }

    public static PatientService getInstance() {
        if (patientService == null) {
            patientService = new PatientServiceImpl();
        }
        return patientService;
    }

    @Override
    public List<Patient> readPatients() {
        return patientRepository.readPatients().orElseThrow();
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.createPatients(patient).orElseThrow();
    }
}
