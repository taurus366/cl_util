package com.aiolds.cl_util.model.entity;

import java.util.List;

public interface BaseInterface<T> {

    void create(T entity);
    void update(T entity);
    void deleteById(Long id);
    List<T> getAll();
}
