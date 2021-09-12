package com.bloc.intellij_generator_plugin.generator

import com.bloc.intellij_generator_plugin.generator.components.InteractorImplGenerator
import com.bloc.intellij_generator_plugin.generator.components.InteractorGenerator

object BlocGeneratorFactory {
    fun getBlocGenerators(name: String, useEquatable: Boolean): List<com.bloc.intellij_generator_plugin.generator.AbsInteractorGenerator> {
        val interactor = InteractorGenerator(name, useEquatable)
        val interactorImpl = InteractorImplGenerator(name, useEquatable)
//        val state = BlocStateGenerator(name, useEquatable)
        return listOf(interactor, interactorImpl)
    }
}