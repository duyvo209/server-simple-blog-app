package com.example.demo.repository;

import com.example.demo.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Long> {
    @Query(value = "SELECT * FROM likes", nativeQuery = true)
    public List<Like> getIdBlog();

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM likes WHERE id_user = ?1 AND id_blog = ?2", nativeQuery = true)
    public List<Like> findByLike(long id_user, long id_blog);
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM likes  WHERE id_user = ?1 AND id_blog = ?2", nativeQuery = true)
    public void delByLike(long id_user, long id_blog);
    
}
