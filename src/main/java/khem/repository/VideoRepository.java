package khem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import khem.model.VideoModel;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel,Long>, JpaSpecificationExecutor<VideoModel>{
    
}