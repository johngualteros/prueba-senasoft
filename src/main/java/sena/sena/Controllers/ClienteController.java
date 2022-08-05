package sena.sena.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import sena.sena.Models.Services.IClienteService;

@Controller
@SessionAttributes("cliente")
@RequestMapping("/clientes")
public class ClienteController {

   
}
