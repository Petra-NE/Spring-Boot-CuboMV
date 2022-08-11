package br.com.hospital.hpem.form;




import br.com.hospital.hpem.models.Medico;
import br.com.hospital.hpem.models.Paciente;
import br.com.hospital.hpem.service.MedicoService;
import com.sun.istack.NotNull;

public class PacienteForm {

    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    private int idade;
    @NotNull
    private String nomeMedico;

}
