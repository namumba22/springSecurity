package com.myproj;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;

public class ProjectToViewDtoConverter implements Converter<Project, ProjectSaveViewDto> {

    private final SpelAwareProxyProjectionFactory projectionFactory;

    public ProjectToViewDtoConverter(final SpelAwareProxyProjectionFactory projectionFactory) {
        this.projectionFactory = projectionFactory;
    }

    public ProjectSaveViewDto convert(final Project source) {
        return this.projectionFactory.createProjection(ProjectSaveViewDto.class, source);
    }

}
