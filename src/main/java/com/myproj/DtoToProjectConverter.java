package com.myproj;

import org.springframework.core.convert.converter.Converter;

public class DtoToProjectConverter implements Converter<ProjectSaveViewDto,Project> {

    public Project convert(ProjectSaveViewDto source) {
        Project project = new Project();
        project.setProjectId(source.getProjectId());
        project.setTitle(source.getTitle());
        return project;
    }
}
