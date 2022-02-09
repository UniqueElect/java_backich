package com.elect.backich.mappers;

import com.elect.backich.dto.TextDTO;
import com.elect.backich.entity.Text;
import org.springframework.stereotype.Component;

@Component
public class TextToTextDTOMapper
{
    public Text toEntity(final TextDTO textDTO)
    {
        final Text text = new Text();
        text.setId(textDTO.getId());
        text.setText(textDTO.getText());
        return text;
    }

    public TextDTO toDTO(final Text text)
    {
        final TextDTO textDTO = new TextDTO();
        textDTO.setId(text.getId());
        textDTO.setText(text.getText());
        return textDTO;
    }
}
