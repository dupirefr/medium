package com.fdpro.blogs.medium.behaviour_parameterization;

public interface Behaviour<T> {

    boolean matches(T input);
}
