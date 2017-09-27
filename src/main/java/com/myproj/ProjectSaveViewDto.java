package com.myproj;

import org.springframework.data.rest.core.config.Projection;


@Projection(name = "projectView", types = {Project.class})
public interface ProjectSaveViewDto {

    Long getProjectId();

    void setProjectId(Long projectId);

    String getTitle();

    void setTitle(String title);

}
