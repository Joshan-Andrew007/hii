package com.example.projectcms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectcms.entity.CmsEntity;
import com.example.projectcms.service.CmsService;

@RestController
@RequestMapping("/api/campaigns")

public class CmsController {
    @Autowired
    private CmsService cmsService; 

    @GetMapping("/")
    public List<CmsEntity> getAllCampaigns() {
        return cmsService.getAllCampaigns();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CmsEntity> getCampaignById(@PathVariable Long id) {
        Optional<CmsEntity> campaign = cmsService.getCampaignById(id);
        return campaign.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CmsEntity> createCampaign(@RequestBody CmsEntity cmsEntity) {
        return ResponseEntity.ok(cmsService.createCampaign(cmsEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CmsEntity> updateCampaign(@PathVariable Long id, @RequestBody CmsEntity cmsEntity) {
        if (!cmsService.getCampaignById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        cmsEntity.setCampaign_id(id);
        return ResponseEntity.ok(cmsService.createCampaign(cmsEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCampaign(@PathVariable Long id) {
        if (!cmsService.getCampaignById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        cmsService.deleteCampaign(id);
        return ResponseEntity.noContent().build();
    }


}
