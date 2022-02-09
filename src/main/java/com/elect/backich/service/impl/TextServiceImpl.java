package com.elect.backich.service.impl;


import com.elect.backich.dto.TextDTO;
import com.elect.backich.mappers.TextToTextDTOMapper;
import com.elect.backich.repositories.TextRepository;
import com.elect.backich.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextServiceImpl implements TextService {


    @Autowired private TextToTextDTOMapper textToTextDTOMapper;

    @Autowired private TextRepository textRepository;

    public List<TextDTO> getAllTexts() {
           return textRepository.findAll().stream().map(textToTextDTOMapper::toDTO).collect(Collectors.toList());
    }

    public TextDTO AddText(TextDTO dto) {
        return textToTextDTOMapper.toDTO(textRepository.save(textToTextDTOMapper.toEntity(dto)));
    }

    public void RemoveText(long id){
        textRepository.deleteById(id);
    }
}