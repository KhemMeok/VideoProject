package khem.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import khem.dto.VideoDTO;
import khem.model.VideoModel;

public interface VideoService {
    VideoModel save(VideoDTO dto);
    VideoModel getById(Long id);
    VideoModel Update(Long id,VideoDTO source);
    void delete(Long id);
    List<VideoDTO> findAll();
    Page<VideoDTO> getCoursePage(Map<String,String> param);
}
