package controllers.patients;

import entities.Patient;
import mappers.PatientMapper;
import services.patinets.PatientService;
import services.patinets.PatientServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/patients/create")
public class CreatePatientsController extends HttpServlet {
    private static final String CREATE_PATIENTS_PAGE = "/pages/patients/patientsCreate.jsp";
    private final PatientService patientService = PatientServiceImpl.getInstance();
    private final PatientMapper patientMapper = new PatientMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(CREATE_PATIENTS_PAGE).forward(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Patient patient = patientMapper.patientBuilder(req);
        patientService.createPatient(patient);
        req.getRequestDispatcher("/patients/read").forward(req, resp);
    }
}
