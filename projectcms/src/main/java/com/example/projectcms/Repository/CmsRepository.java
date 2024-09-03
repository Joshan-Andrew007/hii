package com.example.projectcms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectcms.entity.CmsEntity;



public interface CmsRepository extends JpaRepository<CmsEntity,Long> {

}
