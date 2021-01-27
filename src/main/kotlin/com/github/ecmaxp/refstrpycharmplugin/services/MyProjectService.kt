package com.github.ecmaxp.refstrpycharmplugin.services

import com.github.ecmaxp.refstrpycharmplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
