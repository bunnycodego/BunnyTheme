package com.github.bunnycodego.bunnytheme.services

import com.intellij.openapi.project.Project
import com.github.bunnycodego.bunnytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
