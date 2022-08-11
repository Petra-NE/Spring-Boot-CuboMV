package br.com.hospital.hpem.service;

import br.com.hospital.hpem.models.Paciente;
import br.com.hospital.hpem.respositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> getPacientes(){
        return pacienteRepository.findAll();

    }


}
