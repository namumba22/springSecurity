package com.myproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;


@RestController
public class ProjectViewFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectViewFacade.class);

    @Autowired
    private ConversionService conversionService;

    @RequestMapping(value = "/project", method = {RequestMethod.POST},
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ProjectSaveViewDto saveProject(@NotNull @RequestBody final ProjectSaveViewDto projectDto) {
        Project project = conversionService.convert(projectDto, Project.class);
        return conversionService.convert(project, ProjectSaveViewDto.class);
//        LOGGER.info("[saved] -> projectId: {};", saved.getProjectId());
    }

//    @RequestMapping(value = "/project/vote", method = {RequestMethod.POST})
//    public ProjectVoteViewDto voteProject(@NotNull @RequestBody ProjectVoteSaveDto projectVoteSaveDto) {
//        ProjectVote projectVote = projectService.voteForProject(projectVoteSaveDto.getProjectId(), projectVoteSaveDto.getVote());
//        return conversionService.convert(projectVote, ProjectVoteViewDto.class);
//    }

}
