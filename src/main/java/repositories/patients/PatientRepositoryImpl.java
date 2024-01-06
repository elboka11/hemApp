package repositories.patients;

import entities.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PatientRepositoryImpl implements PatientRepository {
    private final List<Patient> patients = new ArrayList<>();
    private static PatientRepository patientRepository;

    private PatientRepositoryImpl() {
        patients.add(new Patient(1L, "14AC5514", "Sasha", "Mokhamedov", 35, "ophthalmology"));
        patients.add(new Patient(2L, "AU13BC45", "Maga", "davidov", 35, "ophthalmology"));
        patients.add(new Patient(3L, "AB34R76C", "mariea", "Mokhamedov", 35, "ophthalmology"));
        patients.add(new Patient(4L, "65SV12RT", "Natalia", "Mokhamedov", 35, "ophthalmology"));
        patients.add(new Patient(5L, "11AD66CV", "Mark", "Mokhamedov", 35, "ophthalmology"));
    }

    public static PatientRepository getInstance() {
        if (patientRepository == null) {
            patientRepository = new PatientRepositoryImpl();
        }
        return patientRepository;
    }

    @Override
    public Optional<List<Patient>> readPatients() {
        return Optional.of(patients);
    }

    @Override
    public Optional<Patient> createPatients(Patient patient) {
        patient.setPatientId((long) (patients.size() + 1));
        patients.add(patient);
        return Optional.of(patient);
    }
}
