package com.elect.backich.controllers;

import com.elect.backich.dto.TextDTO;
import com.elect.backich.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/text")
public class TextController {

   @Autowired
   private TextService textService;

    @GetMapping("/get/all")
    public List<TextDTO> getAll(){
        return textService.getAllTexts();
    }

    @PostMapping("/add")
    public TextDTO addText(@RequestBody TextDTO dto){
        return textService.AddText(dto);
    }

    @GetMapping("/remove")
    public void removeText(@RequestParam long id){
        textService.RemoveText(id);
    }
}
