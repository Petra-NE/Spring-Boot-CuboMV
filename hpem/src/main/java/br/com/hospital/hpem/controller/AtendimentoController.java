package br.com.hospital.hpem.controller;
import br.com.hospital.hpem.dto.PacienteDto;
import br.com.hospital.hpem.form.PacienteForm;
import br.com.hospital.hpem.models.Medico;
import br.com.hospital.hpem.models.Paciente;
import br.com.hospital.hpem.respositories.PacienteRepository;
import br.com.hospital.hpem.service.MedicoService;
import br.com.hospital.hpem.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/api/v1/atendimento")
public class AtendimentoController {

    @Autowired
    PacienteService pacienteService;

    @Autowired
    MedicoService medicoService;


    @GetMapping("/pacientes")
    public List<PacienteDto> lista() {

        List<Paciente> pacienteList = new ArrayList<>();
        pacienteList = pacienteService.getPacientes();
        return PacienteDto.converter(pacienteList);
    }


    @GetMapping("/medicos")
    public List<Medico> listaMedicos() {

        List<Medico> medicosList = new ArrayList<>();
        medicosList = medicoService.getMedico();
        return medicosList;

    }

//    @PostMapping
//    @Transactional
//    public ResponseEntity<PacienteDto> cadastrar(@RequestBody @Validated PacienteForm form) {
//
//
//        return null;
//    }
}