package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.AbsInteractorGenerator

class InteractorGenerator(
    name: String,
    useEquatable: Boolean
) : AbsInteractorGenerator(name, useEquatable, templateName = "interactor") {
    override fun fileName() = "${snakeCase()}_interactor.${fileExtension()}"
}