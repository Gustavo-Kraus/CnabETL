package dev.desafio.cnab.controller;


import dev.desafio.cnab.model.Transacao;
import dev.desafio.cnab.service.CnabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/cnab")
public class CnabController {

    @Autowired
    private CnabService cnabService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file) {
        cnabService.arquivoProcessar(file);
        return ResponseEntity.ok("arquivo processado!");
    }

    @GetMapping("/transacao")
    public List<Transacao> listarTransacoes(@RequestParam String param) {
        return cnabService.listarTransacoes();
    }
}
