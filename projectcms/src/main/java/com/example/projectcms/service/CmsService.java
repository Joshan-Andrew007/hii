package com.example.projectcms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectcms.Repository.CmsRepository;
import com.example.projectcms.entity.CmsEntity;
@Service
public class CmsService {
    @Autowired
    private CmsRepository cmsRepository;


    public List<CmsEntity> getAllCampaigns() {
        return cmsRepository.findAll();
    }

    public Optional<CmsEntity> getCampaignById(Long id) {
        return cmsRepository.findById(id);
    }

    public CmsEntity updateCampaign(CmsEntity cmsEntity) {
        return cmsRepository.save(cmsEntity);
    }

    public void deleteCampaign(Long id) {
        cmsRepository.deleteById(id);
    }
    public CmsEntity createCampaign(CmsEntity cmsEntity) {
        return cmsRepository.save(cmsEntity);
    }

}



