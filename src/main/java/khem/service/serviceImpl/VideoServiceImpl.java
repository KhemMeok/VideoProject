package khem.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import khem.dto.VideoDTO;
import khem.mapper.VideoMapper;
import khem.model.VideoModel;
import khem.repository.VideoRepository;
import khem.service.VideoService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VideoServiceImpl implements VideoService{
    
    private final VideoRepository videosRepository;

    private final VideoMapper videosMapper;

    @Override
    public VideoModel save(VideoDTO entity) {
         return videosRepository.save(videosMapper.toVideosModel(entity));
    }

    @Override
    public VideoModel getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public VideoModel Update(Long id, VideoDTO source) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<VideoDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<VideoDTO> getCoursePage(Map<String, String> param) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCoursePage'");
    }    
}
