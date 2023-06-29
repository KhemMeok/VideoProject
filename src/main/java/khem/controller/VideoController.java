package khem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import khem.dto.VideoDTO;
import khem.exceptionHandle.ApiException;
import khem.mapper.VideoMapper;
import khem.model.VideoModel;
import khem.service.VideoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/videos")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService service;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody VideoDTO videosDTO) throws ApiException{
        VideoModel videos = service.save(videosDTO);
        return ResponseEntity.ok().body(VideoMapper.INSTANCE.toVIdeoDTO(videos));
    }
}
