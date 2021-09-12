package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.AbsInteractorGenerator

class InteractorImplGenerator(
    blocName: String,
    blocShouldUseEquatable: Boolean
) : AbsInteractorGenerator(blocName, blocShouldUseEquatable, templateName = "interactor_impl") {

    override fun fileName() = "${snakeCase()}_interactor_impl.${fileExtension()}"
}