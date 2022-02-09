package com.elect.backich.service;


import com.elect.backich.dto.TextDTO;
import java.util.List;

public interface TextService
{
    List<TextDTO> getAllTexts();
    TextDTO AddText(TextDTO dto);
    void RemoveText(long id);
}
