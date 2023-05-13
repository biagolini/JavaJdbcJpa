package br.edu.ifsp.spo.contatos.controller;

import br.edu.ifsp.spo.contatos.dto.ContatoDto;
import br.edu.ifsp.spo.contatos.repository.ContatoJdbcRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/contato")
@AllArgsConstructor
public class ContatoController {

    private final ConversionService conversionService;

    private final ContatoJdbcRepository contatoJdbcRepository;

    @GetMapping
    public @ResponseBody
    Page<ContatoDto> findAllPaginated(
            @PageableDefault(sort = "id", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable pageable
    ) {
        List<ContatoDto> contatoDtoList = this.contatoJdbcRepository
                .findAll()
                .stream()
                .map(entity -> this.conversionService.convert(entity, ContatoDto.class))
                .collect(Collectors.toList());

        int start = (int) pageable.getOffset();

        int end = Math.min((start + pageable.getPageSize()), contatoDtoList.size());

        return new PageImpl<>(contatoDtoList.subList(start, end), pageable, contatoDtoList.size());
    }
}